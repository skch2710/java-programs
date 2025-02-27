package inputReaderScanner;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class InputReaderScanner {
	
	public static void main(String[] args) throws Exception {
		
		//Using Scanner
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int number = scanner.nextInt();  // Reads next integer

		System.out.print("Enter a word: ");
		String word = scanner.next();  // Reads next word

		System.out.print("Enter a full sentence: ");
		scanner.nextLine(); // Consume the leftover newline
		String sentence = scanner.nextLine(); // Reads entire line

		System.out.println("Number: " + number);
		System.out.println("Word: " + word);
		System.out.println("Sentence: " + sentence);
		scanner.close();
		
		//Using BufferedReader
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter text: ");
		String input = reader.readLine(); // Reads the entire line
		System.out.println("You entered: " + input);

		
	}

}
