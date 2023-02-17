package com.xworkz.hosapp.exception;

public class IdNotFoundException extends RuntimeException{

	
	public IdNotFoundException() {
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "patient not found in a given id";
	}
}
