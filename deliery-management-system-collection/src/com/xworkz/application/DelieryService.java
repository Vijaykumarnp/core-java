package com.xworkz.application;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

import com.xworkz.application.constants.Gender;
import com.xworkz.application.deliveryapp.DeliveryImpl;
import com.xworkz.application.dto.DeliveryBoyDTO;

public class DelieryService {

	
	public static void main(String[] args) {
		DeliveryImpl impl = new DeliveryImpl();
		try {
		BufferedReader h = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("enter the size");
		int size = Integer.parseInt(h.readLine());
		for (int i = 0; i < size; i++) {
			DeliveryBoyDTO dtos = new DeliveryBoyDTO();
			System.out.println("enter the name of deliery boy");
			dtos.setName(h.readLine()); 
			System.out.println("enter the age of boy");
			dtos.setAge(Integer.parseInt(h.readLine()));
			System.out.println("enter the vehicle numer");
			dtos.setVehichleNumber(h.readLine());
			System.out.println("enter the contact number");
			dtos.setContact(Long.parseLong(h.readLine()));
			System.out.println("enter the ");
			dtos.setGender(Gender.valueOf(h.readLine()));
			
			
				impl.saveBoys(dtos);
		}
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}	
	
		
		try {
			impl.getAllBoys();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
