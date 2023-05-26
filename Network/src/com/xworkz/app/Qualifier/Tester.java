package com.xworkz.app.Qualifier;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Tester {

	public static void main(String[] args) {
		
		ApplicationContext con = new AnnotationConfigApplicationContext(Configu.class);
		Owner g = con.getBean(Owner.class);
		System.out.println(g.getRestuart().servFood());
		
		
		
		
	}
	
}
