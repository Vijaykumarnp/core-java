package com.xworkz.rev
.revise;

public class  Zomato extends DelieryApp{

	public static double findItem(String Item) {
		if(Item == "biriyani") {
			return 230.00;
		}
		else {
			System.out.println("cannot find item");
			
		}
		return 0.0;
	}
	
	public static double findItem(String Item , int quantity) {
		if(Item == "biriyani") {
			return 230.00 * quantity;
			
		}
		return 0.0;
	}
}