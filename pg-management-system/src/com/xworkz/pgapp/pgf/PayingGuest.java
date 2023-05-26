package com.xworkz.pgapp.pgf;

import com.xworkz.pgapp.guest.Guest;

public class PayingGuest {
	
	Guest guestarray[];
	int index;
	public PayingGuest(int size) {
		System.out.println("the object paying guest is created");
		guestarray = new Guest[size];
	}
	
	public PayingGuest() {
		// TODO Auto-generated constructor stub
	}
	
	public String toAdmit(Guest guest) {
		System.out.println("the admit process started");
		if(guest.getName() != null) {
			this.guestarray[index++] = guest;
		}
		return "isAdmited";
	}
	
	public String getGuestDetails() {
		for(int i= 0 ; i<guestarray.length ; i++) {
			System.out.println(guestarray[i].getName() + " "+ guestarray[i].getAge() + " "+ guestarray[i].getRoomNo() + " " + guestarray[i].getFloorName());
			
			
		}
		
		return "fetching details";
	}
	
	
	public Guest findDetailsbyName(String name) {
		System.out.println("inside the  findDetailsbyName");
		for(int i=0 ; i<guestarray.length ; i++) {
			if(guestarray[i].getName() == name) {
				System.out.println("the name is matched proceed data");
				System.out.println(guestarray[i].getName() + " "+ guestarray[i].getAge() + " "+ guestarray[i].getRoomNo() + " " + guestarray[i].getFloorName());
				
			}
			
		}	
		return null;
		
	}
	
	public Guest findDetailsByage(int age) {
		System.out.println("inside the findDetailsByage method");
		for(int i=0 ; i<guestarray.length ; i++) {
			if(guestarray[i].getAge() == age ) {
				System.out.println("the age is matched proceed data");
				System.out.println(guestarray[i].getName() + " "+ guestarray[i].getAge() + " "+ guestarray[i].getRoomNo() + " " + guestarray[i].getFloorName());
				
			}
			
		}
		
		return null;
		
	}
	
	
	public String findDetailsby(int roomNo , String name) {
		System.out.println("inside the findDetailsby method");
		for(int i=0 ; i<guestarray.length ; i++) {
			if(guestarray[i].getRoomNo() == roomNo && guestarray[i].getName() == name) {
				System.out.println("the room num is matched proceed data");
				System.out.println(guestarray[i].getName() + " "+ guestarray[i].getAge() + " "+ guestarray[i].getRoomNo() + " " + guestarray[i].getFloorName());
				
			}
			
			
		}
		return null;
		
	}
	
	
	public int price() {
		return 1000;
	}
	
	
	
	
}
