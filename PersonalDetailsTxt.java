package com.corejava;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
* File Reader and Print character
* Use try and catch, while loop
*
* @author  Bhautik Padmani
* @version 1.8
* @since   March 2014 
*/
public class PersonalDetailsTxt {

	public static void main(String[] args) {
		// Exception Handling
		try {
			// Using File Handling
			FileReader fileReader = new FileReader("myTestFile.txt");
			int number;

			// Loop
			while ((number = fileReader.read()) != -1) {
				System.out.print((char)number);
			}
			fileReader.close();
		} catch (Exception exception) {
			exception.printStackTrace();
		}
	}

}
