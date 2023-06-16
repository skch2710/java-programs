package regex;

import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * 
 * @author sathish.ch
 *
 *         Java regular expressions, or "regex," allow you to match a pattern of
 *         text in a string. You create a pattern using special characters and
 *         constructs, and then use it to search for matches in an input string.
 *         For example, you could use a pattern to find all email addresses in a
 *         string, or to replace all occurrences of a specific word with another
 *         word. Java provides built-in support for regular expressions through
 *         the java.util.regex package, which makes it easy to use regex in your
 *         Java applications.
 */

public class Regex {

	/**
	 * method to check date validation.
	 * 
	 * @param dates
	 * @return Boolean
	 */
	public static Boolean checkDateInjection(List<String> dates) {
		Pattern p = Pattern.compile(
				"^(?:(?:(?:0?[13578]|1[02])(\\/|-|\\.)31)\\1|(?:(?:0?[1,3-9]|1[0-2])(\\/|-|\\.)(?:29|30)\\2))(?:(?:1[6-9]|[2-9]\\d)?\\d{2})$|^(?:0?2(\\/|-|\\.)29\\3(?:(?:(?:1[6-9]|[2-9]\\d)?(?:0[48]|[2468][048]|[13579][26])|(?:(?:16|[2468][048]|[3579][26])00))))$|^(?:(?:0?[1-9])|(?:1[0-2]))(\\/|-|\\.)(?:0?[1-9]|1\\d|2[0-8])\\4(?:(?:1[6-9]|[2-9]\\d)?\\d{2})$");
		Boolean result = true;
		for (String date : dates) {
			Matcher m = p.matcher(date);
			if (date != null && !date.isEmpty() && !m.matches()) {
				result = false;
				break;
			}
		}
		return result;
	}

	/**
	 * method to check email validation.
	 * 
	 * @param mailId
	 * @return Boolean
	 */
	public static Boolean checkEmailInjection(String mailId) {
		String regex = "^[\\w!#$%&’*+/=?`{|}~^-]+(?:\\.[\\w!#$%&’*+/=?`{|}~^-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,6}$";
		Pattern p = Pattern.compile(regex);
		Matcher m = p.matcher(mailId);
		if (mailId != null && !mailId.isEmpty() && !m.matches()) {
			return false;
		}
		return true;
	}
	
	public static Boolean isAlphabets(String name) {
		return name != null && name.matches("^[a-zA-Z\\s]*$");
	}
	
	public static Boolean isAlphaNumeric(String name) {
		return name != null && name.matches("^[a-zA-Z0-9]*$");
	}
	
	public static Boolean isAlphaNumericWithSpace(String name) {
		return name != null && name.matches("^[a-zA-Z0-9\\s]*$");
	}
	
	public static Boolean isNumeric(String number) {
		return number != null && number.matches("^[0-9]*$");
	}
	
	public static Boolean checkDate(String date) {
		String datePattern = "^(0[1-9]|1[0-2])/(0[1-9]|1\\d|2\\d|3[01])/\\d{4}$";
		Pattern p = Pattern.compile(datePattern);
		Matcher m = p.matcher(date);
		if (date != null && !date.isEmpty() && !m.matches()) {
			return false;
		}
		return true;
	}
	
}
