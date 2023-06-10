package dateCalculate;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class StringDate {

	private static String dateFormat(String inputDate) throws ParseException {
		SimpleDateFormat inputFormat = new SimpleDateFormat("MM/dd/yyyy");
		SimpleDateFormat outputFormat = new SimpleDateFormat("MM.dd");
		Date date = inputFormat.parse(inputDate);
		return outputFormat.format(date);
	}

	public static void main(String[] args) {
//		String dateString = "06/08/2023";
//		SimpleDateFormat inputFormat = new SimpleDateFormat("MM/dd/yyyy");
//		SimpleDateFormat outputFormat = new SimpleDateFormat("MM.dd");
//
//		try {
//			Date date = inputFormat.parse(dateString);
//			String formattedDate = outputFormat.format(date);
//			System.out.println("Formatted date: " + formattedDate);
//		} catch (ParseException e) {
//			e.printStackTrace();
//		}
		
		try {
			System.out.println(dateFormat("06/08/2023"));
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
