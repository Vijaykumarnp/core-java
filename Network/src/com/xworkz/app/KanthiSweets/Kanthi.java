package com.xworkz.app.KanthiSweets;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import lombok.Data;
import lombok.ToString;

@Data
@ToString

@Configuration
public class Kanthi {

	@Autowired
	private List<Sweets> sweets;
	
	
	
	
	
}
