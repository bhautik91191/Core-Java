package com.corejava;

/**
* This class represents a SchoolStudent and
* implements Comparable.
*
* @author  Bhautik Padmani
* @version 1.8
* @since   March 2014
*/
// Interface comparable
public class SchoolStudent implements Comparable {

	private String name;
	private String rollNo;
	private int age;

	// Argument constructor
	public SchoolStudent(String name, String rollNo, int age) {
		this.name = name;
		this.rollNo = rollNo;
		this.age = age;
	}

	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getRollNo() {
		return rollNo;
	}
	
	public void setRollNo(String rollNo) {
		this.rollNo = rollNo;
	}
	
	public int getAge() {
		return age;
	}
	
	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public int compareTo(Object object) {
		SchoolStudent schoolStudent = (SchoolStudent)object;
		return (this.name).compareTo(schoolStudent.name); // Compare to name
	}

}
