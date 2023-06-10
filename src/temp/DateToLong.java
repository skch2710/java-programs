package temp;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;

public class DateToLong {
	public static void main(String[] args) {

//		long timestamp = 1414756530627000L;
//
//		Date date = new Date(timestamp);
//		System.out.println(date);
		
//		String dateString = "2014-10-31 11:55:30";
//		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
//
//		try {
//		    Date date = dateFormat.parse(dateString);
//		    long timestamp = date.getTime();
//		    System.out.println(timestamp);
//		    
//		    Date date2 = new Date(timestamp);
//			System.out.println(date2);
//		    
//		} catch (ParseException e) {
//		    e.printStackTrace();
//		}

		long timestamp = 1621458000000L; // Example timestamp in milliseconds

		Date date = new Date(timestamp);
		TimeZone gmtTimeZone = TimeZone.getTimeZone("GMT");
		DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		dateFormat.setTimeZone(gmtTimeZone);
		String formattedDate = dateFormat.format(date);

		System.out.println(formattedDate);


	}
}
