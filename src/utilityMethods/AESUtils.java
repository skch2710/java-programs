package utilityMethods;

import java.util.Base64;

import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;

public class AESUtils {

	private static final String ENCRYPTION_KEY = "U2F0aGlzaEt1bWFyQ2gyNw==";
	private static final String AES_PADDING = "AES/ECB/PKCS5Padding";
	private static final String AES = "AES";

	public static String encrypt(String data) {
		String result = "";
		try {
			if (data != null && !data.isBlank()) {
				Cipher cipher = Cipher.getInstance(AES_PADDING);
				cipher.init(Cipher.ENCRYPT_MODE, getSecretKeySpec());
				byte[] encryptedBytes = cipher.doFinal(data.getBytes());
				result = Base64.getEncoder().encodeToString(encryptedBytes);
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
				cipher.init(Cipher.DECRYPT_MODE, getSecretKeySpec());
				byte[] decryptedBytes = cipher.doFinal(Base64.getDecoder().decode(ciphertext));
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
