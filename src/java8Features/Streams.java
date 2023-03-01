package java8Features;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Streams {

	public static void main(String[] args) {

		MyObject myObject = new MyObject();
		myObject.setId(8L);
		MyObject myObject1 = new MyObject();
		myObject1.setId(4L);

		List<MyObject> myObjects = new ArrayList<>();
		myObjects.add(myObject);
		myObjects.add(myObject1);

		List<Long> longs = myObjects.stream().map(MyObject::getId).collect(Collectors.toList());

		System.out.println(longs);
	}

}
