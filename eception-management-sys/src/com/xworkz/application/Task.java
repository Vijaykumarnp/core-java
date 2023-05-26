package com.xworkz.application;

public class Task {
	
	
	public void equals() {
	String str = null;
	String str1 = "null";
	try {
	System.out.println(str.equals(str1));
	}catch(NullPointerException h) {
		System.out.println("cannot comapre anything with null") ;
	}
	
	}
	
	public void hh() {
		try {
		System.out.println(1/0);
		}catch(ArithmeticException j) {
			System.out.println("cannot divide a number by zero");
		}
	}
 
	public static void main(String[] args) {
		
		Task dd =  new Task();
		dd.equals();
		dd.hh();
		
		
		
	}
}
