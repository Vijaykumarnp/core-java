package com.xworkz.devapp.deliveryapp;

import com.xworkz.devapp.deliryboys.Dboy;

public class Swiggy extends DeliveryApp {

	public Swiggy(int size) {
	
		super(size);
		
	}
	
	public Swiggy() {
	
	}
	
	public void order(){
		System.out.println("idly");
	}
boolean ifboyhaslicence = true;
	
	public String addBoys(Dboy boy) {
		
    if	(ifboyhaslicence == true) {
	return super.addBoys(boy);
		
		
	}
    return null;
	}

}
