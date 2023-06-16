package maskingnumber;

public class ZeroPaddingString {
	
	public static String paddingFormat(String input) {
	    if (input != null && !input.isEmpty()) {
	        return String.format("%010d", Long.parseLong(input));
	    }
	    return "";
	}
//	
	public static String paddingFormat1(String input) {
	    if (input != null && !input.isEmpty()) {
	    	if(input.length() < 10) {
	    		return "#".repeat(10-input.length())+input;
	    	}
	        return input;
	    }
	    return "";
	}

	

	public static void main(String[] args) {
		
		System.out.println(paddingFormat1("3201"));
		
	}

}
