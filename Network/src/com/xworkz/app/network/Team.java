package com.xworkz.app.network;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

import lombok.Data;
import lombok.ToString;

@Configuration
@Data
@ToString
public class Team {

	@Value("India")
	private String teamName;
	@Autowired
	private Players playerName;
	
	
}
