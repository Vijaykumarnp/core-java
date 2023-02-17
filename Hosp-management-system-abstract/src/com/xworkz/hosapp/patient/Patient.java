package com.xworkz.hosapp.patient;

import lombok.Getter;

import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
	public class Patient {
	    private int patientId;
		private String patientName;
		private int patientAge;
		private String patientBloodGroup;
		private String email;
		
		public Patient(int patientId, String patientName , int patientAge , String patientBloodGroup , String email) {
			this.patientId = patientId;
			this.patientName=patientName;
			this.patientAge = patientAge;
			this.patientBloodGroup = patientBloodGroup;
			this.email = email;
		}
         public Patient() {
			// TODO Auto-generated constructor stub
		}
	}

	


