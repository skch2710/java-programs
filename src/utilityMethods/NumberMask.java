package utilityMethods;

public class NumberMask {
	
	public static String maskNum(Long number) {
//		StringBuilder sb = new StringBuilder(number.toString());
		StringBuffer sb = new StringBuffer(number.toString());
		String x = "X".repeat(sb.length()-4);
		return x+sb.substring(sb.length()-4, sb.length());
	}
	
	public static String maskNum(String name) {
		StringBuffer sb = new StringBuffer(name);
		String x = "X".repeat(sb.length()-4);
		return x+sb.substring(sb.length()-4, sb.length());
	}
	
	public static void main(String[] args) {
		
		System.out.println(maskNum(9490524580L));
		System.out.println(maskNum("086610100079052"));
		System.out.println(maskNum("SATHISH KUMAR"));
		
	}

}
