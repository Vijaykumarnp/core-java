package com.hdfc.bankapp;

import java.util.Scanner;

import com.hdfc.bankapp.bank.Bank;
import com.hdfc.bankapp.custmer.*;
public class BankTester {
   
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
	System.out.println("enter the size of an array");
	int size = scanner.nextInt();
	Bank bank = new Bank(size);
	for (int i = 0; i <size; i++) {
		
		Custmer cust = new Custmer();
	System.out.println("enter the name of the custmer");
	
	cust.setName(scanner.next()); ;
	 System.out.println("enter the age of age of custmer");
	 cust.setAge(scanner.nextInt());
	 System.out.println("entre the number of the custmer");
	 cust.setPhoneNo(scanner.nextLong());
	 System.out.println("enter the nationality");
	cust.setNationality(scanner.next());
	System.out.println(cust.getName() + " " + cust.getAge() + " " + cust.getPhoneNo() + " " + cust.getNationality());
	
	
	
	}
	
}
}
