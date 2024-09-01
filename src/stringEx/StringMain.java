package stringEx;

import java.util.Arrays;
import java.util.List;

import regex.RegexUtil;

public class StringMain {
	
	public static void main(String[] args) {
		System.out.println("Sathish.Kumar".split("\\.")[1]);
		
		System.out.println(RegexUtil.titleCase("sathishKumarCh"));
		
		System.out.println(camelCase("Sathish Kumar Ch"));
		
		List<String> stringList = Arrays.asList("A","b");
		
		List<Long> longList = Arrays.asList(1L,2L);
		
		System.out.println(String.join(", ", stringList));
		
		System.out.println(longList.getFirst());
		
		System.out.println(longList.getLast());
		
		System.out.println(">>>>> "+cleanName("sa.t'h\"i\"sh.xlsx"));
		
		String name = "Sathish";
		int number = 32;

		// Using String.format
		String result = String.format("String Format %s = %d", name, number);
		System.out.println(result);
		
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

	public static String cleanName(String input) {
		String result = "";
		result = input.replaceAll("\\.(csv|xlsx|xls)", "")  // Removing the file extension
                .replaceAll("[.,:;'\"]", "");    // removing [.,:;'"]
		return result;
	}
	
}
