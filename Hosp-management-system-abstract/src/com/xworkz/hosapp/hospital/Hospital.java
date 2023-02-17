package com.xworkz.hosapp.hospital;

import com.xworkz.hosapp.exception.NameNotFoundException;
import com.xworkz.hosapp.patient.Patient;

public interface Hospital {
	
	public String toAdmit(Patient patient );
	public void getPatient();
	public Patient getPatientDetailsbyId(int patientId);
	public void getPatientbyemail(String email);
	public void getPatientByName(String name) ;
	public void getPatientDetailsByAge(int age);
}
