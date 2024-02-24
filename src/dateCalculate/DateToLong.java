package dateCalculate;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.Date;

public class DateToLong {
	public static void main(String[] args) {

//		long timestamp = 1621458000000L; // Example timestamp in milliseconds

		long timestamp = System.currentTimeMillis();
		
		System.out.println(timestamp);
		
		Date date = new Date(timestamp);
		
		LocalDate localDate = Instant.ofEpochMilli(timestamp)
				.atZone(ZoneId.systemDefault()).toLocalDate();
		
		LocalDateTime localDateTime = Instant.ofEpochMilli(timestamp)
				.atZone(ZoneId.systemDefault()).toLocalDateTime();
		
//		TimeZone gmtTimeZone = TimeZone.getTimeZone("GMT");
		DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
//		dateFormat.setTimeZone(gmtTimeZone);
		String formattedDate = dateFormat.format(date);

		System.out.println(formattedDate);
		
		System.out.println(localDate);

		System.out.println(localDateTime);
		
		Long localDateLong = localDate.atStartOfDay(ZoneId.systemDefault()).toInstant().toEpochMilli();
		
		System.out.println(localDateLong);
		
		Long localDateTimeLong = localDateTime.atZone(ZoneId.systemDefault()).toInstant().toEpochMilli();
		
		System.out.println(localDateTimeLong);
	}
}
