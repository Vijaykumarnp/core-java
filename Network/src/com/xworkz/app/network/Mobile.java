package com.xworkz.app.network;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Configuration;

import lombok.ToString;

@Configuration
@ToString
public class Mobile {

	@Value("Apple")
	private String mobileName;
	@Autowired
	private Application appName;
	
	
}
