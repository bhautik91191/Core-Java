package com.corejava;

/**
* Interface class create EmployeeInter
* Implements interface to class and use interface class variable
*
* @author  Bhautik Padmani
* @version 1.8
* @since   March 2014
*/
// Interface
interface EmployeeInter {

	String employeeName = "Bhautik";

}

// Class to implement Interface and use variable
class EmployeeDetails implements EmployeeInter {

	public void show() {
		System.out.println("Employee Name :" + employeeName); // Interface variable use
	}

}

public class InterFaceDemo {

	public static void main(String[] args) {
		EmployeeDetails employeeDetails = new EmployeeDetails();
		employeeDetails.show();
	}

}
