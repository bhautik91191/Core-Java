package com.corejava;
import java.util.Scanner;

/**
* This program throw and throws use
* Customer amount deposit and withdrawn
* Withdrawn amount and Current balance check and throw error Insufficient Balance Exception
* 
* @author  Bhautik Padmani
* @version 1.8
* @since   March 2014
*/
class InsufficientBalanceException extends Exception {

	double amount;
	public InsufficientBalanceException(double amount) {
		this.amount = amount;
	}

}

class ATM {

	double balance;
	public void deposit(double amount) {
		balance = amount + balance;
		System.out.println(amount + " Deposit sucessfully...");
	}

	public void withdraw(double amount) throws InsufficientBalanceException {
		if (balance >= amount) {
			balance -= amount;
			System.out.println(amount + " Withdrawn sucessfully...");
		} else {
			throw new InsufficientBalanceException(amount - balance);
		}
	}

}

public class CustomerExceptionDemo {

	public static void main(String[] args) {
		Scanner userScanner = new Scanner(System.in);
		ATM bankATM = new ATM();
		System.out.println("Enter Deposit Amount : ");
		double amount = userScanner.nextDouble();
		bankATM.deposit(amount);
		System.out.println("Enter Withdrawn Amount : ");
		amount = userScanner.nextDouble();

		try {
			bankATM.withdraw(amount);
		} catch (InsufficientBalanceException e) {
			System.out.println("Your balance is Insufficiant by " + e.amount + "Rs");
		}
	}

}
