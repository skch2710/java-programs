package arraysEx;

import java.util.Arrays;

public class ArraysMain {
	
	//--> Used to store Collection of Similar datatype values (Homogenous).
	//Types 1.Single Dimential a[] 
	//2.Multi Dimential a[][] , a[][][] , ....

	public static void main(String[] args) {
		
		int exone[];
		exone = new int[2];
		exone[0]=1;
		exone[1]=2;
		
		System.out.println(exone);
		
		for (int value : exone) {
			System.out.println(value);
			
		}
		
		String extwo[] = {"One","Two"};
		
		String extwod[] = {"One","Two"};
		
		for (String value : extwo) {
			System.out.println(value);
			
		}
		
		
		System.out.println("Compare Two Arrays as same data types: "+Arrays.equals(extwo ,extwod));
		
	}

}
