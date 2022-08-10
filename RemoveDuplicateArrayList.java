package com.corejava;
import java.util.List;
import java.util.Set;
import java.util.ArrayList;
import java.util.LinkedHashSet;

/**
* Use list and set
* Remove duplicate values of the list
* Convert list to set
* 
* @author  Bhautik Padmani
* @version 1.8
* @since   March 2014
*/
public class RemoveDuplicateArrayList {

	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		list.add("A");
		list.add("B");
		list.add("C");
		list.add("D");
		list.add("C");
		list.add("E");
		list.add("E");
		list.add("E");
		System.out.println("Current List" + list.toString()); // Old List Print
		Set<String> set = new LinkedHashSet<String>(list); // ArrayList to Convert set
		System.out.println("Remove Duplicate List Element" + set); // Convert
	}

}
