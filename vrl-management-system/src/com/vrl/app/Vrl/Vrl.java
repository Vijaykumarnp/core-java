package com.vrl.app.Vrl;

import com.vrl.app.bus.Bus;

public class Vrl {

	Bus bus[] ;
	int ind;
	
	
	public Vrl(int sizee) {
		System.out.println("the object rl is created");
		bus = new Bus[sizee];
	}
	
	
	public  String addBus(Bus bus) {
		if(bus.name != null || bus.name != "") {
			this.bus[ind++] = bus;
			
		}
		return null;
	}
	
	
	public String theDetails() {
		for (int i = 0; i < bus.length; i++) {
			System.out.println(bus[i].name + " " + bus[i].number + " "+ bus[i].size +" "+bus[i].type);
		}
		return null;
		
	}
	
	public Bus getDetailsbyName(String name) {
		for (int i = 0; i < bus.length; i++) {
			if(bus[i].name == name) {
				System.out.println("the name is mathed proceed data");
				System.out.println(bus[i].name + " " + bus[i].number + " "+ bus[i].size +" "+bus[i].type);
			}
		}
	return null;	
	}
	
	
	public Bus updateNamebynumber(String newName , String number) {
		for (int i = 0; i < bus.length; i++) {
			if(bus[i].number == number) {
				System.out.println("the curretnt name is " +bus[i]);
				bus[i].name = newName;
				System.out.println("the updated name is " +bus[i]);
			}
		}
		return null;
		
		
	}
	
	
	
	
	
}
