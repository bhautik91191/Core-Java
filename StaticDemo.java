package com.corejava;

/**
* Static Keyword uses static methods, variables, and blocks
* Static method to use static variable and store value to output method variable value
* Static variable last value set memory store
* Static block buy default run with class not static block object
*
* @author  Bhautik Padmani
* @version 1.8
* @since   March 2014 
*/
class StaticKeywordDemo {

	int number;
	static int staticNumber; // Static Variable

	// Static Method
	public static void show() {
		staticNumber = 123456;
		System.out.println("Static Method Number is ..." + staticNumber);
	}

	// Static Block
	static {
		staticNumber = 100;
		System.out.println("Static block is..." + staticNumber);
	}

}

public class StaticDemo {

	public static void main(String[] args) {
		StaticKeywordDemo demo1 = new StaticKeywordDemo();
		StaticKeywordDemo demo2 = new StaticKeywordDemo();
		StaticKeywordDemo demo3 = new StaticKeywordDemo();
		demo1.show();

		// Local variable set values
		demo1.number = 10;
		demo2.number = 20;
		demo3.number = 30;

		System.out.println("First Number is " + demo1.number);
		System.out.println("Second Number is " + demo2.number);
		System.out.println("Third Number is " + demo3.number);

		// Static variable set value
		demo1.staticNumber = 10;
		demo2.staticNumber = 20;
		demo3.staticNumber = 30;

		// Stitic varible last value store output print
		System.out.println("First Static Number is " + demo1.staticNumber);
		System.out.println("Second Static Number is " + demo2.staticNumber);
		System.out.println("Third Static Number is " + demo3.staticNumber);
	}

}
