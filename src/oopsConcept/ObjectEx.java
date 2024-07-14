package oopsConcept;

import java.time.LocalDate;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

public class ObjectEx {
	public static void main(String[] args) {
		
		Object obj = new TestObject(1L,"value",LocalDate.now()); 
		
		System.out.println(obj);
		
		TestObject to = (TestObject) obj;
		System.out.println(to);
		
	}
}

@Data
@NoArgsConstructor
@AllArgsConstructor
class TestObject{
	private Long id;
	private String value;
	private LocalDate date;
}
