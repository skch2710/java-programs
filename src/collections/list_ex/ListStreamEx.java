package collections.list_ex;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.apache.commons.lang3.ObjectUtils;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

public class ListStreamEx {
	
	public static void main(String[] args) {
		
		List<Test> listTest = new ArrayList<>();
		listTest.add(new Test("sa","th"));
		listTest.add(new Test("dom","th"));
		listTest.add(new Test(null,"th"));
		
		//Filter and Update Assign to New List
		List<Test> newListTest = listTest.stream()
				.filter(obj -> obj.getName() == null ? ObjectUtils.isEmpty("dom") : obj.getName().equals("dom"))
				.peek(obj -> obj.setMail("dom")).collect(Collectors.toList());
		
		System.out.println(newListTest);
		
		//Get the First Object --findFirst
		Optional<Test> firstObj = listTest.stream()
				.filter(obj -> obj.getName() == null ? ObjectUtils.isEmpty("") : obj.getName().equals(""))
				.peek(obj -> obj.setMail("PEEK")) //If apply peek  optional
				.findFirst();
		
		System.out.println(listTest);
		
		System.out.println(firstObj.isPresent() ? firstObj.get() : "No Object");
		
	}

}

@Data
@NoArgsConstructor
@AllArgsConstructor
class Test{
	
	private String name;
	private String mail;
	
}