package com.corejava;

/**
* Run Time Polymorphism
* When an overridden method is called through a reference of parent class
* then type of the object determines which method is to be executed.
*
* @author  Bhautik Padmani
* @version 1.8
* @since   March 2014 
*/
class PolymorphismTest {

	public void polymorphismMethod() {
		System.out.println("Method One");
	}

}

public class RunTimePolymorphism extends PolymorphismTest {

	@Override
	public void polymorphismMethod() {
		System.out.println("Method second");
	}

	public static void main(String[] args) {
		PolymorphismTest test = new RunTimePolymorphism();
		test.polymorphismMethod(); // Run time only override method called
	}

}
