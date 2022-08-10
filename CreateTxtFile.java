package com.corejava;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/**
* Create New Text file
* Add Personal Data text file 
*
* @author  Bhautik Padmani
* @version 1.8
* @since   March 2014 
*/
public class CreateTxtFile {

	public static void main(String[] args) {
		// Create a text file
		File file = new File("myTestFile.txt");

		try {
			file.createNewFile();
		} catch (Exception e) {
			e.printStackTrace();
		}

		try {
			FileWriter fileWriter = new FileWriter("myTestFile.txt");
			String myName = "Bhautik Padmani";
			String city = "Ahmedabad";
			fileWriter.write(myName); // Write char
			fileWriter.write(city); // Write char
			fileWriter.flush(); // File flush
			fileWriter.close(); // File close
			System.out.println("Data Write...");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
