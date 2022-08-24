package com.corejava;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/**
* This class is used to show the sorting functionality.
*
* @author  Bhautik Padmani
* @version 1.8
* @since   March 2014
*/
public class ComparatorDemo {

	public static void main(String[] args) {
		// Creating an empty ArrayList of StudentDetails List type
		ArrayList<StudentDetails> studentList = new ArrayList<StudentDetails>();
		/* Adding entries in above List 
		Using add() method */
		studentList.add(new StudentDetails(111, "Mayank", 22));
		studentList.add(new StudentDetails(131, "Anshul", 44));
		studentList.add(new StudentDetails(121, "Solanki", 56));
		studentList.add(new StudentDetails(101, "Aggarwal", 13));
		// Use Comparator
		Comparator<StudentDetails> comparator = new SortByRoll();
		Collections.sort(studentList, comparator);
		System.out.println("Sorting by Name");

		for (StudentDetails student: studentList) {
			System.out.println(student.rollno + " " + student.name + " " + student.age);
		}
	}

}
