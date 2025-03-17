package systemTime;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class SystemTime {
	
	public static void main(String[] args) throws Exception {
		
		long start = System.currentTimeMillis();
//		Thread.sleep(Duration.ofMillis(2000));
		
		long end = System.currentTimeMillis();
		
		long totalTime = end - start;
		
		System.out.println(totalTime);
		
		System.out.println(totalTime/1000.000);
		
		long seconds = TimeUnit.MILLISECONDS.toSeconds(totalTime);

		System.out.println(seconds);

	}

}
