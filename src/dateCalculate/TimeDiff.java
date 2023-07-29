package dateCalculate;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class TimeDiff {
	
	private static Date dateConvert(String input) throws ParseException {
		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd h:mm a");
		Date date = format.parse(input);
		return date;
	}
	
	private static LocalDateTime dateConverts(String input){
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd h:mm a");
		LocalDateTime dateTime = LocalDateTime.parse(input, formatter);
		return dateTime;
	}
	
	private static Boolean timeCalc(Long hours, Date userLoginDate) {
		Long curentLoginTime = System.currentTimeMillis();
		Long userLoginTime = userLoginDate.getTime();

		Long diff = curentLoginTime - userLoginTime;

		if (Math.abs(diff) < hours * 3600000) {
			return false;
		} else {
			return true;
		}
	}

	public static void main(String[] args) throws ParseException {

		Date userLoginTime = dateConvert("2023-07-28 7:50 PM");

		System.out.println("More than 12 hr :: "+timeCalc(12L,userLoginTime));
	}
}
