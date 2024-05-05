package collections.list_ex;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

public class ListEx {
	
	public static void main(String[] args) {
		List<Qans> listDB = new ArrayList<>();
		listDB.add(new Qans(2L, "ans2"));
		listDB.add(new Qans(3L, "Ans2"));
		
		List<Qans> listR = new ArrayList<>();
		listR.add(new Qans(1L, "Ans1"));
		listR.add(new Qans(2L, "Ans2"));
		
		int matched = 0;
		
		for (Qans qans : listDB) {
			for (Qans lr : listR) {
				if(qans.getId().equals(lr.getId()) 
						&& qans.getAns().equalsIgnoreCase(lr.getAns())) {
					matched++;
				}
			}
		}
		
		long matched1 = listDB.stream()
                .filter(db -> listR.stream()
                        .anyMatch(r -> db.getId().equals(r.getId()) 
                        		&& db.getAns().equalsIgnoreCase(r.getAns())))
                .count();
		
		// Convert listR to a HashMap using streams
        Map<Long, String> mapR = listR.stream()
                .collect(Collectors.toMap(Qans::getId, Qans::getAns));
        
        long matched2 = listDB.stream()
                .filter(qans -> mapR.containsKey(qans.getId()) 
                		&& mapR.get(qans.getId()).equalsIgnoreCase(qans.getAns()))
                .count();

        System.out.println(matched2);
		
		System.out.println(matched);
		System.out.println(matched1);
	}

}

@Data
@NoArgsConstructor
@AllArgsConstructor
class Qans {
	private Long id;
	private String ans;
}