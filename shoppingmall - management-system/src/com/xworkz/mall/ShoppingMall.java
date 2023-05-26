package com.xworkz.mall;

import com.xworkz.shops.Shop;

public class ShoppingMall {
Shop shop[] ;
int ind;
public ShoppingMall(int size) {
	System.out.println("the object shopping mall is created");
   shop = new Shop[size];
}

public ShoppingMall() {
	// TODO Auto-generated constructor stub
}

public boolean addShop(Shop shop) {
	if(shop.getName() != null) {
		this.shop[ind++]=shop;
	}
	return true;
}
public void getShop() {
	for(int i=0 ; i <shop.length ; i++) {
		System.out.println(shop[i]);
	}
	
}


}
