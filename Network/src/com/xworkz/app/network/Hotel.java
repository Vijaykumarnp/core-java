package com.xworkz.app.network;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

import lombok.Data;
import lombok.ToString;
@Data
@Configuration
@ToString
public class Hotel {
     @Value("Sagar")
	private String hotelName;
	@Autowired
	private Chief chefName;
	
}
