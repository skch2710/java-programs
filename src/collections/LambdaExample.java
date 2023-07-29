package collections;

import java.util.ArrayList;
import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
class ExClass {

	private Long id;
	private String name;

}

public class LambdaExample {

	public static void main(String[] args) {

		List<String> names = new ArrayList<>();
		names.add("Alice");
		names.add("Bob");
		names.add("Charlie");

		names.forEach((var name) -> {
			System.out.println("Hello, " + name + "!");
		});

		List<Long> numbers = new ArrayList<>();
		numbers.add(10L);
		numbers.add(20L);
		numbers.add(30L);

		numbers.forEach((Long number) -> {
			System.out.println("Number: " + number);
		});
		
		
		List<ExClass> classes = new ArrayList<>();
		
		ExClass e1 = new ExClass(1L,"s");
		ExClass e2 = new ExClass(2L,"k");
		ExClass e3 = new ExClass(3L,"s");
		
        classes.add(e1);
        classes.add(e2);
        classes.add(e3);

        classes.forEach((ExClass exElass) -> {
            System.out.println("Class: " + exElass.getName());
        });
        
	}
}
