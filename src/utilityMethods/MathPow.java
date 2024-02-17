package utilityMethods;

public class MathPow {
	
	public static void main(String[] args) {
		double base = 2.0;
        double exponent = 3.0;
        
        double result = Math.pow(base, exponent);
        
        System.out.println("Result of " + base + " raised to the power of " + exponent + " is: " + result);
        
        System.out.println(Math.sqrt(4));
        
        System.out.println("Absolute of 5 : "+Math.abs(5)+",\nAbsolute of -5 : "+Math.abs(-5));
	}

}
