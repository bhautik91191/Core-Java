package com.corejava;
import java.util.Comparator;

/**
* This class represents a SchoolStudent and
* Implements Comparable.
*
* @author  Bhautik Padmani
* @version 1.8
* @since   March 2014
*/
class SortByRoll implements Comparator<StudentDetails> {

	@Override
	public int compare(StudentDetails o1, StudentDetails o2) {
		return o1.rollno - o2.rollno;
	}

}

public class StudentDetails {

	int rollno;
	String name;
	int age;

	StudentDetails(int rollno, String name, int age) {
		this.rollno = rollno;
		this.name = name;
		this.age = age;
	}

}
