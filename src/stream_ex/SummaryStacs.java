package stream_ex;

import java.util.Arrays;
import java.util.DoubleSummaryStatistics;
import java.util.List;
import java.util.stream.Collectors;

import org.apache.commons.lang3.ObjectUtils;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

public class SummaryStacs {
	
	public static void main(String[] args) {
		
		List<Product> products = Arrays.asList(
				new Product("Laptop", 75000d),
				new Product("Phone", 30000d),
				new Product("Tab", null),
				new Product("Watch", 5000d) );
		
		//First Way
//		DoubleSummaryStatistics summaryStatistics = products.stream()
//				.filter(obj -> ObjectUtils.isNotEmpty(obj.getPrice()))
//				.mapToDouble(Product::getPrice)
//				.summaryStatistics();
		
		//Second Way
		DoubleSummaryStatistics summaryStatistics = products.stream()
				.filter(obj -> ObjectUtils.isNotEmpty(obj.getPrice()))
				.collect(Collectors.summarizingDouble(Product::getPrice));
		
		System.out.println("Count : "+summaryStatistics.getCount());
		System.out.println("Total : "+summaryStatistics.getSum());
		System.out.println("Min : "+summaryStatistics.getMin());
		System.out.println("Max : "+summaryStatistics.getMax());
		System.out.println("Average : "+summaryStatistics.getAverage());
		
	}

}


@Data
@NoArgsConstructor
@AllArgsConstructor
class Product{
	
	private String name;
	private Double price;
	
}
