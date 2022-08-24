package com.corejava;

/**
* Data abstraction to Abstract method
* Abstract class extends child to compulsory override method
*
* @author  Bhautik Padmani
* @version 1.8
* @since   March 2014 
*/
abstract class AbstractData1 {

	String myName;

	public abstract void setData(); // No method body and abstract

	public void show() {
		System.out.println("My Name is " + myName);
	}

}

class AbstractData2 extends AbstractData1 {

	@Override
	public void setData() {
		myName = "Bhautik";
	}

}

public class AbstractDemo {

	public static void main(String[] args) {
		AbstractData2 abstractData = new AbstractData2();
		abstractData.setData(); // Child class set method call
		abstractData.show(); // Call Abstract class method
	}

}
