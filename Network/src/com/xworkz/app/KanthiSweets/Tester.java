package com.xworkz.app.KanthiSweets;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Tester {

	public static void main(String[] args) {
		
		ApplicationContext con = new AnnotationConfigApplicationContext(SweetConfig.class);
		Kanthi lis= con.getBean("a", Kanthi.class);
		List<Sweets> li= new SweetConfig().getSweets();
		lis.getSweets();
		System.out.println(li);
		
		
		
	}
	
	
}
