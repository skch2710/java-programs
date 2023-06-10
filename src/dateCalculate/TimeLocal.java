package dateCalculate;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class TimeLocal {

	public static LocalDateTime getCurrentISTTimestamp() {
		ZoneId istZoneId = ZoneId.of("Asia/Kolkata");
		ZonedDateTime currentDateTime = ZonedDateTime.now(istZoneId);
		return currentDateTime.toLocalDateTime();
	}

	public static void main(String[] args) {
		System.out.println(getCurrentISTTimestamp());
	}

}
