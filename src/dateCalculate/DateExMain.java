package dateCalculate;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;

public class DateExMain {

	public static String dateFormat(String inputDate) throws ParseException {
		SimpleDateFormat inputFormat = new SimpleDateFormat("MM/dd/yyyy");
		SimpleDateFormat outputFormat = new SimpleDateFormat("MM.dd");
		Date date = inputFormat.parse(inputDate);
		return outputFormat.format(date);
	}

	public static void main(String[] args) throws InterruptedException {
		
		String mmdd = DateUtil.dateToString(LocalDate.now(), "MM.dd");
		System.out.println(mmdd);
		
		String mmd = DateUtil.dateToString(LocalDateTime.now(), "HH:mm a MMMM dd, yyyy");
		System.out.println(mmd);
		
		String mmmd = DateUtil.dateToString(LocalDateTime.now(), "h:mm a MMM d, yyyy");
		System.out.println(mmmd);
		
		String md = DateUtil.dateToString(LocalDate.now(), "MMM dd, yyyy");
		System.out.println(md);
		
		String dateN = DateUtil.dateToString(new Date(), "hh:mm a MMM d, yyyy");
		System.out.println(dateN);
		
		LocalDate input = LocalDate.of(2024, 10, 18);
		System.out.println(DateUtil.getMQ(input, "M"));
		System.out.println(DateUtil.getMQ(input, "Q"));
		
		LocalDateTime source = LocalDateTime.now();
		Thread.sleep(200);
		LocalDateTime target = LocalDateTime.now();
		
		System.out.println(source);
		System.out.println(target);
		
		System.out.println(DateUtil.compareDate(source, target));
		
		System.out.println(DateUtil.compareDateMinutes(source, target));
		
	}

}
