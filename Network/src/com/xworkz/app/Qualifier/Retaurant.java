package com.xworkz.app.Qualifier;

public interface Retaurant {

	
	 default String servFood() {
		
		return "Serving Food To the customers";
	}
	
	
}
