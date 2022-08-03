package com.corejava;

// Documentation to while loop and do while loop
public class PrintUsingWhile {

	public static void main(String[] args) {
		int number1 = 1; 
		
		// Print statement
		System.out.println("While Loop Use Output is : ");
		
		while (number1 <= 10) {
			System.out.println(number1);
			number1++;
		}	
		int number2 = 1;
		
		// Print statement
		System.out.println("Do While Loop Use Output is : ");
				
		do {
			System.out.println(number2);
			number2++;
		} while (number2 <= 10); 
	}

}
