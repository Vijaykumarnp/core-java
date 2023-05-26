package com.xworkz.mall;

import java.util.Scanner;

import com.xworkz.shops.Shop;

public class MantriMallTester {

	
	
	public MantriMallTester() {
		// TODO Auto-generated constructor stub
	}
	
	public static void main(String[] args) {
		
		Scanner sca = new Scanner(System.in);
		System.out.println("enter the size");
		 int size = sca.nextInt();
		ShoppingMall sho = new MantriMall(size);
		for (int i = 0; i <size; i++) {
			Shop shop = new Shop();
			System.out.println("enter the shop name");
			shop.setName(sca.next());
			System.out.println("enter the type");
			shop.setType(sca.next());
			sho.addShop(shop);
			
		}
		
		
	
		
		
	}
}
