package com.xworkz.application;

import java.util.Scanner;

import com.xworkz.bank.BankImpl;
import com.xworkz.dto.CustomerDTO;

public class BankService {

	public static void main(String[] args)   {
		BankImpl im = new BankImpl();
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter the size ");
		
		int size = sc.nextInt();
		for (int i = 0; i < size ; i++) {
			CustomerDTO dtos =  new CustomerDTO();
		System.out.println("enter the id of the customer");	
		dtos.setCusId(sc.nextInt());
		System.out.println("enter the name of customer");
		dtos.setCusName(sc.next());
		System.out.println("enter the age of the customer");
		dtos.setCusAge(sc.nextInt());
		System.out.println("enter the location");
		dtos.setLocation(sc.next());
		System.out.println("enter the contact number");
		dtos.setContactNo(sc.nextLong());
		try {
			im.saveCustomer(dtos);
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		
		}
		
		try {
			im.getCustomer();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
	}
	
	
	
	
	
	
}
