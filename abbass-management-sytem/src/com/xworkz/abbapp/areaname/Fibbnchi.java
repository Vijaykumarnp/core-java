package com.xworkz.abbapp.areaname;

public class Fibbnchi {

	public static void print(int a , int b , int n) {
		
		if(n == 0) {
			return;
		}
		
		int c = a+b;
		System.out.println(c);
		print(b , c , n-1);
	}
	
	public static void main(String[] args) {
		
		int a = 2;
		int b = 3;
		int n = 9;
		
		print(a ,b, n-2);
		
		
		
		
	}
		
		
		
	
	
	
	
}
