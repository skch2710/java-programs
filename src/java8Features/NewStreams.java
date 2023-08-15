package java8Features;

import java.util.Arrays;
import java.util.List;

public class NewStreams {

	public static void main(String[] args) {
		
		List<String> roles = Arrays.asList("Super User-true", "Super User-false",
				"Access screean");

		boolean anySuperUser = roles.stream()
		        .map(role -> role.split("-")) // Splitting the role string into parts
		        .anyMatch(parts -> parts.length == 2 && "true".equals(parts[1])); // Checking if second part is "true"

		System.out.println(anySuperUser);
		
	}

}
