package com.xworkz.pgapp;

import java.util.Scanner;

import com.xworkz.pgapp.guest.Guest;
import com.xworkz.pgapp.pgcollections.PayingGuestImpl;

public class PayingService {

	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		PayingGuestImpl j =  new PayingGuestImpl();
		
		for (int i = 0; i < 3; i++) {
			Guest hh = new Guest();
			System.out.println("enter the costomer name");
			hh.	setName(sc.next());
			System.out.println("enter the floorname ");
			hh.setFloorName(sc.next());
			System.out.println("enter the age");
			hh.setAge(sc.nextInt());
			System.out.println("enter the room no");
			hh.setRoomNo(sc.nextInt());
			
			try {
				j.saveGuest(hh);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
		}
		
		try {
			j.getGuests();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	
	
}
