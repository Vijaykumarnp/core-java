package com.xworkz.rev.revise;

public class Basket {

	String name ;
	String brand;
	int price ;
	
	
	public Basket(String name , String brand , int price) {
		this.name = name;
		this.brand=brand;
		this.price = price;
		
	}
	
	public void printt() {
		
		System.out.println(name);
		System.out.println(brand);
		System.out.println(price);
	} 
	
	
	
}
