package com.xworkz.rev.revise;

public class Bus {

	Pasenger[] pas ;
	int ind  ;
	
	public Bus(int size) {
		System.out.println("the object is reated");
		pas = new Pasenger[size];
		
		
	}
	
	
	public String addPas(Pasenger pas) {
		if(pas.pName != null) {
			this.pas[ind++] = pas;
		}
		return null;
	}
		
		public int getPas() {
			for (int i = 0; i < pas.length; i++) {
				System.out.println(pas[i].pName + " " + pas[i].age+ " " + pas[i].destination);
			}
			return 0;
		}
			
		
		
		
	}
	
	
	
	
	
	
	
	
	

