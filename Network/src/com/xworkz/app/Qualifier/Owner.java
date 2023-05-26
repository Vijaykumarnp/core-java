package com.xworkz.app.Qualifier;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import lombok.Getter;
import lombok.Setter;

@Component
@Getter
@Setter


public class Owner {

	@Autowired
	@Qualifier("indra")
	Retaurant restuart;
	
	
	
}
