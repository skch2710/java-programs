package collections;

import java.util.ArrayList;
import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
class Gif {
	private String col1;
	private String col2;
}

public class ListColumnComp {

	public static void main(String[] args) {

		Gif g1 = new Gif("aaa", "BBB");
		Gif g2 = new Gif("aaa", "BBB");
		Gif g3 = new Gif("bbb", "ccc");
		Gif g4 = new Gif("ddd", "eee");

		List<Gif> gifList = new ArrayList<>();
		gifList.add(g1);
		gifList.add(g2);
		gifList.add(g3);
		gifList.add(g4);

		int count = 0;

		String input = "aaa" + "-" + "bbb";

		for (Gif gif : gifList) {
			String out = gif.getCol1() + "-" + gif.getCol2();
			if (out.equalsIgnoreCase(input)) {
				count++;
			}
		}

		System.out.println(count);

	}

}
