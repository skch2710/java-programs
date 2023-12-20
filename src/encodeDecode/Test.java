package encodeDecode;

import java.util.Base64;

public class Test {

	public static void main(String[] args) {
		
		String encoded = new String(Base64.getEncoder().encode("SKCH#12345".getBytes()));
		
		System.out.println(encoded);
		
		String decode = new String(Base64.getDecoder().decode("U0tDSCMxMjM0NQ==".getBytes()));
		
		System.out.println(decode);
		
	}

}
