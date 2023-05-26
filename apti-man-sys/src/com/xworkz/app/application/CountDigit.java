package com.xworkz.app.application;

public class CountDigit {

	public static void main(String[] args) {
		int i = 1234567;
	int count = 0 ;
	while(i>=1) {
		
		i = i/10;
		count++;
	}	
	
	
	
		System.out.println("the number of digit in the given number is " +count);
		
	
	}
	
}
