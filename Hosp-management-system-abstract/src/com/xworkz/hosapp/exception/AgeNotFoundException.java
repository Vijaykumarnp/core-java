package com.xworkz.hosapp.exception;

public class AgeNotFoundException extends RuntimeException {

	public AgeNotFoundException() {
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public String toString() {
		System.out.println("AgeNotFoundException");
		return "patient not found in a given age";
	}
	
	
}
