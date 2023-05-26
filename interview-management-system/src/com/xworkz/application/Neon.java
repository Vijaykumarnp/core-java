package com.xworkz.application;

public class Neon {

	public static void main(String[] args) {
		
		int i = 9*9;
		int sum =0;
		while(i>0) {
		sum = sum+i%10;
		i=i/10;
		
		}
		if(sum == 9) {
			System.out.println("its neon");
		}
		else {
			System.out.println("its not neon");
		}
		}
}
