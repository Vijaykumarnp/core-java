package com.xworkz.app.network;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import lombok.ToString;
@Component
@ToString
public class Application {

	
	@Value("whatsapp")
	private String appName;
	
	
}
