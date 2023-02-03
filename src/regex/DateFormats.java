package regex;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class DateFormats {
	
	public static final String DATE_FORMAT= "MM/dd/yyyy";
	
	/**
	 * String format.
	 *
	 * @param input the input
	 * @return the string
	 */
	public static String stringFormat(String input) {
		String output = "";
		if (input.isEmpty()) {
			output = String.format("%011d", Long.parseLong(input));
		}
		return output;
	}
	
	public static void main(String[] args) throws ParseException {
		System.out.println(new SimpleDateFormat(DATE_FORMAT).parse("10/27/1996"));
		
		System.out.println(new SimpleDateFormat( DATE_FORMAT ).format( new Date()));
		
//		System.out.println(DateFormats.stringFormat(123456));
		
		//TO CHECK DATE FORMAT
        List<String> dates = new ArrayList<>();
        dates.add("01/25/2023 or 1");
        System.out.println(Regex.checkDateInjection(dates));
        
        //TO CHECK EMAIL VALIDATION
        System.out.println(Regex.checkEmailInjection("SKCH2710@GMAIL.com or 1"));
        
        System.out.println(Regex.isNumeric("123"));
        
	}

}
