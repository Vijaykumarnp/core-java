package com.xworkz.app.list;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Tester {

	public static void main(String[] args) {
		
	ApplicationContext con = new AnnotationConfigApplicationContext(SpringConfigu.class);
	Library li = con.getBean("c", Library.class);
	List<Book> l = new SpringConfigu().getBook();
	
	li.setBooks(l);
	System.out.println(li);
	
	
		
	}
	
	
	
}
