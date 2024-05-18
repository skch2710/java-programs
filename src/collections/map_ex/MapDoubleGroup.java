package collections.map_ex;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

public class MapDoubleGroup {

	public static void main(String[] args) {
		List<Ex> listModel = Arrays.asList(new Ex(1L, 1L, "S"), new Ex(1L, 2L, "A"), new Ex(2L, 1L, "T"),
				new Ex(2L, 2L, "H"), new Ex(1L, 4L, "k"));

		Map<Long, Map<Long, List<Ex>>> groupedByIdOneAndIdTwo = listModel.stream()
				.collect(Collectors.groupingBy(Ex::getIdOne,
						Collectors.groupingBy(Ex::getIdTwo)));

		// Printing the grouped map
		groupedByIdOneAndIdTwo.forEach((idOne, map) -> {
			System.out.println("idOne: " + idOne+" "+map);
			map.forEach((idTwo, models) -> {
				System.out.println("  idTwo: " + idTwo + " -> " + models);
			});
		});
	}
}

@Data
@NoArgsConstructor
@AllArgsConstructor
class Ex {
	private Long idOne;
	private Long idTwo;
	private String value;
}