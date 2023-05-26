package com.xworkz.app.Qualifier;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
@Configuration
@ComponentScan(basePackages = "com.xworkz.app.Qualifier")
public class Configu {

	@Bean
	public Retaurant getRetaurant() {
		
		
		return new Indrapasta();
		
	}
	
	
}
