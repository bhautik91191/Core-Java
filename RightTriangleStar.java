package com.corejava;

/**
* Uses for loop and print the below-mentioned pattern.
* Right Triangle Star Output :
  * 
  * * 
  * * * 
  * * * * 
  * * * * *
*
* @author  Bhautik Padmani
* @version 1.8
* @since   March 2014 
*/
public class RightTriangleStar {

	public static void main(String[] args) {
		int rowNumber = 5;
		int i, j;

		// Outer loop for number of rows(n) 
		for(i = 0; i < rowNumber; i++) {

			// Inner loop for columns
			for(j = 0; j <= i; j++) {   
			    System.out.print("* "); // Print star
			}
              	    System.out.println(); // Ending line after each row
		}
	}

}
