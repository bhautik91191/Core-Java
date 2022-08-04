package com.corejava;

/**
* Create programs of all the string methods like
* Uses length(), toUpperCase(), toUpperCase(), substring(), charAt(), equalsIgnoreCase(), compareTo().
*
* @author  Bhautik Padmani
* @version 1.8
* @since   March 2014 
*/
public class StringMethodDemo {

	public static void main(String[] args) {
		// Create String Object
		String stringObject = new String("This is QDEV Technolab...");

		System.out.println("Orignal is..." + stringObject);
		System.out.println("Lenth is..." + stringObject.length());
		System.out.println("Uppercase is... " + stringObject.toUpperCase());
		System.out.println("Lowercase is... " + stringObject.toLowerCase());
		System.out.println("Substring is... " + stringObject.substring(2));
		System.out.println("Substring is... " + stringObject.substring(2,4));
		System.out.println("Char at is... " + stringObject.charAt(2));
		System.out.println("Compare is " + stringObject.compareTo("This is QDEV Technolab.."));

		// Check the equalsIgnoreCase uses if / else condition
		if (stringObject.equalsIgnoreCase("This is QDEV Technolab...")) {
			System.out.println("Stirng are equals");		
		} else {
			System.out.println("Stirng are not equals");
		}
	}

}
