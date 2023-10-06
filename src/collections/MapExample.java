package collections;

import java.util.HashMap;
import java.util.Map;

public class MapExample {
	
	public static void main(String[] args) {
		Map<String,Object> map = new HashMap<>();
		map.put("type", "application/zip");
		map.put("fileName", "ex.zip");
		
		System.out.println(map.get("type").toString());
		System.out.println(map.get("fileName").toString());
		
		Map<String,String> values = new HashMap<>();
		map.put("type", "application/zip");
		map.put("fileName", "ex.zip");
		
		System.out.println(map.get("type"));
		System.out.println(map.get("fileName"));
	}

}
