package com.xworkz.devapp.deliveryapp;

import com.xworkz.devapp.deliryboys.Dboy;

public class DeliveryApp {

	
	Dboy boy[];
	int ind;
	
	public DeliveryApp(int size) {
		
		boy = new Dboy[size];
	}
	
	public DeliveryApp() {
		// TODO Auto-generated constructor stub
	}
	
	public String addBoys(Dboy boy) {
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
	
	
	
	
	public void getDetailsbyName(String name) {
		
		for (int i = 0; i < boy.length; i++) {
		
		if(boy[i].getName() == name) {
			System.out.println(boy[i]);
		}
	}
	}
	
	
	
	
	
	public void updateNamebyage(String newName , int age) {
		for (int i = 0; i < boy.length; i++) {
			if(boy[i].getAge() == age ) {
		System.out.println("the current name is " + boy[i].getName());
		boy[i].setName(newName);
		System.out.println("the updated age is " + boy[i].getName());
		
		}
	}
	}
	
}
