package com.xworkz.app.TeaShop;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

@org.springframework.context.annotation.Configuration
@ComponentScan(basePackages = "com.xworkz.app.TeaShop")


public class Configuration {

	
	
	

	public List<Category> getCategory(){
		List<Category> k = new ArrayList<Category>();
		k.add(new Category(1, "Tea", 10));
		k.add(new Category(2, "bistuit", 10));
		k.add(new Category(3, "Samosa", 20));
		k.add(new Category(4, "chinikaini", 50));
		k.add(new Category(5, "vimal", 10));
		k.add(new Category(6, "panmasala", 20));
		k.add(new Category(7, "ginger Tea", 10));
		k.add(new Category(8, "goodaybiscuit", 10));
		k.add(new Category(9, "oreo", 10));
		k.add(new Category(10, "mangojuice", 10));
		k.add(new Category(11, "moms magic", 10));
		k.add(new Category(12, "kit kat", 10));
		k.add(new Category(13, "banana", 5));
		k.add(new Category(14, "cocount", 30));
		k.add(new Category(15, "oreo", 10));
		
		return k;
		
	}
	
	
	
	
	
}
