package collections.map_ex;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

public class MapEx {

	public static void main(String[] args) {

		Map<Long, String> queMap = new HashMap<>();
		queMap.put(1L, "ans1");
		queMap.put(3L, "Ans222");

		List<Qans> listQans = new ArrayList<>();
		listQans.add(new Qans(1L, "Ans1"));
		listQans.add(new Qans(2L, "Ans2"));

		int matched = 0;

		for (Qans qans : listQans) {
			Long key = qans.getId();
			String value = qans.getAns();
			if (queMap.containsKey(key) && queMap.get(key).equalsIgnoreCase(value)) {
				matched++;
			}
		}
		
		long matched2 = listQans.stream()
                .filter(qans -> queMap.containsKey(qans.getId()) 
                		&& queMap.get(qans.getId()).equalsIgnoreCase(qans.getAns()))
                .count();

        System.out.println(matched2);
		
		System.out.println(matched);
	}

}

@Data
@NoArgsConstructor
@AllArgsConstructor
class Qans {
	private Long id;
	private String ans;
}
