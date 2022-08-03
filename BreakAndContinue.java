package com.corejava;

public class BreakAndContinue {

	public static void main(String[] args) {
		
		System.out.println("Print 1 To 10 Num But After 7 Num to Break Statment");
		
		for (int i = 1; i <= 10; i++) {
			if (i == 7) 
			{
				break; // uses break statment
			}
			System.out.println(i);
		}
		
		System.out.println(); // space after program
		System.out.println("Print 1 To 10 Num 7 Num Skip And Continue Loop");
		
		for (int j = 1; j <= 10; j++) {
			if (j == 7) 
			{
				continue; // uses continue statment
			}
			System.out.println(j);
		}
	}

}
