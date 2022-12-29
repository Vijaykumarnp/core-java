package com.hdfc.bankapp;

import java.util.Scanner;

public class BankTester {
   
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
	System.out.println("enter the size of an array");
	int size = scanner.nextInt();
	Bank bank = new Bank(size);
	for (int i = 0; i <size; i++) {
		
	
	System.out.println("enter the name of the custmer");
	 String name  = scanner.next();
	 System.out.println("enter the age of age of custmer");
	 int age = scanner.nextInt();
	 System.out.println("entre the number of the custmer");
	 long phoneNumber = scanner.nextLong();
	 System.out.println("enter the nationality");
	 String nationality = scanner.next();
	Custmer cust = new Custmer(name , age , phoneNumber ,nationality);
	bank.toCreate(cust);
	}
	bank.getDetailsofCustemer();
	//bank.getDetailsByName("liki");
	bank. updateageByName(25 , "liki");
	//bank. updateNamebyage("Likith" , 23);
	}
}
