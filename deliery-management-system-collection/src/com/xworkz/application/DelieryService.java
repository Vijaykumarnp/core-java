package com.xworkz.application;

import java.util.Scanner;

import com.xworkz.application.constants.Gender;
import com.xworkz.application.deliveryapp.DeliveryImpl;
import com.xworkz.application.dto.DeliveryBoyDTO;

public class DelieryService {

	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		DeliveryImpl impl = new DeliveryImpl();
		System.out.println("enter the size");
		int size = sc.nextInt();
		for (int i = 0; i < size; i++) {
			DeliveryBoyDTO dtos = new DeliveryBoyDTO();
			System.out.println("enter the name of deliery boy");
			dtos.setName(sc.next()); 
			System.out.println("enter the age of boy");
			dtos.setAge(sc.nextInt());
			System.out.println("enter the vehicle numer");
			dtos.setVehichleNumber(sc.next());
			System.out.println("enter the contact number");
			dtos.setContact(sc.nextLong());
			System.out.println("enter the ");
			dtos.setGender(Gender.valueOf(sc.next()));
			
			try {
				impl.saveBoys(dtos);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}	
		}
		
		try {
			impl.getAllBoys();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
