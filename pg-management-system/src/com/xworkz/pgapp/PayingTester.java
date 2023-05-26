package com.xworkz.pgapp;

import java.util.Scanner;

import com.xworkz.pgapp.guest.Guest;
import com.xworkz.pgapp.pgf.PayingGuest;

public class PayingTester {

	public static void main(String[] args) {
		Scanner scanner =  new Scanner(System.in);
		System.out.println("enter the size");
		int size = scanner.nextInt();
		PayingGuest pay = new PayingGuest(size);
		//Guest gg = new Guest();
		for (int i = 0; i <size ; i++) {
			Guest gg = new Guest();
		System.out.println("enter the name");
		
		gg.setName(scanner.next());
		
		System.out.println("enter room number");
		gg.setRoomNo(scanner.nextInt());
		System.out.println("enter age");
		gg.setAge(scanner.nextInt());
		System.out.println("enter floor ");
		gg.setFlooRName(scanner.next());
		pay.toAdmit(gg);
		
		}
		System.out.println("enter 1 to get guest details");
	    System.out.println("enetr 2 to get details by name & room no ");
	    System.out.println("enter 3 to get the details by age");
	    System.out.println("enter 4 to get details by name");
	    
	  int op = scanner.nextInt();
	   switch (op) {
	   case 1 : pay.getGuestDetails();
	   break;
	   case 2 : 
		   System.out.println("enter  name & room no to fetch the details ");
		   
		   pay.findDetailsby(scanner.nextInt(), scanner.next());
		   break;
	   case 3 : System.out.println("enter the age to whoam you want details");
		   
		   pay.findDetailsByage(scanner.nextInt());
	   
		   break;
		   
	   case 4 : System.out.println("enter the name to proceed the data whoam you want");
		    
		   pay.findDetailsbyName(null);
		   break;
		   
	   }
	
	}
	
	
}
