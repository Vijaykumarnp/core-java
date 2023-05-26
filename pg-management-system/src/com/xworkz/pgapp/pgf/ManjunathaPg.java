package com.xworkz.pgapp.pgf;

import com.xworkz.pgapp.guest.Guest;

public class ManjunathaPg extends PayingGuest {

	boolean isAmitted =true;

	
	
	public ManjunathaPg(int size) {
		guestarray = new Guest[size];
		System.out.println("the object manjunatha pg is created");
	}
	
	
	public ManjunathaPg() {
		// TODO Auto-generated constructor stub
	}

	boolean priceisgreaterthan1000 = true;
	@Override
	public int price() {
		System.out.println("ch");
		 priceisgreaterthan1000 = true;
		return super.price();
	}
	

	public String toAdmit(Guest guest) {
		System.out.println("the manjunatha pg  admit method is created");
		   if(isAmitted == true) {
			   System.out.println("inside the parent class method");
			   return super.toAdmit(guest);
			   
		   }
		
		return null;
	}
		
		
		
		
	}
	
	
	

