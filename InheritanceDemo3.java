package com.corejava;

/**
* Hierarchical Inheritance
* Father to Inherits GrandFather properties
* Son to Inherits Father properties
* Daughter to Inherits Father properties 
* 
* @author  Bhautik Padmani
* @version 1.8
* @since   March 2014 
*/
// Parent class
class GrandFather {

	public void show() {
		System.out.println("I am GrandFather");
	}

}

// Inherits GrandFather properties
class Father extends GrandFather {

	public void show() {
		System.out.println("I am Father");
	}

}

// Inherits Father properties
class Son extends Father {

	public void show() {
		System.out.println("I am Son");
	}

}

// Inherits Father properties
class Daughter extends Father {

	public void show() {
		System.out.println("I am Daughter");
	}

}

public class InheritanceDemo3 {

	public static void main(String[] args) {
		Daughter daughter = new Daughter();  
		daughter.show();
	}

}
