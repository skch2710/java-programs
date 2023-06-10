package maskingnumber;

import java.math.BigDecimal;
import java.text.DecimalFormat;

public class BigDecimalToStringExample {
	
	public static String numberFormat(BigDecimal number) {
		return number != null ? new DecimalFormat("$ #,##0.00").format(number) : "";
	}
	public static String numberFormat(BigDecimal number,String format) {
		return number != null ? new DecimalFormat(format).format(number) : "";
	}
    public static void main(String[] args) {
    	BigDecimal number = new BigDecimal("458612345.6789");

        // Create DecimalFormat instance with desired formatting options
        DecimalFormat decimalFormat = new DecimalFormat("#,##,##,###.00");
//        decimalFormat.setGroupingSize(2); // Set grouping size

        // Format the BigDecimal number as a String
        String formattedNumber = decimalFormat.format(number);

        System.out.println("Formatted number: " + formattedNumber);
    }
}
