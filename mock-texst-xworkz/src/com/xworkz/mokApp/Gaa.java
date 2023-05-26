package com.xworkz.mokApp;

public class Gaa {

	
	public int add(int a, int b , int c) {
		return a+b+c;
	}
	
	
	
	public int add(int a , int b) {
		return a+b;
		
	}
	
	public static void main(String[] args) {
		
		Gaa g = new Gaa();
		
		System.out.println(g.add(2, 3));
		System.out.println(g.add(2, 3, 4));
	}
	
	
	
}
