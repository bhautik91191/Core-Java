package com.corejava;

/**
* Print 1 to 10 numbers
* Uses While Loop and Do While Loop
*
* @author  Bhautik Padmani
* @version 1.8
* @since   March 2014 
*/
public class PrintUsingWhile {

	public static void main(String[] args) {
		int number1 = 1; // Loop counter initialisation

		System.out.println("While Loop Use Output is : ");

		// Loop to print 1 to 10.
		while (number1 <= 10) {
			System.out.println(number1);
			number1++;
		}
		int number2 = 1;

		System.out.println("Do While Loop Use Output is : ");

		do {
			System.out.println(number2);
			number2++;
		} while (number2 <= 10);
	}

}
