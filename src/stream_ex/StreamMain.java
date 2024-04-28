package stream_ex;

import java.time.LocalDate;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Stream;

import dateCalculate.DateUtil;
import lombok.Data;

public class StreamMain {
	
	public static void main(String[] args) {
		
		DateClass dateClass = new DateClass();
		
		Stream<Entry<LocalDate, String>> stdata = Stream.of(
				StreamUtil.pair(dateClass.getDob(), "DOB"),
				StreamUtil.pair(dateClass.getJoin(), "JOIN"),
				StreamUtil.pair(dateClass.getResign(), "RESIGN"),
				StreamUtil.pair(dateClass.getReJoin(), "RE JOIN")
        );
		
		Map<LocalDate, List<String>> result = StreamUtil.groupByDateFields(stdata);
		System.out.println(result);
	}

}

@Data
class DateClass {
	private LocalDate dob;
	private LocalDate join;
	private LocalDate resign;
	private LocalDate reJoin;
	
	public DateClass() {
		this.dob = DateUtil.stringToDate("01/01/2003", "dd/MM/yyyy");
		this.join = DateUtil.stringToDate("05/01/2000", "dd/MM/yyyy");
		this.resign = DateUtil.stringToDate("01/01/2001", "dd/MM/yyyy");
		this.reJoin = DateUtil.stringToDate("01/01/2001", "dd/MM/yyyy");
	}
}
