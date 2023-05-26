package com.xworkz.application.dto;

import java.io.Serializable;

import com.xworkz.application.constants.Gender;

import lombok.Data;
@Data
public class DeliveryBoyDTO implements Serializable  , Comparable<DeliveryBoyDTO>{

	
	

	private String name ;
	private Integer age;
	private String vehichleNumber;
	private Long contact;
    private Gender gender;
	@Override
	public int compareTo(DeliveryBoyDTO o) {
		// TODO Auto-generated method stub
		return this.getAge() - o.getAge() ;
	}
	
	
	
	
}
