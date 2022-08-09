package com.corejava;

import java.util.Scanner;

/**
* This program uses try, catch, finally
* The try statement defines a block to run.
* The catch statement defines a code block to handle any error.
* The finally statement defines a code block to run regardless of the result.
* Enter Two value divide and result
* 5 / 0 = error 
*
* @author  Bhautik Padmani
* @version 1.8
* @since   March 2014
*/
public class ExceptionHandlingDemo {

	public static void main(String[] args) {
		try {
			Scanner scannerObject = new Scanner(System.in);
			System.out.println("First Number :");
			int number1 = scannerObject.nextInt();
			System.out.println("Second Number :");
			int number2 = scannerObject.nextInt();
			int divideNumber = number1 / number2; // Division
			System.out.println("division value :" + divideNumber);
		} catch (Exception e) {
			e.printStackTrace(); // Show error
			System.out.println("Error");
		} finally {
			System.out.println("Thank You"); // Finally Output print
		}
	}

}
