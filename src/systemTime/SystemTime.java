package systemTime;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class SystemTime {
	
	public static void logTime(long milliSec) {
		System.out.println("Milli : " + milliSec);
		System.out.println("Sec : " + (milliSec/1000.00));
		System.out.println("Min : " + ((milliSec/1000.00)/60));
	}
	
	public static void main(String[] args) throws Exception {
		
		long start = System.currentTimeMillis();
		Thread.sleep(Duration.ofMillis(2260));
		
		long end = System.currentTimeMillis();
		
		long totalTime = end - start;
		
		System.out.println(totalTime);
		
		logTime(totalTime);
		
		long seconds = TimeUnit.MILLISECONDS.toSeconds(totalTime);

		System.out.println(seconds);

	}

}
