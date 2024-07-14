package stringEx;

import regex.RegexUtil;

public class StringMain {
	
	public static void main(String[] args) {
		System.out.println("Sathish.Kumar".split("\\.")[1]);
		
		System.out.println(RegexUtil.titleCase("sathishKumarCh"));
		
		System.out.println(camelCase("Sathish Kumar Ch"));
		
		
	}
	
	public static String titleCase(String input) {
        if (input == null || input.isEmpty()) {
            return "";
        }
        String result = input.replaceAll("([a-z])([A-Z])", "$1 $2");
        result = result.substring(0, 1).toUpperCase() + result.substring(1);
        return result;
    }
	
	public static String camelCase(String input) {
        if (input == null || input.isEmpty()) {
            return "";
        }
        String result = input.replaceAll(" ", "");
        result = result.substring(0, 1).toLowerCase() + result.substring(1);
        return result;
    }

}
