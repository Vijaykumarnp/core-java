package com.xworkz.app.Qualifier;

import org.springframework.stereotype.Component;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Component(value = "indra")
@Getter
@Setter
@ToString
public class Indrapasta implements Retaurant {

	
	@Override
	
	public String servFood() {
			System.out.println("Indrapasta is a veg hotel");
			return Retaurant.super.servFood();
		}
	
	
}
