package com.xworkz.app.application;

import java.util.Scanner;

public class ReverseNumbers {

	public static void fib(int a , int b , int n) {
		
		if(n == 0) {
			return;
			
		}
		
		int c = a+b;
		System.out.println(c);
		fib(b , c , n-1);
		
		
	}
	
	
	
	
	public static void main(String[] args) {
		
	int a = 1;
	int b = 2;
	int n = 8 ; 
	fib(a , b , n-2);
	 
	
}
}

