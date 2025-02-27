package numberToWord;

public class NumberToWordsConverter {
	
	private static final String[] UNITS = {
	        "", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten",
	        "Eleven", "Twelve", "Thirteen", "Fourteen", "Fifteen", "Sixteen", "Seventeen", "Eighteen", "Nineteen"
	    };

	    private static final String[] TENS = {
	        "", "", "Twenty", "Thirty", "Forty", "Fifty", "Sixty", "Seventy", "Eighty", "Ninety"
	    };

	    public static String convert(long number) {
	        if (number == 0) {
	            return "Zero";
	        }
	        return convertIndianFormat(number).trim();
	    }

	    private static String convertHelper(long number) {
	        if (number < 20) {
	            return UNITS[(int) number];
	        } else if (number < 100) {
	            return TENS[(int) (number / 10)] + " " + UNITS[(int) (number % 10)];
	        } else if (number < 1000) {
	            return UNITS[(int) (number / 100)] + " Hundred " + convertHelper(number % 100);
	        } else if (number < 1_000_000) {
	            return convertHelper(number / 1000) + " Thousand " + convertHelper(number % 1000);
	        } else if (number < 1_000_000_000) {
	            return convertHelper(number / 1_000_000) + " Million " + convertHelper(number % 1_000_000);
	        } else {
	            return convertHelper(number / 1_000_000_000) + " Billion " + convertHelper(number % 1_000_000_000);
	        }
	    }
	    
	    private static String convertIndianFormat(long number) {
	        if (number < 20) {
	            return UNITS[(int) number];
	        } else if (number < 100) {
	            return TENS[(int) (number / 10)] + " " + UNITS[(int) (number % 10)];
	        } else if (number < 1000) {
	            return UNITS[(int) (number / 100)] + " Hundred " + convertIndianFormat(number % 100);
	        } else if (number < 100_000) {
	            return convertIndianFormat(number / 1000) + " Thousand " + convertIndianFormat(number % 1000);
	        } else if (number < 10_000_000) {
	            return convertIndianFormat(number / 100_000) + " Lakh " + convertIndianFormat(number % 100_000);
	        } else {
	            return convertIndianFormat(number / 10_000_000) + " Crore " + convertIndianFormat(number % 10_000_000);
	        }
	    }

	    public static void main(String[] args) {
	        long number = 28756;
	        System.out.println("Number: " + number);
	        System.out.println("In Words: " + convert(number));
	    }

}
