package utilityMethods;

import java.util.Base64;
import java.util.UUID;

public class EncodeDecode {

	public static void main(String[] args) {
		
		String encoded = new String(Base64.getEncoder().encode("Sathish_Ch@2710#".getBytes()));
		
		System.out.println(encoded);
		
		String decode = new String(Base64.getDecoder().decode("U2F0aGlzaEt1bWFyQ2gyNw==".getBytes()));
		
		System.out.println(decode);
		
		String uuid = UUID.randomUUID().toString().split("-")[0];
		
		System.out.println(uuid);
		
		Long timeMilli = System.currentTimeMillis();
		
		String link = "https://localhost:8080/createPassword?uuid="+ AESUtils.encrypt("00f135bc#1730022844021");
		
		System.out.println(link);
		
		System.out.println(AESUtils.decrypt("Re5gKylnPQkejtqN4bKOwzNPr6ZBZLqd9PjCSNQH7fod1N4="));
		
	}

}
