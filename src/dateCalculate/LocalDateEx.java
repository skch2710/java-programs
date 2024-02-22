package dateCalculate;

import java.text.ParseException;
import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.temporal.ChronoUnit;
import java.util.Date;

public class LocalDateEx {
	
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
	
	public static Boolean betweenHours(LocalDateTime input,Long hours) {
		long bwHours = ChronoUnit.HOURS.between(input, LocalDateTime.now());
		return bwHours > hours;
	}
	
	public static Long betweenHours(LocalDateTime input) {
		Long bwHours = ChronoUnit.HOURS.between(input, LocalDateTime.now());
		return bwHours;
	}
	
	public static Long betweenDays(LocalDateTime input) {
		Long bwDays = ChronoUnit.DAYS.between(input, LocalDateTime.now());
		return bwDays;
	}

	public static Long betweenMonths(LocalDateTime input) {
		Long bwMonths = ChronoUnit.MONTHS.between(input, LocalDateTime.now());
		return bwMonths;
	}
	
	public static void main(String[] args) throws ParseException {

		Date userLoginTime = DateUtil.stringToDates("2023-08-01 7:50 AM", "yyyy-MM-dd h:mm a");

		System.out.println("More than 12 hr :: "+checkLoginTime(12L,userLoginTime));
		
		LocalDateTime localTime = DateUtil.stringToDateTime("2023-08-25 7:50 AM", "yyyy-MM-dd h:mm a");
		
		System.out.println(betweenHours(localTime,12L));
		
		System.out.println(betweenHours(localTime));
		
		System.out.println(betweenDays(localTime));
		
		System.out.println(betweenMonths(localTime));
		
		System.out.println(localTime.truncatedTo(ChronoUnit.DAYS));
		
		System.out.println(LocalDate.now());
		System.out.println(LocalDate.now().plusDays(5));
		System.out.println(LocalDate.now().minusDays(5));
		
		LocalDate dateOne = DateUtil.stringToDate("2024-02-22", "yyyy-MM-dd");
		
		LocalDate dateTwo = DateUtil.stringToDate("2024-02-22", "yyyy-MM-dd");
		
		System.out.println(dateOne.isAfter(dateTwo));
		System.out.println(dateOne.isBefore(dateTwo));
		System.out.println(dateOne.isEqual(dateTwo));
		
		Date date = new Date();
		LocalDate localDate = date.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
		LocalDateTime localDateTime = date.toInstant().atZone(ZoneId.systemDefault()).toLocalDateTime();
		
		System.out.println("Date To LocalDate : "+localDate);
		System.out.println("Date To LocalDateTime : "+localDateTime);
		
		Date dateConv = Date.from(localDate.atStartOfDay(ZoneId.systemDefault()).toInstant());
		
		Date dateConvt = Date.from(localDateTime.atZone(ZoneId.systemDefault()).toInstant());
		
		System.out.println("LocalDate To Date : "+dateConv);
		System.out.println("LocalDateTime To Date : "+dateConvt);
		
	}
}
