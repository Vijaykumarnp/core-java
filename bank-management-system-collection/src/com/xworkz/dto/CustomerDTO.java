package com.xworkz.dto;

import java.io.Serializable;
import java.util.Comparator;

import lombok.Data;

@Data
public class CustomerDTO implements Serializable ,Comparable<CustomerDTO>{

	private Integer cusId;
	private String  cusName;
	private Integer cusAge;
    private  String location;
    private Long contactNo;
	@Override
	public int compareTo(CustomerDTO o) {
		// TODO Auto-generated method stub
		return this.cusId - o.cusId;
	}
	  
}
