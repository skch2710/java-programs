package dateCalculate;

import java.text.ParseException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class DateCalculate {
	
	public static void main(String[] args) throws ParseException {
//		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM/dd/yyyy");
//		String lastPasswordResetDate = new SimpleDateFormat("MM/dd/yyyy")
//				.format("2023-03-14 06:59:46.671");
//		LocalDate firstDate = LocalDate.parse(lastPasswordResetDate, formatter);
//		long days = ChronoUnit.DAYS.between(firstDate, LocalDate.now());
//		if (days == 85) {
//			System.out.println("85");
//		}
//		if (days == 87) {
//			System.out.println("87");
//		}
		
//		Date date = new SimpleDateFormat("MM/dd/yyyy").parse("03/15/2023");
//		
//		System.out.println(date);
		
//		 String dateString = "03/16/2023";
//	        DateFormat format = new SimpleDateFormat("MM/dd/yyyy");
//	        try {
//	            Date date = format.parse(dateString);
//	            System.out.println(date);
//	        } catch (ParseException e) {
//	            e.printStackTrace();
//	        }
	        
//		LocalDate dateObj = LocalDate.now().plusDays(5);
//		String date = dateObj.format(DateTimeFormatter.ofPattern(Constant.DATE_FORMAT));
		
		String dateString = "10/27/2022";
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM/dd/yyyy");
		LocalDate date = LocalDate.parse(dateString, formatter);

		LocalDate dateObj = date.plusDays(5);
		String date1 = dateObj.format(DateTimeFormatter.ofPattern("MM/dd/yyyy"));

		System.out.println(date1);
	}

}
