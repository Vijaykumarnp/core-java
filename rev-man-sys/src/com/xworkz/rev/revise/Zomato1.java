package com.xworkz.rev.revise;

public class Zomato1 {

	
	public  double findItem(String item) {
		if(item == "biriyani") {
			System.out.println("item is available");
		}else {
			System.out.println("item is not avalible");
		}
		
		
		return 220.00;
	}
	
	public static double findItem(String item , int quantity) {
		if(item == "biriyani") {
			System.out.println("item is available");
		}else {
			System.out.println("item not avilable");
		}
		
		
		return 223*quantity;
	}
	
	public static void Zomato1() {
		
	}
}
