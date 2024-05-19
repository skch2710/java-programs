package regex;

public class RegMain {
	
	public static void main(String[] args) {
		
		String input = "sathishKumar";
		
		System.out.println("Output...: "+RegexUtil.getDBColumn(input));
		
		System.out.println("Upper...: "+RegexUtil.capitalize("SATHISH kumar"));
		
		System.out.println("Upper...: "+RegexUtil.capitalize("sathish kumar CH SS aa ccc ff dd gg h jj sss"));
		
		System.out.println("Upper...: "+RegexUtil.capitalizeNew("sathish kumar CH SS aa ccc ff dd gg h jj sss"));
		
		System.out.println("Braces...: "+RegexUtil.applyBrace("2541256321"));
		
	}

}
