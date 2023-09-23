package dateCalculate;

import java.text.ParseException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class DateCalculate {
	
	public static void main(String[] args) throws ParseException {
		
		String dateString = "10/27/2022";
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM/dd/yyyy");
		LocalDate date = LocalDate.parse(dateString, formatter);

		LocalDate dateObj = date.plusDays(5);
		String date1 = dateObj.format(DateTimeFormatter.ofPattern("MM/dd/yyyy"));

		System.out.println(date1);
		
		LocalDate today = LocalDate.now();
		
		LocalDate minsOneDay = today.minusDays(1);
		
		System.out.println(minsOneDay);
		
		// Define two LocalDate objects representing your dates
        LocalDate firstDate = LocalDate.of(2023, 9, 01);
        LocalDate secondDate = LocalDate.now();

        // Calculate the days between the two dates
        long daysBetween = ChronoUnit.DAYS.between(firstDate, secondDate);

        // Display the result
        System.out.println("Days between the two dates: " + daysBetween);
	}

}
