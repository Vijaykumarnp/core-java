package com.xworkz.hosapp.exception;

public class EmailNotFoundException extends RuntimeException {

	
	public void EmailNotFoundException() {
		
		toString();
		
	}
	

	
	@Override
	public String toString() {
	System.out.println("EmailNotFoundException");
		return "the given email is not matched";
	}
	
}
