package collections;

import java.util.ArrayList;
import java.util.List;

public class ListLastObject {

	public static void main(String[] args) {

		List<Sathish> sList = new ArrayList<>();

		Sathish s1 = new Sathish(1L, "s1", "sk");
		Sathish s2 = new Sathish(2L, "s2", "ss");
		Sathish s3 = new Sathish(5L, "s3", "ch");
		Sathish s4 = new Sathish(4L, "s4", "sk");
		Sathish s5 = new Sathish(3L, "s5", "sk");

		sList.add(s1);
		sList.add(s2);
		sList.add(s3);
		sList.add(s4);
		sList.add(s5);

		for (Sathish sathish : sList) {
			if (sList.indexOf(sathish) == sList.size() - 1) {
				System.out.println("Last Object :" + sathish);
			}
//			if (sList.indexOf(sathish) != sList.size() - 1) {
//				System.out.println("Not a Last Object :" + sathish);
//			}
		}

	}

}
