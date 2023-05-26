package com.xworkz.hosapp;

import java.util.Scanner;

import com.xworkz.hosapp.exception.AgeNotFoundException;
import com.xworkz.hosapp.exception.EmailNotFoundException;
import com.xworkz.hosapp.exception.IdNotFoundException;
import com.xworkz.hosapp.exception.NameNotFoundException;
import com.xworkz.hosapp.hospital.AppoloImpl;
import com.xworkz.hosapp.hospital.Hospital;
import com.xworkz.hosapp.patient.Patient;

public class AppTester {

	
	
	public static void main(String[] args)  {
		System.out.println("inside the main method");
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the size ");
		int size = sc.nextInt();
		//abstraction
		Hospital hos =  new AppoloImpl(size);
		AppoloImpl jj = new AppoloImpl();
		for (int i = 0; i < size; i++) {
			System.out.println("enter patient id ");
			int id = sc.nextInt();
		System.out.println("enter patient name");
		String name = sc.next();
		System.out.println("enter the patient age ");
		int age = sc.nextInt();
		System.out.println("enter blood group");
		String bG=sc.next();
		System.out.println("enter the email");
		String email = sc.next();
		Patient patient = new Patient(id , name , age ,bG , email );
		hos.toAdmit(patient);
		}
		hos.getClass();
	
		
		int option;
		String hh;
		do {
             System.out.println("enter 1 to get patient by id");		
		     System.out.println("enter 2 to get patient by email");
		    System.out.println("enter 3 to get patient by patient name");
		    System.out.println("enter 4 to get patient by age");
		    System.out.println("enter 5 to logout");
		    option = sc.nextInt();
		    
		    
		switch(option) {
		case 1 :
		
			System.out.println("enter the id to fetch details");
		try {
			hos.getPatientDetailsbyId(sc.nextInt());
		}catch(IdNotFoundException l) {
			l.printStackTrace();
		}
			break;
			
		case 2 :
			System.out.println("enter the email to fetch details");
			try {
		hos.getPatientbyemail(sc.next());
			}catch(EmailNotFoundException k) {
				k.printStackTrace();
			}
		break;
		
		case 3 :
		System.out.println("enter the patient name to fetch the details");
		try {
		hos.getPatientByName(sc.next());
		}catch(NameNotFoundException j ) {
			j.printStackTrace();
		}
		case  4 :
		System.out.println("enter the age to fetch the details");
		try {
		hos.getPatientDetailsByAge(sc.nextInt());
		}catch(AgeNotFoundException h) {
			h.printStackTrace();
		}
		break;
		
		case 5 :
			System.out.println("type yes to continue");
		break;
		}
		
	}while ("no".equals(sc.next())) ;
		System.out.println("main ended");

	}
}
	
