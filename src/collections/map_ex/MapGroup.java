package collections.map_ex;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

public class MapGroup {

	public static void main(String[] args) {

		List<Model> listModel = Arrays.asList(new Model(1L, "S"), new Model(1L, "A"), new Model(2L, "T"),
				new Model(2L, "H"), new Model(4L, "k"));

		List<Model> arrList = new ArrayList<>();
		arrList.addAll(listModel);
		
		System.out.println(listModel);
		
		Map<Long, List<Model>> goupById = arrList.stream()
				.collect(Collectors.groupingBy(Model::getId));

		System.out.println(goupById);

		goupById.forEach((id, models) -> {
			System.out.println(id);
			System.out.println(models);
			if(id==2L) {
				 models.stream().forEach(model -> {
					 model.setValue("New Value");
				 });
			}
		});
		arrList.add(new Model(8L, "H"));

		System.out.println(arrList);
	}
}

@Data
@NoArgsConstructor
@AllArgsConstructor
class Model {
	private Long id;
	private String value;
}