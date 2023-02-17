package com.xworkz.hosapp.hospital;

import com.xworkz.hosapp.exception.AgeNotFoundException;
import com.xworkz.hosapp.exception.EmailNotFoundException;
import com.xworkz.hosapp.exception.IdNotFoundException;
import com.xworkz.hosapp.exception.NameNotFoundException;
import com.xworkz.hosapp.patient.Patient;

public  class AppoloImpl implements Hospital {

	
	
	Patient patinet[];
	int ind;



	public AppoloImpl(int size) {
		patinet = new Patient[size];
	}
	public AppoloImpl() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public String  toAdmit(Patient patient) {

		
		System.out.println("the admit proces started");
		if(patient.getPatientName() !=null) {
			this.patinet[ind++] = patient;
		}
		System.out.println("admit process ended");
		return "admited" ;
	
	}
	@Override
	public void getPatient() {
		for(int i=0 ; i<patinet.length ; i++) {
			System.out.println(patinet[ind]);
		}
		
	}
	@Override
	public Patient getPatientDetailsbyId(int patientId) throws IdNotFoundException {
		System.out.println("inside the getPatientdetailsnyId");
		for(int ind = 0 ; ind<patinet.length ; ind++) {
			if(patinet[ind].getPatientId() == patientId) {
			System.out.println("patient id is matiching proceed data");
	
			System.out.println(patinet[ind]);
			return patinet[ind];
		}
			else {
				throw new IdNotFoundException();
			}
		}
		System.out.println("end of get patient method");
			return null;
		
	}
	@Override
	public void getPatientbyemail(String email) throws EmailNotFoundException {
		System.out.println("inside the getPatientbyemail method ");
		for (int i = 0; i < patinet.length; i++) {
		
		if(patinet[i].getEmail().equals(email)) {
			System.out.println("patient email is machtched proceed data");
			System.out.println(patinet[i]);
		
		}else {
			
		 EmailNotFoundException jj = new EmailNotFoundException() ;
			throw jj;
		}
		}
	}
	@Override
	public void getPatientByName(String name) throws NameNotFoundException {
		System.out.println("inside the getPatientByName method ");
		for (int i = 0; i < patinet.length; i++) {
			if(patinet[i].getPatientName().equals(name)) {
				System.out.println(patinet[i]);
			}
			else {
				NameNotFoundException j = new NameNotFoundException();
				
				throw j;
			}
			
		}
			
	}
	@Override
	public void getPatientDetailsByAge(int age) throws AgeNotFoundException {
		System.out.println("inside the getPatientDetailsByAge");
		for (int i = 0; i < patinet.length; i++) {
			if(patinet[i].getPatientAge() == age) {
				System.out.println("age is matched proceed data");
				System.out.println(patinet[i]);
			}else {
				throw new AgeNotFoundException();
			}
			
		}
	}
}


