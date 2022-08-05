package com.corejava;

/**
* Compile Time Polymorphism
* To same name method and parameter different
* Which add method would be called is determined by the parameter list at the compile time.
* That is the reason this is also known as compile time polymorphism.
* 
* @author  Bhautik Padmani
* @version 1.8
* @since   March 2014 
*/
class Calculation {

	// Same name method but argument different
	public int add(int number1, int number2) {
		return number1 + number2;
	}

	// Same name method but argument different
	public int add(int number1, int number2, int number3) {
		return number1 + number2 + number3;
	}

}

public class CompileTimePolymorphism {

	public static void main(String[] args) {
		Calculation test = new Calculation();
		System.out.println("Print Result " + test.add(15, 30));
		System.out.println("Print Result " + test.add(15, 30, 40));
	}

}
