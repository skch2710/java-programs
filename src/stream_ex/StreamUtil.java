package stream_ex;

import java.time.LocalDate;
import java.util.AbstractMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamUtil {

	public static Map<LocalDate, List<String>> groupByDateFields(Stream<Entry<LocalDate, String>> stdata) {
		Map<LocalDate, List<String>> sortedByDateFields = stdata.filter(entry -> entry.getKey() != null)
				.collect(Collectors.groupingBy(Map.Entry::getKey, TreeMap::new,
						Collectors.mapping(Map.Entry::getValue, Collectors.toList())));
		return sortedByDateFields;
	}
	
	public static <K, V> Map.Entry<K, V> pair(K key, V value) {
        return new AbstractMap.SimpleEntry<>(key, value);
    }
}
