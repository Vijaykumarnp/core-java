package com.xworkz.app.TeaShop;

import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Component
@AllArgsConstructor
@Getter
@Setter
@ToString
public class Category {

	public Category() {
		
		System.out.println(this.getClass().getSimpleName());
		
	}
	
	
	
	private int id;
	private String name;
	private int price;
	
	
}
