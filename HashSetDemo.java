package com.corejava;
import java.util.HashSet;
import java.util.Iterator;

/**
* This is program use HashSet 
* Add HashSet any data type value
* Print all the values using an iterator
* 
* @author  Bhautik Padmani
* @version 1.8
* @since   March 2014
*/
public class HashSetDemo {

	public static void main(String[] args) {
		HashSet employeeDetails = new HashSet();
		System.out.println("Defult Size is..." + employeeDetails.size()); // HashSet Size
		System.out.println("Defult Value is..." + employeeDetails); // HashSet Default Value
		employeeDetails.add(100); // Add Value
		employeeDetails.add("Bhautik");
		employeeDetails.add(10.02f);
		employeeDetails.add('Q');
		employeeDetails.add("bhautik");
		employeeDetails.add(new Integer(123));
		System.out.println("Now Size is..." + employeeDetails.size());
		System.out.println("Now Vlaue is..." + employeeDetails);
		employeeDetails.remove("Bhautik"); // Remove element
		System.out.println("Now Size is..." + employeeDetails.size());
		System.out.println("Now Vlaue is..." + employeeDetails);
		Iterator employeeIterator = employeeDetails.iterator();

		while(employeeIterator.hasNext()) {
			System.out.println(employeeIterator.next()); // All HashSet Value print
		}
	}

}
