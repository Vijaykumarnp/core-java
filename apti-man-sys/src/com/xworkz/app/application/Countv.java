package com.xworkz.app.application;

import java.util.Scanner;

public class Countv {

	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		long i = scanner.nextLong();
		
		int count =0 ;
		
		while(i>0) {
			
			
			i = i/10 ;
			count = count +1;
			
		}
		System.out.println(count);
		scanner.close();
	}
	
	
	
}
