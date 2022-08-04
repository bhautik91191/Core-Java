package com.corejava;

/**
* First constructor simply displays "Good Mornnig" to the standard output
* Second constructor two integer variable and output total sum
* Uses Constructor and Parameterized Constructor
*
* @author  Bhautik Padmani
* @version 1.8
* @since   March 2014 
*/
public class Constructors {

	// Constructor
	public Constructors() {
		System.out.println("Good Mornnig");
	}

	// Parameterized constructor
	public Constructors(int number1, int number2) {
		System.out.println("Total Sum is "+ (number1 + number2));
	}

	public static void main(String[] args) {
		Constructors firstConstructor = new Constructors();
		Constructors secondConstructor = new Constructors(10, 20);
	}

}
