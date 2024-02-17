package regex;

public class ReplaceAllReg {
	
	public static String getOut(String input) {
		return input!=null && !input.isBlank() ? 
				input.replaceAll("([a-z])([A-Z])", "$1_$2").toLowerCase() : "";
	}
	
	
	public static void main(String[] args) {
		
		String input = "sathishKumar";
		
//		String output = input.replaceAll("([a-z])([A-Z])", "$1_$2").toLowerCase();
		
		System.out.println("Output...: "+getOut(input));
		
	}

}
