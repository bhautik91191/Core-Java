package com.corejava;

/**
* Single Inheritance child to parent class extends and access variable
* Child class to call parent method and child method
* Multi-level Inheritance child to parent and parent to grand parent
* 
* @author  Bhautik Padmani
* @version 1.8
* @since   March 2014
*/
class CollageStudent {

	String studentName;
	int studentRollno;

	public void setData() {
		studentName = "Bhautik";
		studentRollno = 55;
	}

}

class BranchName extends CollageStudent {

	String branchName = "computer";

	public void display() {
		System.out.println("Student Name :" + studentName);
		System.out.println("Student Rollno :" + studentRollno);
		System.out.println("Branch Name : "+ branchName);
	}

}

class SportName extends BranchName {

	String sportName = "Cricket";

	public void display() {
		System.out.println("Student Name :" + studentName);
		System.out.println("Student Rollno :" + studentRollno);
		System.out.println("Branch Name :" + branchName);
		System.out.println("Sport Name :" + sportName);
	}

}

public class InheritanceDemo1 {

	public static void main(String[] args) {
		// Single Inheritance
		BranchName branchName = new BranchName();
		branchName.setData();
		branchName.display();

		// Multi-level Inheritance
		SportName sportName = new SportName(); // Child class object
		branchName.setData(); // Call parent class method
		branchName.display(); // Call child class method
	}

}
