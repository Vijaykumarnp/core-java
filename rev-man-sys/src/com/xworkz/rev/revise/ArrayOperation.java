package com.xworkz.rev.revise;

public class ArrayOperation {

	
	public static void main(String[] args) {
		int a [] = {3 , 6 , 7, 5, 3};
		
		System.out.println(a.length);
		
		for (int i = 0; i < a.length; i++) {
			int count = 0;
			for (int j = 1; j <= a[i]; j++) {
				
			
			if(a[i]%j == 0 ) {
				count = count+1;
				//System.out.println(a[i]);
				
			}
			}
		
		if(count != 2) {
			System.out.println("the number is prime");
		}
		else {
			System.out.println("not prime");
		}
			}
			}
		
		
	}
	

