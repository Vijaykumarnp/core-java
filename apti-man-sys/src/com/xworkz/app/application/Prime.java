package com.xworkz.app.application;

public class Prime {

	
	public static void main(String[] args) {
		
		
		int i = 4 ;
		int count = 0 ;
		for (int j = 0; j <= i; j++) {
			
		
		if(i%i == 0 && i %1 == 0) {
			count = count +1;
			
			//System.out.println("the number is prime");
			
		}
		}
		System.out.println(count);
		
		if(count == 2) {
			System.out.println("the number is prime");
		}
		else {
			System.out.println("not a prime number");
		}
		
		
		
	}
	
	
}
