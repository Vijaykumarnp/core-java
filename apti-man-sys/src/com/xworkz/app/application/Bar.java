package com.xworkz.app.application;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Bar {

	
	private int id ;
	private String bName;
	private String location;
private	String ownerName;
///make down casting
	
	/*@Override
	public String toString() {
		
		return "Bar - (id = "+this.id+" , Bar Name = "+ this.getBName()+" , location = "+this.getLocation()+" , "+ this.getOwnerName()+")";
	}*/
	
	@Override
	public boolean equals(Object obj) {
		//down casting 
		Bar ba = (Bar)obj;
		
		if(this.location.equals(ba.getLocation()) && this.id ==ba.id ) {
			
			return true;
		}
		return false;
	}
	@Override 
	public int  hashCode() {
	
		return this.id;
	}
	
	

}
