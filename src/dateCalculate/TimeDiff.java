package dateCalculate;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.time.Instant;
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
	
	public static Boolean checkLoginTime(Long hours, Date userLoginDate) {
	    if (userLoginDate != null) {
	        long currentTime = System.currentTimeMillis();
	        long userLoginTime = userLoginDate.getTime();
	        long differenceInMillis = Math.abs(currentTime - userLoginTime);
	        long maxAllowedDurationInMillis = hours * 3600000;
	        return differenceInMillis > maxAllowedDurationInMillis;
	    }
	    return true;
	}
	
	public static boolean checkLoginTime(long hours, Date userLoginDate) {
	    if (userLoginDate != null) {
	        Instant currentTime = Instant.now();
	        Instant userLoginTime = userLoginDate.toInstant();

	        Duration timeDifference = Duration.between(userLoginTime, currentTime);

	        return timeDifference.toHours() >= hours;
	    } else {
	        return true;
	    }
	}

	public static void main(String[] args) throws ParseException {

		Date userLoginTime = dateConvert("2023-08-01 7:50 AM");

		System.out.println("More than 12 hr :: "+checkLoginTime(12L,userLoginTime));
	}
}
