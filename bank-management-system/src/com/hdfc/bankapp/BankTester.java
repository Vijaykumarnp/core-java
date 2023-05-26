package com.hdfc.bankapp;

import java.util.Scanner;

import com.hdfc.bankapp.bank.Bank;
import com.hdfc.bankapp.bank.Hdfc;
import com.hdfc.bankapp.custmer.*;
public class BankTester {
   
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
	System.out.println("enter the size of an array");
	int sizee = scanner.nextInt();
	Bank bank = new Bank(sizee);
	Bank baa = new Hdfc();
	
	
	for (int i = 0; i <sizee; i++) {
		
		Custmer cust = new Custmer();
	System.out.println("enter the name of the custmer");
	
	cust.setName(scanner.next()); ;
	 System.out.println("enter the age of age of custmer");
	 cust.setAge(scanner.nextInt());
	 System.out.println("entre the number of the custmer");
	 cust.setPhoneNo(scanner.nextLong());
	 System.out.println("enter the nationality");
	cust.setNationality(scanner.next());
	bank.toCreate(cust);
	//System.out.println(cust.getName() + " " + cust.getAge() + " " + cust.getPhoneNo() + " " + cust.getNationality());
	}
	int option ;
	String yes ;
			
do {
		
	System.out.println("enter 1 to get all the the customers");
	System.out.println("enter 2 to fetch data of single customer");
	System.out.println("enter 3 to update name by refrence age");
	System.out.println("enter 4 to update contact by refrence name ");
	System.out.println("enter 5 to logout ");
	
	option = scanner.nextInt();
	switch(option) {
	case 1 : bank.getDetailsofCustemer();
	break;
	
	case 2 : System.out.println("enter name to fetch data whoam you want");
             bank.getDetailsByName(scanner.next());
             break;
             
	case 3 : System.out.println("enter the updated name of customer");
	          String s  = scanner.next();
	          System.out.println("enter the refrence age to update name");
	           int d = scanner.nextInt();
	           bank.updateNamebyAge(s, d);
	           break;
	case 4 : System.out.println("enter the name  to update contact ");
	           System.out.println("enter the updated number");
	           bank.updateContactNobyName(scanner.next() , scanner.nextLong() );
	          break; 
	case 5 : System.out.println("thank you for using this app");
	break;
	}
	System.out.println("click yes to logout");
	
	}
while("no".equals(scanner.next()));

}
}
