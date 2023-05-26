package com.xworkz.app.Qualifier;

import org.springframework.stereotype.Component;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Component(value = "ashoka")
@ToString
@Getter
@Setter
public class Ashoka implements Retaurant {

	@Override
	
public String servFood() {
		System.out.println("ashoka is a non eg hotel");
		return "serving food";
	}
	
	
}
