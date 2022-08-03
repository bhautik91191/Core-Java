package com.corejava;

/*
 Right triangle star output :
 * 
 * * 
 * * * 
 * * * * 
 * * * * *
*/
public class RightTriangleStar {

	public static void main(String[] args) {
		int n = 5;
		int i, j;
		
		for(i = 0; i < n; i++) {  // Outer loop for number of rows(n)
			for(j = 0; j <= i; j++) { // Inner loop for column       
			    System.out.print("* "); // Print star
			}           
        	   System.out.println(); // Ending line after each row
		}
	}

}
