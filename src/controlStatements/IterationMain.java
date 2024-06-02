package controlStatements;

public class IterationMain {

	public static void main(String[] args) {
		// for
		String[] skils = { "Java", "Spring Boot", "Spring Security", "GIT" };
		
		for (int i = 0; i < skils.length; i++) {
			System.out.println(skils[i]);
		}
		//for each
		for(String skil : skils) {
			System.out.println(skil);
		}
		
		//While 
		int i = 1;
		while(i<=5) {
			System.out.println("While....");
			i++;
		}
		
		//do while
		do {
			System.out.println("Inside Do...");
		}while(i<=5);
		
		//Jump Statements -- break,continue,return
		
		for (int j = 0; j < skils.length; j++) {
			if(j==3) {
				break;
			}
			if(j==1) {
				continue;
			}
			System.out.println(skils[j]);
		}

	}

}
