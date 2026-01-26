package hashtest;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Base64;

import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;

public class HashingTest {
	
	public static final String HMAC_SHA256 = "HmacSHA256";
	
	public static String hash(String value) {
	    try {
	        MessageDigest md = MessageDigest.getInstance("SHA-256");
	        byte[] digest = md.digest(value.getBytes(StandardCharsets.UTF_8));
	        return Base64.getEncoder().encodeToString(digest);
	    } catch (Exception e) {
	        throw new RuntimeException(e);
	    }
	}
	
	public static String hmacSha256(String value, String secretKey) {
		try {
			Mac mac = Mac.getInstance(HMAC_SHA256);
			SecretKeySpec keySpec = new SecretKeySpec(secretKey.getBytes(StandardCharsets.UTF_8), HMAC_SHA256);
			mac.init(keySpec);
			byte[] hmacBytes = mac.doFinal(value.getBytes(StandardCharsets.UTF_8));
			return Base64.getEncoder().encodeToString(hmacBytes);
		} catch (Exception e) {
			throw new RuntimeException("Failed to generate HMAC-SHA256", e);
		}
	}
	
	public static void main(String[] args) {
		
		String text = "skch2710";
		
		String textHash = hash(text);
		
		System.out.println(textHash);
		
		System.out.println(hmacSha256("skch2710","sBItPCWruByu92lQHYy+IUfZVn/W2Qec0QgWHwHZwAw="));
		
	}

}
