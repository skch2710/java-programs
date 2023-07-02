package collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SubList {

//	public static void insertRecords(List<?> records) {
//		int batchSize = 10; // Set the desired batch size
//		for (int i = 0; i < records.size(); i += batchSize) {
//			int endIndex = Math.min(i + batchSize, records.size());
//			List<?> batch = records.subList(i, endIndex);
//			System.out.println(batch);
//		}
//	}
	
	public static List<Integer> insertRecords(List<Integer> records) {
		List<Integer> recordsList = new ArrayList<>();
		int batchSize = 10; // Set the desired batch size
		for (int i = 0; i < records.size(); i += batchSize) {
			int endIndex = Math.min(i + batchSize, records.size());
			List<Integer> batch = records.subList(i, endIndex);
			System.out.println(batch);
			recordsList.addAll(batch);
		}
		return recordsList;
	}

	public static void main(String[] args) {

		List<Integer> records = Arrays.asList(55, 75, 4, 5, 6, 7, 8, 9, 4, 2, 5, 8, 7, 9);

		System.out.println(insertRecords(records));

	}

}
