package dateCalculate;

import java.time.LocalDateTime;
import java.util.Date;
import java.util.TimeZone;

public class TimeLocal {

	public static void main(String[] args) {
		System.out.println(DateUtil.dateToString(LocalDateTime.now(),"yyyy-MM-dd HH:mm:ss a"));
		System.out.println(DateUtil.dateToString(new Date(),"yyyy-MM-dd HH:mm:ss a"));
		
		TimeZone.setDefault(TimeZone.getTimeZone("GMT"));
		System.out.println(DateUtil.dateToString(LocalDateTime.now(),"yyyy-MM-dd HH:mm:ss a"));
		System.out.println(DateUtil.dateToString(new Date(),"yyyy-MM-dd HH:mm:ss a"));
		
		TimeZone.setDefault(TimeZone.getTimeZone("IST"));
		System.out.println(DateUtil.dateToString(LocalDateTime.now(),"yyyy-MM-dd HH:mm:ss a"));
		System.out.println(DateUtil.dateToString(new Date(),"yyyy-MM-dd HH:mm:ss a"));
		
		TimeZone.setDefault(TimeZone.getTimeZone("BST"));
		System.out.println(DateUtil.dateToString(LocalDateTime.now(),"yyyy-MM-dd HH:mm:ss a"));
		System.out.println(DateUtil.dateToString(new Date(),"yyyy-MM-dd HH:mm:ss a"));
		
		TimeZone.setDefault(TimeZone.getTimeZone("America/New_York"));
		System.out.println(DateUtil.dateToString(LocalDateTime.now(),"yyyy-MM-dd HH:mm:ss a"));
		System.out.println(DateUtil.dateToString(new Date(),"yyyy-MM-dd HH:mm:ss a"));
	}
}
