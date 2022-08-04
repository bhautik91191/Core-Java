package com.corejava;

/**
* Find the current month name from the given number
* Uses Switch case statement
*
* @author  Bhautik Padmani
* @version 1.8
* @since   March 2014 
*/
public class MonthFind {

	public static void main(String[] args) {
		int monthLength = 5;

		// Uses switch case statement and find current month.
		switch (monthLength) {
			case 1:
				System.out.println("Current Month is January");
				break;
			case 2:
				System.out.println("Current Month is February");
				break;
			case 3:
				System.out.println("Current Month is March");
				break;
			case 4:
				System.out.println("Current Month is April");
				break;
			case 5:
				System.out.println("Current Month is May");
				break;
			case 6:
				System.out.println("Current Month is June");
				break;
			case 7:
				System.out.println("Current Month is July");
				break;
			case 8:
				System.out.println("Current Month is August");
				break;
			case 9:
				System.out.println("Current Month is September");
				break;
			case 10:
				System.out.println("Current Month is October");
				break;
			case 11:
				System.out.println("Current Month is November");
				break;
			case 12:
				System.out.println("Current Month is December");
				break;
		}
	}

}
