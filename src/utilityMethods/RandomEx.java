package utilityMethods;

import java.text.DecimalFormat;
import java.util.Random;

public class RandomEx {
	
	public static String getRandomNum() {
		return new DecimalFormat("000000").format(new Random().nextInt(999999));
	}
	
	public static String getRandomNum4() {
		return new DecimalFormat("0000").format(new Random().nextInt(9999));
	}
	
	public static void main(String[] args) {
		
		String otp = new DecimalFormat("000000").format(new Random().nextInt(999999));
		
		String otp1 = new DecimalFormat("0000").format(new Random().nextInt(9999));
		
		System.out.println(otp);
		
		System.out.println(otp1);
		
		System.out.println("Random Number : "+getRandomNum4());
		
	}

}
