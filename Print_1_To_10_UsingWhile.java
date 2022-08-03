package com.corejava;

// documentation to while loop and do while loop
public class Print_1_To_10_UsingWhile {

	public static void main(String[] args) {
		int i = 1; // loop counter initialisation
		
		// print statement
		System.out.println("While Loop Use Output is : ");
		
		while (i <= 10) // loop to print 1 to 10.
		{
		System.out.println(i);
		i++;
		}
	
		int x = 1;
		
		// print statement
		System.out.println("do While Loop Use Output is : ");
				
		do {
			System.out.println(x);
			x++;
		} while (x <= 10); 
	}

}
