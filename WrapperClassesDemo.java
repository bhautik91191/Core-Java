package com.corejava;

/**
* Create two wrapper class variable
* Compare two integer variable value 
* Output true or false check
*
* @author  Bhautik Padmani
* @version 1.8
* @since   March 2014 
*/
public class WrapperClassesDemo {

	public static void main(String[] args) {	
		// Create two variables of Wrapper class using Wrapper classes. 
		Integer integerObject1 = 11;
		Integer integerObject2 = 11;

		System.out.println(integerObject1 == integerObject2); // Output true
		System.out.println(integerObject1.equals(integerObject2)); // Output true
	}

}
