package com.xworkz.ddapp.deliveryy;

import com.xworkz.ddapp.dboys.Dboys;


public class Swiggy implements DeliveryApp {

	Dboys boy[];
	int ind;
	
	public Swiggy(int size) {
		boy = new Dboys[size];
	}
	
	public Swiggy() {
		// TODO Auto-generated constructor stub
	}
	
	
	@Override
	public String addBoys(Dboys boy) {
		System.out.println("inside the add boys mthd");
		if(boy.getName() != null ) {
			this.boy[ind++] = boy; 	
		}
		return null;
	}

	
	public void getBoys() {
		System.out.println("inside the get boys method");
		for (int i = 0; i < boy.length; i++) {
			System.out.println(boy[i]);
		}
	
	
	
	
	
	
}
}
