package com.xworkz.mokApp;

public class Count {

	
	public int  print() {
		int ih = 27789877;
		
		int count = 0 ;
		
		while (ih>=1) {
			count = count+1;
			ih = ih /10;
			
		}
		return count;
	}
	
	public static void main(String[] args) {
		
		Count  c = new Count(); 
		
		System.out.println(c.print());
		int ih = 27789877;
		if(ih%2 == 0) {
			System.out.println("the number is even");
		
		}
		else {
			System.out.println("the number is odd");
		}
		}
		
		
		
	}

	
