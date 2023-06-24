package collections;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class ListGroup {

	public static void main(String[] args) {

		List<Sathish> sTotal = new ArrayList<>();

		Sathish s1 = new Sathish(1L, "s1","sk");
		Sathish s2 = new Sathish(2L, "s2","ss");
		Sathish s3 = new Sathish(3L, "s3","ch");
		Sathish s4 = new Sathish(1L, "s4","sk");
		Sathish s5 = new Sathish(1L, "s5","sk");

		sTotal.add(s1);
		sTotal.add(s2);
		sTotal.add(s3);
		sTotal.add(s4);
		sTotal.add(s5);

		System.out.println(sTotal);
		
		Map<Long, List<Sathish>> classByGroupId = sTotal.stream()
				.collect(Collectors.groupingBy(Sathish::getId));
		
//		List<SathishGroupedList> sathishGroupedList = new ArrayList<>();
//
//		classByGroupId.entrySet().stream().forEach(innerEntry -> {
//			
//			SathishGroupedList sathishGrouped = new SathishGroupedList();
//			
//			List<Sathish> groupedInnerList = innerEntry.getValue();
//
//			sathishGrouped.setId(groupedInnerList.get(0).getId());
//			sathishGrouped.setGroupedList(groupedInnerList);
//			sathishGroupedList.add(sathishGrouped);
//		});
		
		List<SathishGroupedList> sathishGroupedList = classByGroupId.entrySet().stream()
				.map(innerEntry -> {
			SathishGroupedList sathishGrouped = new SathishGroupedList();
			List<Sathish> groupedInnerList = innerEntry.getValue();
			sathishGrouped.setId(groupedInnerList.get(0).getId());
			sathishGrouped.setEmail(groupedInnerList.get(0).getEmail());
			sathishGrouped.setGroupedList(groupedInnerList);
			return sathishGrouped;
		}).collect(Collectors.toList());
		
//		List<SathishGroupedList> sathishGroupedList = sTotal.stream()
//			    .collect(Collectors.groupingBy(Sathish::getId))
//			    .entrySet().stream()
//			    .map(entry -> new SathishGroupedList(entry.getKey(),entry.getValue().get(0).getEmail(), entry.getValue()))
//			    .collect(Collectors.toList());

		System.out.println(sathishGroupedList);
		
		/**
		 * 
		 [SathishGroupedList 
				[  id=1, 
					groupedList =[Sathish [id=1, name=s1], Sathish [id=1, name=s4], Sathish [id=1, name=s5]]], 
		  SathishGroupedList 
				[  id=2, 
					groupedList=[Sathish [id=2, name=s2]]], 
		  SathishGroupedList 
				[id=3, 
					groupedList=[Sathish [id=3, name=s3]]]]
		
		 */

	}
}
