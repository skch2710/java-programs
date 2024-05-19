package collections.map_ex;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class MapComp {

	public static void main(String[] args) {
		
		List<Model> dbList = new ArrayList<>();
		dbList = Arrays.asList(new Model(1L, "Y"), new Model(2L, "Y"), new Model(3L, "Y"),
				new Model(4L, "Y"), new Model(5L, "Y"));
		
		List<Model> listDTO = Arrays.asList(new Model(1L, "Y"), new Model(2L, "Y"), new Model(3L, "Y"),
				new Model(4L, "Y"), new Model(5L, "Y"));
		
		if(dbList.isEmpty()) {
			// list DTO into DB 
			dbList.addAll(listDTO);
		}else {
			for(Model dto : listDTO) {
				Optional<Model> model = dbList.stream()
						.filter(obj -> obj.getId().equals(dto.getId()))
						.findFirst();
				if(model.isPresent()) {
					model.get().setValue("P");
				}else {
					dbList.add(new Model(0L,"P"));
				}
			}
		}
		
		System.out.println(dbList);
		
	}

}