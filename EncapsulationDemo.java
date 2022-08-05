package com.corejava;

/**
* The simple example of encapsulation that has only one field with its setter and getter methods.
* Setter Getter method use data hide
*
* @author  Bhautik Padmani
* @version 1.8
* @since   March 2014 
*/
class Student {

	private String studentName;

	// Setter Getter method
	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

}

public class EncapsulationDemo {

	public static void main(String[] args) {
		Student student = new Student(); // Create instance of the encapsulated class

		student.setStudentName("Bhautik"); // Set value in studentName

		System.out.println("Student Name is " + student.getStudentName()); // Get value in studentName and print student name
	}

}
