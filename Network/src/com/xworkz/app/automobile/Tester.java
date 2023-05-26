package com.xworkz.app.automobile;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Tester {

	
	public static void main(String[] args) {
		
		ApplicationContext con = new AnnotationConfigApplicationContext(AutoMobileCon.class);
		AutoMobile m = con.getBean("b",AutoMobile.class);
		List<SpareParts> l = new AutoMobileCon().getSpare();
		m.setSpare(l);
		System.out.println(m);
		
		
		
		
		
	}
	
	
	
	
}
