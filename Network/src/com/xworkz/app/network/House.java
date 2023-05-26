package com.xworkz.app.network;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;


@ToString
@Data
@NoArgsConstructor
@Configuration
public class House {

	@Value("naveen nilaya")
	private String houseName;
	@Autowired
	private Doors doors;
	
	
}
