package arraysEx;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class ArrayEx {

	public static void main(String[] args) {

		int[] data = {2, 6, 8, 7};
        List<Integer> list = Arrays.stream(data).boxed().collect(Collectors.toList());
        System.out.println(list);
        
        int secondHighest = Arrays.stream(data)
                .distinct()
                .boxed()
                .sorted((a, b) -> b - a)
                .skip(1)
                .findFirst()
                .orElseThrow(() -> new RuntimeException("No second highest number"));
        
        int secondHigh = Arrays.stream(data)
                .distinct()
                .boxed()
                .sorted(Comparator.reverseOrder())
                .skip(1)
                .findFirst()
                .orElseThrow(() -> new RuntimeException("No second highest number"));
        
        System.out.println(secondHigh);
        
        Integer integer = list.stream().distinct().sorted(Comparator.reverseOrder())
        	.skip(1).findFirst().get();
        
        System.out.println(integer);

	}

}
