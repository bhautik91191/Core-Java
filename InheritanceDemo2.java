package com.corejava;

/**
* Hierarchical Inheritance program
* One parent and two child call method
*
* @author  Bhautik Padmani
* @version 1.8
* @since   March 2014 
*/
class Animal {
	
	public void voice() {
		System.out.println("Animal Voice");
	}

}

class Camel extends Animal {
	
	public void camelVoice() {
		System.out.println("Camel Voice Grunt...");
	}

}

class Dog extends Animal {

	public void dogVoice() {
		System.out.println("Dog Voice barking...");
	}

}

public class InheritanceDemo2 {

	public static void main(String[] args) {
		Dog dog = new Dog();
		dog.voice();
		dog.dogVoice();
	}

}
