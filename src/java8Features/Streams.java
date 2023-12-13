package java8Features;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Streams {
	
	public static String listToString(List<?> list) {
		return (list!=null && !list.isEmpty()) ? 
				list.stream().map(Object::toString)
                .collect(Collectors.joining(",")) : "";
	}
	
	//Distinct
	public static String listToStringDistinct(List<?> list) {
		return (list!=null && !list.isEmpty()) ? 
				list.stream().map(Object::toString).distinct()
                .collect(Collectors.joining(",")) : "";
	}

	/**
	 * List of Objects to List of Long
	 */
	public static void main(String[] args) {

		MyObject myObject = new MyObject(2L,"ss");
		MyObject myObject1 = new MyObject(2L,"aa");
		MyObject myObject2 = new MyObject(2L,"tt");
		MyObject myObject3 = new MyObject(3L,"hh");
		MyObject myObject4 = new MyObject(2L,"aa");
		MyObject myObject5 = new MyObject(3L,"ss");

		List<MyObject> myObjects = new ArrayList<>();
		myObjects.add(myObject);
		myObjects.add(myObject1);
		myObjects.add(myObject2);
		myObjects.add(myObject3);
		myObjects.add(myObject4);
		myObjects.add(myObject5);

		// List of Id from ListOfObjects
		List<Long> longs = myObjects.stream().map(MyObject::getId).collect(Collectors.toList());

		System.out.println(longs);
		
		System.out.println("List of Long to String :: "+ listToString(longs) );
		
		System.out.println("List of Long to String Distinct :: "+ listToStringDistinct(longs) );
		
		//Name Join
		String names = myObjects.stream().map(MyObject::getName)
                .collect(Collectors.joining(", "));
		
		System.out.println(">>>Names : "+names);
		
		//Join and Distinct
		String namesDistinct = myObjects.stream().map(MyObject::getName).distinct()
                .collect(Collectors.joining(", "));
		
		System.out.println(">>>Names Distinct : "+namesDistinct);
		
		//Filter With Join and Distinct
		String namesDistinctWithFilter = myObjects.stream()
				.filter(obj -> obj.getId() == 2L)
				.map(MyObject::getName).distinct()
                .collect(Collectors.joining(", "));
		
		System.out.println(">>>Names Distinct WithFilter : "+namesDistinctWithFilter);
		
		//allMatch 
		Boolean cond = myObjects.stream().allMatch(obj -> obj.getId() == 2L);
		
		System.out.println(cond);
		
		/**
		 * anyMatch will return true if there is at least one element 
		 * in the myObjects list for which obj.getId() equals 2L, 
		 * and it will return false if none of the elements match the condition.
		 */
		Boolean cond1 = myObjects.stream().anyMatch(obj -> obj.getId() == 2L);
		
		System.out.println(cond1);
		
		//Count With Filter
		Long count = myObjects.stream().filter(obj -> obj.getId() == 2L).count();

		System.out.println(count);
		
		Double percentage = (double) count / myObjects.size() * 100.0;

		System.out.println("Percentage: " + Math.round(percentage) + "%");
	}

}
