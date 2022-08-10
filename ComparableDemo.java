package com.corejava;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

/**
* This class is used to show the sorting functionality.
*
* @author  Bhautik Padmani
* @version 1.8
* @since   March 2014
*/
public class ComparableDemo {

	public static void main(String[] args) {
		ArrayList studentList = new ArrayList();
		studentList.add(new SchoolStudent("Sandy", "MCA/12", 28));
		studentList.add(new SchoolStudent("Rony", "MCA/45", 28));
		studentList.add(new SchoolStudent("Sunil", "MCA/67", 27));
		studentList.add(new SchoolStudent("Munish", "MCA/90", 27));
		// Use iterator
		Iterator iterator=studentList.iterator();

		while (iterator.hasNext()) {  
			SchoolStudent student=(SchoolStudent)iterator.next();
			System.out.println("Name:" + "" + student.getName() +
							", RollNo:" + student.getRollNo() +
							", Age:" + student.getAge());
		}
	}

}
