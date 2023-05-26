package com.xworkz.hosapp;

import java.util.Scanner;

import com.xworkz.hosapp.exception.AgeNotFoundException;
import com.xworkz.hosapp.exception.EmailNotFoundException;
import com.xworkz.hosapp.exception.IdNotFoundException;
import com.xworkz.hosapp.exception.NameNotFoundException;
import com.xworkz.hosapp.hospital.AppoloImpl;
import com.xworkz.hosapp.hospital.Hospital;
import com.xworkz.hosapp.patient.Patient;

public class HospitalTester {

	public  static void main(String[] args) {
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
	
		try {
			System.out.println("enter the id to fetch details");
			hos.getPatientDetailsbyId(sc.nextInt());
			System.out.println("enter the email to fetch details");
			hos.getPatientbyemail(sc.next());
			System.out.println("enter the patient name to fetch the details");
			hos.getPatientByName(sc.next());
			System.out.println("enter the age to fetch the details");
			hos.getPatientDetailsByAge(sc.nextInt());
			
		}catch(IdNotFoundException | EmailNotFoundException | NameNotFoundException | AgeNotFoundException j) {
			j.printStackTrace();
		}
		System.out.println("main ended");
	}
}
