package com.xworkz.app.KanthiSweets;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import com.xworkz.app.list.Book;

import lombok.Data;
import lombok.ToString;

@Configuration
@ComponentScan(basePackages = "com.xworkz.app.KanthiSweets")
@Data
@ToString

public class SweetConfig {

	@Bean
	public Kanthi getKanthi() {
		return new Kanthi(); 
	}
	List<Sweets> l = new ArrayList<Sweets>();
	
	@Bean
	
	public List<Sweets> getSweets() {
		l.add(new Sweets(1 , "Jilebi" , 20));
		l.add(new Sweets(2, "Anarkali", 82));
		l.add(new Sweets(3, "Badusha ", 60));
		l.add(new Sweets(4 , "Holige" , 20));
		l.add(new Sweets(5, "Jamoon", 72));
		l.add(new Sweets(6, "Paysam", 80));
		l.add(new Sweets(7 , "halwa" , 45));
		l.add(new Sweets(8, "Badusha ", 60));
		l.add(new Sweets(9 , "Holige" , 20));
		l.add(new Sweets(10, "Jamoon", 72));
		l.add(new Sweets(11, "Paysam", 80));
		l.add(new Sweets(12 , "carothalwa" , 45));
		l.add(new Sweets(13 , "gulkan" , 67));
		l.add(new Sweets(14, "ladoo", 60));
		l.add(new Sweets(15 , "shavige" , 90));
		return l;
	}
		
		
		
		
	}
	

