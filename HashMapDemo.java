package com.corejava;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/**
* This is program use HashMap - put Key and Value
* HashMap to cast entryset and Iterator get key and value one by one
* Print all the Key and value using an iterator
* 
* @author  Bhautik Padmani
* @version 1.8
* @since   March 2014
*/
public class HashMapDemo {

	public static void main(String[] args) {
		// Create HashMap
		HashMap studentInformation = new HashMap();
		studentInformation.put("FirstName", "Bhautik"); // Put Key and Value
		studentInformation.put("LastName", "Padmani");
		studentInformation.put("Emailid", "Bhautikpadmani007@gmail.com");
		studentInformation.put(1, "xyz");
		studentInformation.put('Q', "QDev Technolab");
		// Displaying the HashMap
		System.out.println("Now value is..." + studentInformation);
		// Using entrySet() to get the set view
		Set studentSet = studentInformation.entrySet();
		System.out.println("The set is: " + studentSet);
		Iterator studentIterator = studentSet.iterator();

		while (studentIterator.hasNext()) {
			Map.Entry studentEntry = (Map.Entry)studentIterator.next();
			System.out.println("Key is..." + studentEntry.getKey());
			System.out.println("Value is..." + studentEntry.getValue());
			System.out.println();
		}
	}

}
