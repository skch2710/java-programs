package dateCalculate;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.Function;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

public class SortDatesIssue {

	public static <T> void sortByDate(List<T> list, Function<T, String> property, String order) {
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM/dd/yyyy");
		Comparator<T> comparator = Comparator.comparing(item -> {
			String dateValue = property.apply(item);
			return dateValue == null ? LocalDate.MIN : LocalDate.parse(dateValue, formatter);
		}, Comparator.nullsFirst(Comparator.naturalOrder()));

		Collections.sort(list, order.equals("asc") ? comparator : comparator.reversed());
	}

	public static <T> void sortByValue(List<T> list, Function<T, String> property, String order) {
		Comparator<T> comparator = Comparator.comparing(property, Comparator.nullsFirst(String::compareTo));
		list.sort(order.equals("asc") ? comparator : comparator.reversed());
	}

	public static void main(String[] args) {

		Test test1 = new Test(1L, "01/02/2023", "sssss");
		Test test2 = new Test(2L, "06/01/2022", null);
		Test test3 = new Test(3L, null, "ggggg");
		Test test4 = new Test(4L, "04/06/2021", "aaaaa");

		List<Test> testList = new ArrayList<>();
		testList.add(test1);
		testList.add(test2);
		testList.add(test3);
		testList.add(test4);

//		sortByDate(testList, Test::getDateValue, "asc");
		
//		sortByValue(testList, Test::getStingValue, "asc");
		
		sortByValue(testList, Test::getStingValue, "desc");

		System.out.println(testList);

	}
}

@Data
@NoArgsConstructor
@AllArgsConstructor
class Test {

	private Long id;
	private String dateValue;
	private String stingValue;

}
