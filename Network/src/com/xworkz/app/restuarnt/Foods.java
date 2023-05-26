package com.xworkz.app.restuarnt;

import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Component
@AllArgsConstructor
@ToString
@Getter
@Setter



public class Foods {

	public Foods() {
	System.out.println(	this.getClass().getSimpleName()+"object is created");
	}
	
	private int id;
	private String name;
	private int price;
	
	
	
}
