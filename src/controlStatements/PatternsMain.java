package controlStatements;

public class PatternsMain {
	
	public static void main(String[] args) {
		
		for (int i = 1; i <= 5; i++) {
			System.out.println("*".repeat(i));
		}
		
		for (int i = 1; i <= 10; i++) {
			if(i%2==1) {
				System.out.println("*".repeat(i));
			}
		}
		
		for (int i = 5; i >= 1; i--) {
			System.out.println("*".repeat(i));
		}
		
		for (int i = 1; i <= 5; i++) {
            // Print leading spaces
            for (int j = 5; j > i; j--) {
                System.out.print(" ");
            }

            // Print asterisks
            for (int k = 1; k <= (2 * i - 1); k++) {
                System.out.print("*");
            }

            // Move to the next line
            System.out.println();
        }
	}

}
