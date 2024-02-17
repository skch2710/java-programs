package regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UpperFrstLetter {

	public static String capitalize(String input) {
		if (input != null && !input.isEmpty()) {
			Pattern pattern = Pattern.compile("(\\b\\w)(\\w*)");
			Matcher matcher = pattern.matcher(input);

			StringBuilder output = new StringBuilder();
			while (matcher.find()) {
				output.append(matcher.group(1).toUpperCase()).append(matcher.group(2)).append(" ");
			}
			return output.toString().trim();
		}
		return "";
	}

	public static void main(String[] args) {
		String input = "Sathish Kumar ch";
		Pattern pattern = Pattern.compile("(\\b\\w)(\\w*)");
		Matcher matcher = pattern.matcher(input);

		StringBuilder output = new StringBuilder();
		while (matcher.find()) {
			output.append(matcher.group(1).toUpperCase()).append(matcher.group(2)).append(" ");
		}

		System.out.println(output.toString().trim());
		
		System.out.println("Method..::"+capitalize(input));

	}

}
