package com.xworkz.pgapp.pgf;

import java.util.Scanner;
import com.xworkz.pgapp.guest.Guest;

public class ManjunathaTester {

	
	public static void main(String[] args) {
		
		Scanner sca =  new Scanner(System.in);
		System.out.println("enter the  size of array");
		int size = sca.nextInt();
		
		PayingGuest  pay = new ManjunathaPg(size);

	System.out.println(pay.price());
	for (int i = 0; i < size; i++) {
				 Guest guest = new Guest();
				System.out.println("enter  the guest name");
				  guest.setName(sca.next());
				System.out.println("enter the roomNo ");
				 guest.setRoomNo(sca.nextInt());
				pay.toAdmit(guest);
			}
			pay.getGuestDetails();
			
	
	}
	
	
}
