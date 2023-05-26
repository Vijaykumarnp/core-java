package com.xworkz.app.application;

import java.util.Scanner;

public class Factorial {

	public static void prin(int a ,int  b ,int n) {
		if(n == 0) {
			return ;
		}
		
		int c = a+b;
		System.out.println(c);
		prin(b , c , n-1);
		
		
		
	}
	
	
	
	
	
	public static void main(String[] args) {
		
		int a= 5;
		int b=9;
		int n = 9 ;
		System.out.println(a);
		System.out.println(b);
		prin(a ,b , n-2);
		
		
	
	
	}
}
	
	

