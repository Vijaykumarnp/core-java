package com.xworkz.bankapp;

import java.util.Scanner;

import com.xworkz.bankapp.bankff.AxisBank;
import com.xworkz.bankapp.bankff.Bank;
import com.xworkz.bankapp.customerff.Customer;
import com.xworkz.bankapp.exception.CustomerNotFoundException;

public class BankTester {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the size of array");
		int size = sc.nextInt();
		Bank h = new AxisBank(size);
		for (int i = 0; i < size; i++) {
			System.out.println("enter the name of customer");
			String j = sc.next();
			System.out.println("enter the age of customer");
			int jh = sc.nextInt();
			System.out.println("enter customer id");
			int id = sc.nextInt();
			Customer k = new Customer(j , jh , id);
			h.addCostumers(k);
		}
		do {
			int option;
			String g ;
		System.out.println("enter 1 to get all the customers");
		System.out.println("enter 2 to fetch the details by id");
		System.out.println("eneter 3 to logout");
		option = sc.nextInt();
		
		switch(option) {
		
		case 1 :	h.getAllCustomers();
		   break;
		case 2 :	System.out.println("enter the id to fetch the details");
		try {
		h.getCustomerById(sc.nextInt());
		}catch(CustomerNotFoundException j) {
			j.printStackTrace();
		}
		case 3 : System.out.println("thank you for using this APP");
		break;
		}
		System.out.println("type yes to logout");
		}while("no".equals(sc.next()));
		
		
		
	}
	
	
	
	
}
