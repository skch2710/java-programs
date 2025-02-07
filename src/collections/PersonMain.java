package collections;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

public class PersonMain {

	public static void main(String[] args) {
		
		List<Person> people = Arrays.asList(new Person("Alice", 35), 
				new Person("Bob", 40), new Person("Alice", 32),
				new Person("Charlie", 25), new Person("Bob", 38));

		List<Person> filteredSortedList = people.stream().filter(p -> p.age > 30)
				.sorted(Comparator.comparing(Person::getName).thenComparingInt(Person::getAge))
				.collect(Collectors.toList());

		filteredSortedList.forEach(System.out::println);
	}

}

@Data
@NoArgsConstructor
@AllArgsConstructor
class Person {
	String name;
	int age;
}