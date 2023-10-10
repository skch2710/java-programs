package java8Features;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Streams {
	
	public static String listToString(List<?> list) {
		return list.stream()
                .map(Object::toString)
                .collect(Collectors.joining(","));
	}

	/**
	 * List of Objects to List of Long
	 */
	public static void main(String[] args) {

		MyObject myObject = new MyObject(2L);
		MyObject myObject1 = new MyObject(2L);
		MyObject myObject2 = new MyObject(2L);
		MyObject myObject3 = new MyObject(2L);
		MyObject myObject4 = new MyObject(2L);
		MyObject myObject5 = new MyObject(2L);

		List<MyObject> myObjects = new ArrayList<>();
		myObjects.add(myObject);
		myObjects.add(myObject1);
		myObjects.add(myObject2);
		myObjects.add(myObject3);
		myObjects.add(myObject4);
		myObjects.add(myObject5);

		List<Long> longs = myObjects.stream().map(MyObject::getId).collect(Collectors.toList());

		System.out.println(longs);
		
		System.out.println("List of Long to String :: "+ listToString(longs) );
		
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
		
		Long count = myObjects.stream().filter(obj -> obj.getId() == 2L).count();

		System.out.println(count);
		
		Double percentage = (double) count / myObjects.size() * 100.0;

		System.out.println("Percentage: " + Math.round(percentage) + "%");
	}

}
