package stream_ex;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

public class StreamsInv {
	
	public static boolean isChanged(Map<Long, InvAdj> modelById, List<InvAdjDto> invAdjDtoList) {
		if(modelById.size() != invAdjDtoList.size()) {
			return true;
		}
		for (InvAdjDto invAdjDto : invAdjDtoList) {
			InvAdj invAdj = modelById.get(invAdjDto.getInvId());
			if (invAdj == null || 
				!invAdj.getAdjName().equals(invAdjDto.getAdjName()) || 
				!invAdj.getAdjValue().equals(invAdjDto.getAdjValue())) {
				return true;
			}
		}
		return false;
	}
	
	
	public static void main(String[] args) {
		
		// Create an instance of InvAdj with List and three objects
		InvAdj invAdj1 = new InvAdj(1L, "Adjustment 1", 100.0, "INV001");
		InvAdj invAdj2 = new InvAdj(2L, "Adjustment 2", 200.0, "INV001");
//		InvAdj invAdj3 = new InvAdj(3L, "Adjustment 3", 300.0, "INV001");
		List<InvAdj> invAdjList = /*new ArrayList<>();*/
				List.of(invAdj1 , invAdj2/*, invAdj3*/);
		
		// Create an instance of InvAdjDto with List and three objects
		InvAdjDto invAdjDto1 = new InvAdjDto(1L, "Adjustment 1", 100.0, "INV001");
		InvAdjDto invAdjDto2 = new InvAdjDto(2L, "Adjustment 2", 200.0, "INV001");
		InvAdjDto invAdjDto3 = new InvAdjDto(0L, "Adjustment 3", 303.0, "INV001");
		List<InvAdjDto> invAdjDtoList = List.of(invAdjDto1 , invAdjDto2 , invAdjDto3);
		
		if(invAdjList.isEmpty()) {
			System.out.println("InvAdj List is empty in DB So DtoList Insert Save All ");
		}else {
			// Edit scenario Using Streams 
			Map<Long, InvAdj> modelById = invAdjList.stream()
			    .collect(Collectors.toMap(InvAdj::getInvId, Function.identity()));
			
			System.out.println("Checking if changes are needed..."+isChanged(modelById,invAdjDtoList));

			List<InvAdj> updatedList = new ArrayList<>();
			Set<Long> dtoIds = new HashSet<>();

			for (InvAdjDto dto : invAdjDtoList) {
			    if (dto.getInvId().equals(0L)) {
			        // New record
			        InvAdj m = new InvAdj();
			        m.setInvId(dto.getInvId());
			        m.setAdjName(dto.getAdjName());
			        m.setAdjValue(dto.getAdjValue());
			        m.setInvNumber(dto.getInvNumber());
			        updatedList.add(m);
			    } else {
			        // Update existing
			    		dtoIds.add(dto.getInvId());
			        InvAdj model = modelById.get(dto.getInvId());
			        	model.setAdjName(dto.getAdjName());
			        	model.setAdjValue(dto.getAdjValue());
			        updatedList.add(model);
			    }
			}

			// Models missing from DTOs
			List<InvAdj> notPresent = new ArrayList<>(modelById.values());
			notPresent.removeIf(m -> dtoIds.contains(m.getInvId()));

			System.out.println("Updated InvAdj List: " + updatedList);
			System.out.println("Not Present InvAdj List: " + notPresent);
		
		}
		
		
	}

}

//create a class with name InvAdj with columns inv_id, adj_name,adj_value, inv_number
//add a Lombok annotation @Data,@AllArgsConstructor,//and @NoArgsConstructor to the class InvAdj

@Data
@AllArgsConstructor
@NoArgsConstructor
class InvAdj {
	
	private Long invId;
	private String adjName;
	private Double adjValue;
	private String invNumber;

}

@Data
@AllArgsConstructor
@NoArgsConstructor
class InvAdjDto {
	
	private Long invId;
	private String adjName;
	private Double adjValue;
	private String invNumber;
	
}
