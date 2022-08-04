package com.corejava;

/**
* Data abstraction to Abstract method
* Abstract class extends child to compulsory override method
*
* @author  Bhautik Padmani
* @version 1.8
* @since   March 2014 
*/
// Abstract class
abstract class AbstractData1 {

	String myName;

	public abstract void setData(); // No method body and abstract

	public void show() {
		System.out.println("My Name is " + myName);
	}
}

class AbstractData2 extends AbstractData1{

	@Override
	public void setData() {
		myName = "BHautik";
	}

}

public class AbstractDemo {

	public static void main(String[] args) {
		AbstractData2 demo = new AbstractData2();
		demo.setData(); // Child class set method call
		demo.show(); // Call Abstract class method
	}

}
