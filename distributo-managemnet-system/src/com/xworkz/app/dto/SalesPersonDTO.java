package com.xworkz.app.dto;

import java.io.Serializable;

import com.xworkz.app.constant.Gender;

import lombok.Data;


@Data
public class SalesPersonDTO  implements Serializable , Comparable<SalesPersonDTO> {

	private int salesPersonId;
	private String name;
	private String adress;
	private Gender gender;
	private int age;
	private String bloodGroup;
	@Override
	public int compareTo(SalesPersonDTO o) {
		// TODO Auto-generated method stub
		return this.age - o.age;
	}
	
	

	
	
	
	
	
	
	
}
