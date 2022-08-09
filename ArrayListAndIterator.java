package com.corejava;
import java.util.ArrayList;
import java.util.Iterator;

/**
* This is program use Array list and iterator
* List add string value
* Print all the values using an iterator
* 
* @author  Bhautik Padmani
* @version 1.8
* @since   March 2014
*/
public class ArrayListAndIterator {

	public static void main(String[] args) {
		ArrayList fruitList = new ArrayList(); // ArrayList
		fruitList.add("Banana"); // Add String value
		fruitList.add("Apple");
		fruitList.add("Mango");
		fruitList.add("Orange");
		fruitList.add("Cherry");

		// Print all the values using an iterator
		Iterator list = fruitList.iterator();

		while (list.hasNext()) {
			System.out.println(list.next());
		}
	}

}
