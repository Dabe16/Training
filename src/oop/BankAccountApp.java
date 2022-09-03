package oop;

import java.awt.image.BandCombineOp;

public class BankAccountApp {

	public static void main(String[] args) {
		// Creating new bank account >> think instantiate an object
		//We can overwrite
		
		bankAccount acc1 = new bankAccount();
		
		//With Encapsulation: public API methods
		acc1.setName("Dave Solatre");
		System.out.println(acc1.getName());
		acc1.setSSS("23123123");
		System.out.println("SSS: " + acc1.getSSS());
		
		acc1.accountNumber = "831231";
		acc1.balance = 10000;
		acc1.setRate();
		acc1.inceaseRate();
		
		acc1.deposit(1500);
		acc1.deposit(1500);
		acc1.deposit(1500);
		acc1.withdraw(2000);
	
		
		
		System.out.println(acc1.toString());
		/*
		
		bankAccount acc2 = new bankAccount("Checking Account");
		acc2.accountNumber = "831231";
		
		bankAccount acc3 = new bankAccount("Savings Account", 5000);
		acc3.accountNumber = "831231";
		acc3.chackBalance();
		
		
		//Demo inheritance
		CDAccount cd1 = new CDAccount();
		cd1.balance = 3000;
		cd1.interestRate = "4.5";
		cd1.name = "Joel";
		cd1.accountType = "CD Account";
		System.out.println(cd1.toString());
		cd1.compound();
			
		*/
	}

}
