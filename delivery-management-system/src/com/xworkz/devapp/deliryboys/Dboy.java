package com.xworkz.devapp.deliryboys;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor


public class Dboy implements Serializable{

	private String name ;
	private int age;
	private String vehichleNumber;
	private long contact;
	
	public String toString() {
		return "DeliveryBoys - ["+this.name+" , "+this.age+" , "+this.vehichleNumber+" , "+this.contact+"]";
		
	}
	
	
}
