package hashtest;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Base64;

public class HashingTest {
	
	public static String hash(String value) {
	    try {
	        MessageDigest md = MessageDigest.getInstance("SHA-256");
	        byte[] digest = md.digest(value.getBytes(StandardCharsets.UTF_8));
	        return Base64.getEncoder().encodeToString(digest);
	    } catch (Exception e) {
	        throw new RuntimeException(e);
	    }
	}
	
	public static void main(String[] args) {
		
		String text = "2564789651";
		
		String textHash = hash(text);
		
		System.out.println(textHash);
		
	}

}
