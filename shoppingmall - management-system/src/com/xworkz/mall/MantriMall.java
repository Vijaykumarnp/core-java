package com.xworkz.mall;

import com.xworkz.shops.Shop;

public class MantriMall  extends ShoppingMall{

	
	public MantriMall(int size) {
		System.out.println("the object mantri mall is created");
		shop = new Shop[size];
		
	}
	

	boolean isAdded =true;
	
	@Override
	public boolean addShop(Shop shop) {
		System.out.println("the addshop method of child class");
		if(isAdded == true) {
			System.out.println("the parent method");
			return super.addShop(shop);
			
		}
		
		return true;
		
	}
	
}
