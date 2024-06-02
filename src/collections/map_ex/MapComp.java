package collections.map_ex;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class MapComp {
	
	//To test with 1 Lack Records
	
	public static void main(String[] args) {
		
		List<Model> dbList = new ArrayList<>();
		List<Model> list = Arrays.asList(new Model(1L, "Y"), new Model(2L, "Y"), new Model(3L, "Y"),
				new Model(4L, "Y"), new Model(5L, "Y"));
		dbList.addAll(list);

		Map<Long, Model> mapList = dbList.stream()
				.collect(Collectors.toMap(Model::getId, model -> model));
		
		List<Model> listDTO = Arrays.asList(new Model(1L, "Y"), new Model(2L, "Y"), new Model(3L, "Y"),
				new Model(7L, "Y"), new Model(8L, "Y"));
		
		if(dbList.isEmpty()) {
			// list DTO into DB 
			dbList.addAll(listDTO);
		}else {
			List<Long> dtoIds = new ArrayList<>();
			List<Model> newList = new ArrayList<>();
			listDTO.forEach(dto -> {
		        Model existingModel = mapList.get(dto.getId());
		        if (existingModel != null) {
		            existingModel.setValue("P");
		            dtoIds.add(dto.getId());
		        } else {
		            newList.add(new Model(dto.getId(), "P"));
		        }
		    });
		    
		    // Unmap if any
		    dbList.stream()
		          .filter(model -> !dtoIds.contains(model.getId()))
		          .forEach(obj -> obj.setValue("N"));
		          
		    dbList.addAll(newList);
		}
		
		System.out.println(dbList);
		
	}

}