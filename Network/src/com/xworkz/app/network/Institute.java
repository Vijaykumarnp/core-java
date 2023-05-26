package com.xworkz.app.network;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

import lombok.Data;
import lombok.ToString;



@Configuration
@Data
@ToString
public class Institute {

	@Value("Xworkz")
	
	private String instituteName;
	@Autowired
	private Branch noOgBranches;
}
