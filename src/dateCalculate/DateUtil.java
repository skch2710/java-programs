package dateCalculate;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class DateUtil {
	
	/**
	 * FORMATS 
	 * 
	 * yyyy-MM-dd HH:mm:ss a
	 * yyyy-MM-dd
	 * MM/dd/yyyy
	 * MM.dd
	 * HH:mm a MMMM dd, yyyy  -- 15:05
	 * hh:mm a MMMM dd, yyyy  -- 03:05
	 * h:mm a MMM d, yyyy    
	 * MMM d, yyyy
	 * MMM dd, yyyy
	 * MMMM dd, yyyy
	 * yyyy-MM-dd h:mm a -- 2023-08-01 7:50 AM 
	 */

	public static String dateToString(LocalDateTime date, String format) {
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern(format);
		return date.format(formatter);
	}

	public static String dateToString(LocalDate date, String format) {
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern(format);
		return date.format(formatter);
	}
	
	public static LocalDate stringToDate(String date,String format) {
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern(format);
		return LocalDate.parse(date,formatter);
	}
	
	public static LocalDateTime stringToDateTime(String date,String format) {
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern(format);
		return LocalDateTime.parse(date,formatter);
	}
	
	public static String dateToString(Date date, String format) {
		SimpleDateFormat formatter = new SimpleDateFormat(format);
		return formatter.format(date);
	}

	public static Date stringToDates(String date, String format) {
		Date output = null;
		try {
			SimpleDateFormat formatter = new SimpleDateFormat(format);
			output = formatter.parse(date);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		return output;
	}
}
