package com.xworkz.application;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

import com.xworkz.bank.BankImpl;
import com.xworkz.dto.CustomerDTO;

public class BankService {

	public static void main(String[] args)   {
		BankImpl im = new BankImpl();
		BufferedReader b = new BufferedReader (new InputStreamReader(System.in));
		
		System.out.println("enter the size ");
		try {
		
		int size = Integer.parseInt(b.readLine());
		for (int i = 0; i < size ; i++) {
			CustomerDTO dtos =  new CustomerDTO();
		System.out.println("enter the id of the customer");	
		dtos.setCusId(Integer.parseInt(b.readLine()));
		System.out.println("enter the name of customer");
		dtos.setCusName(b.readLine());
		System.out.println("enter the age of the customer");
		dtos.setCusAge(Integer.parseInt(b.readLine()));
		System.out.println("enter the location");
		dtos.setLocation(b.readLine());
		System.out.println("enter the contact number");
		dtos.setContactNo(Long.parseLong(b.readLine()));
		
			im.saveCustomer(dtos);
		}
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		
	
		
		try {
			im.getCustomer();
			System.out.println("eneter the name to fetch the details");
			im.getCustomerByNamae(b.readLine());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
	}
	
	
	
	
	
	
}
