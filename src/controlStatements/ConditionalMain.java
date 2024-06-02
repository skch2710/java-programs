package controlStatements;

public class ConditionalMain {

	public static void main(String[] args) {

		boolean condition = true;
		boolean condition1 = true;

		// Simple If
		if (condition) {
			System.out.println("Output....");
		}

		// If... else
		if (condition) {
			System.out.println("Output.... If");
		} else {
			System.out.println("Output....Else");
		}

		// When the if block executes, the program does not check the other conditions
		// (else if and else).
		// else if
		if (condition) {
			System.out.println("Output.... If");
		} else if (condition1) {
			System.out.println("Output....Else If");
		} else {
			System.out.println("Output....Else");
		}

		// Switch

		switch (1) {
		case 1:
			System.out.println("One");
			break;
		case 2:
			System.out.println("Two");
			break;
		case 4:
			System.out.println("Four");
			break;
		default:
			System.out.println("Default...");
			break;
		}

	}

}
