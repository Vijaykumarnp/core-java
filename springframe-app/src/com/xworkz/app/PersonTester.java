package com.xworkz.app;

import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class PersonTester {

	public static void main(String[] args) {
		
		
		ApplicationContext applicationContext = new AnnotationConfigApplicationContext( SpringConfiguration.class);
		//Person person = applicationContext.getBean("Person",Person.class);
		//System.out.println(person);
		System.out.println(applicationContext.getBean("person", Person.class));
		System.out.println(applicationContext.getBean("person1", Person.class));
		System.out.println(applicationContext.getBean("person2", Person.class));
		System.out.println(applicationContext.getBean("person3", Person.class));
		System.out.println(applicationContext.getBean("person4", Person.class));
		
		
		System.out.println(applicationContext.getBean("wire", Wire.class));
		System.out.println(applicationContext.getBean("wire1", Wire.class));
		System.out.println(applicationContext.getBean("wire2", Wire.class));
		System.out.println(applicationContext.getBean("wire3", Wire.class));
		System.out.println(applicationContext.getBean("wire4", Wire.class));
		
		
		System.out.println(applicationContext.getBean("f", FoodStall.class));
		System.out.println(applicationContext.getBean("f1", FoodStall.class));
		System.out.println(applicationContext.getBean("f2", FoodStall.class));
		System.out.println(applicationContext.getBean("f3", FoodStall.class));
		System.out.println(applicationContext.getBean("f4", FoodStall.class));
		
	System.out.println(applicationContext.getBean("l", Laptop.class));
	System.out.println(applicationContext.getBean("l1", Laptop.class));
	System.out.println(applicationContext.getBean("l2", Laptop.class));
	System.out.println(applicationContext.getBean("l3", Laptop.class));
	System.out.println(applicationContext.getBean("l4", Laptop.class));
	
	
	
	System.out.println(applicationContext.getBean("train", Train.class));
	System.out.println(applicationContext.getBean("train1", Train.class));
	System.out.println(applicationContext.getBean("train2", Train.class));
	System.out.println(applicationContext.getBean("train3", Train.class));
	System.out.println(applicationContext.getBean("train4", Train.class));
	
	
	
	
	System.out.println(applicationContext.getBean("i1", Integer.class));
	System.out.println(applicationContext.getBean("i2", Integer.class));
	System.out.println(applicationContext.getBean("i3", Integer.class));
	System.out.println(applicationContext.getBean("i4", Integer.class));
	System.out.println(applicationContext.getBean("i5", Integer.class));
	
	System.out.println(applicationContext.getBean("s1", Short.class));
	System.out.println(applicationContext.getBean("s2", Short.class));
	System.out.println(applicationContext.getBean("s3", Short.class));
	System.out.println(applicationContext.getBean("s4", Short.class));
	System.out.println(applicationContext.getBean("s5", Short.class));
	
	System.out.println(applicationContext.getBean("d1", String.class));
	System.out.println(applicationContext.getBean("d2", String.class));
	System.out.println(applicationContext.getBean("d3", String.class));
	System.out.println(applicationContext.getBean("d4", String.class));
	
	
	
	
	}
}
