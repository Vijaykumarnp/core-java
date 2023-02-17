package com.xworkz.hosapp.exception;

public class EmailNotFoundException extends RuntimeException {

	
	public void EmailNotFoundException() {
		
		toString();
		
	}
	

	
	@Override
	public String toString() {
	
		return "the given email is not matched";
	}
	
}
