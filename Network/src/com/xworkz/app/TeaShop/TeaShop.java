package com.xworkz.app.TeaShop;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;


@Configuration
@Getter
@Setter
@ToString

public class TeaShop {

	@Autowired
	private List<Category> category;
	
	
	
	
	
}
