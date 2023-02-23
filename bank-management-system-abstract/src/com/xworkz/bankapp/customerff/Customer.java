package com.xworkz.bankapp.customerff;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@NoArgsConstructor

public class Customer {

	
	private String  cusName;
	private int cusId;
	private int cusAge;

	public Customer(String cusName , int cusId , int cusAge) {
		this.cusName = cusName;
		this.cusId = cusId;
		this.cusAge = cusAge;
		
		
	}
	
	
	
	
	
	
	
}
