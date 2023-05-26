package com.xworkz.application;

public class AutoMorphic {

	
	public static void main(String[] args) {
		int i = 5;
		int num = 0;
		int p = i*i;
		while(p>0) {
			num = num+p%10;
			//p = p/10;
		
		
		if(num == i) {
		System.out.println("auto mor");
	}
	else {
		System.out.println("not auto ");
	}
		}
	}
	}
