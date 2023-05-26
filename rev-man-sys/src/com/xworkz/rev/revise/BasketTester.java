package com.xworkz.rev.revise;

public class BasketTester extends DelieryApp {

	
	@Override
	public  void delivr() {
		
	}
	
	public static void main(String[] args) {
		
		
		Basket bas = new Basket("vsik" , "brand" , 7);
		 bas.printt();
		DelieryApp h = new BasketTester();
		h.delivr();
		BasketTester k = new BasketTester();
		
	}
}





