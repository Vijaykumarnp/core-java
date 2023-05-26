package com.xworkz.abbapp.areaname;

public class Prime {

	
	public static void main(String[] args) {
		int a = 4;
		int count =0;
		for (int i = 1; i <= a; i++) {
			
		
		if(a%i == 0) {
			count = count +1;
			//System.out.println(count);
			
		}
		}
		
		if(count == 2 ) {
			System.out.println("the number is prime");
		}
		else {
			System.out.println("the number is not prime");
		}
		
		
		
	}
}
