package com.xworkz.app.automobile;

import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Component
@Data
@AllArgsConstructor
@ToString
@Getter
@Setter

public class SpareParts {

	
	
	public SpareParts() {
		System.out.println(this.getClass().getSimpleName()+ "object is created");	}
	
	private int id;
	private String name;
	private int price;
	
}
