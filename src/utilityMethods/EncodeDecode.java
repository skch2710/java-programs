package utilityMethods;

import java.util.Base64;

public class EncodeDecode {

	public static void main(String[] args) {
		
		String encoded = new String(Base64.getEncoder().encode("SathishKumarCh27".getBytes()));
		
		System.out.println(encoded);
		
		String decode = new String(Base64.getDecoder().decode("U2F0aGlzaEt1bWFyQ2gyNw==".getBytes()));
		
		System.out.println(decode);
		
		System.out.println(AESUtils.encrypt("Sathish"));
		
		System.out.println(AESUtils.decrypt("jesihJvv44ZbTgAV0pg4UA=="));
		
	}

}
