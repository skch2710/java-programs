package utilityMethods;

import java.nio.ByteBuffer;
import java.security.SecureRandom;
import java.util.Base64;

import javax.crypto.Cipher;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class AESUtils {

    private static final String ENCRYPTION_KEY = "U2F0aGlzaEt1bWFyQ2gyNw==";
    private static final String AES_PADDING = "AES/GCM/NoPadding";
    private static final String AES = "AES";
    private static final int GCM_IV_LENGTH = 12; // 12 bytes recommended for GCM
    private static final int GCM_TAG_LENGTH = 128; // 128-bit authentication tag length in bits

    public static String encrypt(String data) {
        String result = "";
        try {
            if (data != null && !data.isBlank()) {
                Cipher cipher = Cipher.getInstance(AES_PADDING);

                // Generate a random IV
                byte[] iv = new byte[GCM_IV_LENGTH];
                SecureRandom secureRandom = new SecureRandom();
                secureRandom.nextBytes(iv);
                GCMParameterSpec gcmSpec = new GCMParameterSpec(GCM_TAG_LENGTH, iv);

                cipher.init(Cipher.ENCRYPT_MODE, getSecretKeySpec(), gcmSpec);
                byte[] encryptedBytes = cipher.doFinal(data.getBytes());

                // Combine IV and encrypted data for output
                ByteBuffer byteBuffer = ByteBuffer.allocate(GCM_IV_LENGTH + encryptedBytes.length);
                byteBuffer.put(iv);
                byteBuffer.put(encryptedBytes);

                result = Base64.getEncoder().encodeToString(byteBuffer.array());
            }
        } catch (Exception e) {
            System.err.println("Encryption error: " + e.getMessage());
        }
        return result;
    }

    public static String decrypt(String ciphertext) {
        String result = "";
        try {
            if (ciphertext != null && !ciphertext.isBlank()) {
                Cipher cipher = Cipher.getInstance(AES_PADDING);

                // Decode the base64-encoded input
                byte[] cipherTextBytes = Base64.getDecoder().decode(ciphertext);

                // Extract the IV and the encrypted data
                ByteBuffer byteBuffer = ByteBuffer.wrap(cipherTextBytes);
                byte[] iv = new byte[GCM_IV_LENGTH];
                byteBuffer.get(iv);
                byte[] encryptedBytes = new byte[byteBuffer.remaining()];
                byteBuffer.get(encryptedBytes);

                GCMParameterSpec gcmSpec = new GCMParameterSpec(GCM_TAG_LENGTH, iv);
                cipher.init(Cipher.DECRYPT_MODE, getSecretKeySpec(), gcmSpec);

                byte[] decryptedBytes = cipher.doFinal(encryptedBytes);
                result = new String(decryptedBytes);
            }
        } catch (Exception e) {
            System.err.println("Decryption error: " + e.getMessage());
        }
        return result;
    }

    public static SecretKeySpec getSecretKeySpec() {
        SecretKeySpec secretKey = null;
        try {
            byte[] key = Base64.getDecoder().decode(ENCRYPTION_KEY);
            secretKey = new SecretKeySpec(key, AES);
        } catch (Exception e) {
            System.err.println("SecretKeySpec error: " + e.getMessage());
        }
        return secretKey;
    }
}
