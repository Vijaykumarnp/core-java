package com.xworkz.app.restuarnt;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Tester {

	public static void main(String[] args) {
	
		ApplicationContext con  = new AnnotationConfigApplicationContext(RestaurntCon.class);
		Restuarnt r = con.getBean(Restuarnt.class);
		List<Foods> l = new RestaurntCon().getFood();
		r.setFoods(l);
		
		System.out.println(l);
		
		
	}
	
	
	
	
	
	
	
	
}
