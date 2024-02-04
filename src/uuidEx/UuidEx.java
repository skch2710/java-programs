package uuidEx;

import java.util.UUID;

public class UuidEx {

	public static void main(String[] args) {
		String uuid = UUID.randomUUID().toString();
		
		System.out.println(uuid);
		System.out.println(uuid.split("-")[4]);
		
		String uuidTime = uuid + "#"+System.currentTimeMillis();
		System.out.println(uuidTime);
		
		String newUuid = uuid.split("-")[4]+"#"+System.currentTimeMillis();
		System.out.println(newUuid);
		
	}
	
}
