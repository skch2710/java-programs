package introductionAndFeatures1;

import java.util.Scanner;

public class InputAndOutput {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in); //Input

		System.out.println("Enter Two Nubers : ");

		int a, b, sum;

		a = sc.nextInt();
		b = sc.nextInt();

		sum = a + b;

		System.out.println("Sum is : " + sum); //Output
		
		sc.close();
	}

}
