package com.xworkz.app.TeaShop;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Tester {

	public static void main(String[] args) {
		
		ApplicationContext co = new AnnotationConfigApplicationContext(Configuration.class);
		TeaShop h =  co.getBean(TeaShop.class);
		List<Category> l = new Configuration().getCategory();
		h.setCategory(l);
		System.out.println(h);
		
	}
	
	
	
}
