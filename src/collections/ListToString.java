package collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListToString {
	
	public static void main(String[] args) {
		List<Long> list = new ArrayList<>();
		list.add(1L);
		list.add(5L);
		
		String listString = list.toString();
		
		System.out.println(">>>>>>:"+listString);
		
		List<Long> numbers = Arrays.asList(1L, 2L, 3L, 4L, 5L);
		String joinedNumbers = String.join(",", numbers.toString());
		System.out.println(joinedNumbers);

	}

}
