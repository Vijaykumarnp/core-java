package com.xworkz.app;

import java.util.Scanner;

import org.springframework.context.annotation.Bean;

import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;
@Configuration
public class SpringConfiguration {

	@Bean(name = "person")
	public Person getPerson(){
		
		Person  g = new Person();
		g.setId(1);
		g.setName("prashanth");
		g.setAge(23);
		return g;
	}
	@Bean(value = "person1")
	public Person getPerson1() {
		Person h = new Person();
		h.setId(2);
		h.setName("vikram");
		h.setAge(34);
		return h;
	}
	
	@Bean(name = "person2")
	public Person getPerson2() {
		Person j = new Person();
		j.setId(3);
		j.setName("Bhasha");
		j.setAge(45);
		return j;
		
	}
	
	@Bean(name= "person3")
	public Person getPerson3() {
		Person h = new Person();
		h.setId(4);
		h.setName("akram");
		h.setAge(34);
		return h;
	}
	
	@Bean(name = "person4")
	public Person getPerson4() {
		Person l = new Person();
		l.setId(5);
		l.setName("Navven");
		l.setAge(23);
		return l;
		
	}
	
	
	
	@Bean(name = "wire")
	public Wire getWire() {
		Wire t = new Wire();
		t.setId(1);
		t.setName("phinolex");
		t.setPrice(4500);
		
		
		return t;
	}
	@Bean(name = "wire1")
	public Wire getWire1() {
		Wire j = new Wire();
		j.setId(2);
		j.setName("vguard");
		j.setPrice(5000);
		return j;
	}
	
	@Bean(name = "wire2")
	public Wire getWire2() {
		Wire k = new Wire();
		k.setId(3);
		k.setName("vss");
		k.setPrice(23876);
		return k;
	}
	
	

	@Bean(name = "wire3")
	public Wire getWire3() {
		Wire k = new Wire();
		k.setId(4);
		k.setName("sav");
		k.setPrice(6764);
		return k;
	}
	

	@Bean(name = "wire4")
	public Wire getWire4() {
		Wire k = new Wire();
		k.setId(5);
		k.setName("faf");
		k.setPrice(5465);
		return k;
	}
	
	
	@Bean(name = "f")
	public FoodStall getFoodStall(){
		
		FoodStall stall = new FoodStall();
		stall.setId(1);
		stall.setName("sri basaveshwara");
		stall.setIncome(3000);
		return stall;
	}
	
	
	@Bean(name = "f1")
	public FoodStall getFoodStall1(){
		
		FoodStall stall = new FoodStall();
		stall.setId(2);
		stall.setName("sri Ragavendra");
		stall.setIncome(4000);
		return stall;
	}
	
	@Bean(name = "f2")
	public FoodStall getFoodStall2(){
		
		FoodStall stall = new FoodStall();
		stall.setId(3);
		stall.setName("sri Mallikarguna");
		stall.setIncome(3500);
		return stall;
	}
	
	
	@Bean(name = "f3")
	public FoodStall getFoodStall3(){
		
		FoodStall stall = new FoodStall();
		stall.setId(3);
		stall.setName("sri Manjunatha");
		stall.setIncome(3000);
		return stall;
	}
	
	
	
	@Bean(name = "f4")
	public FoodStall getFoodStall4(){
		
		FoodStall stall = new FoodStall();
		stall.setId(4);
		stall.setName("sri Vaidevoi");
		stall.setIncome(3000);
		return stall;
	}
	
	
	
	
	
	
	@Bean(name = "l")
	public Laptop getLaptop() {
		Laptop l =new Laptop();
		l.setId(1);
		l.setName("Thinkpad");
		l.setPrice(35000);
		return l;
	}
		
		@Bean(name = "l1")
		public Laptop getLaptop1() {
			Laptop l =new Laptop();
			l.setId(2);
			l.setName("lenovo");
			l.setPrice(36000);
			return l;
	
	}
		
		
		@Bean(name = "l2")
		public Laptop getLaptop2() {
			Laptop l =new Laptop();
			l.setId(3);
			l.setName("HP");
			l.setPrice(35000);
			return l;
		}
		
		@Bean(name = "l3")
		public Laptop getLaptop3() {
			Laptop l =new Laptop();
			l.setId(4);
			l.setName("ASUS");
			l.setPrice(8992);
			return l;
		}
		
		@Bean(name = "l4")
		public Laptop getLaptop4() {
			Laptop l =new Laptop();
			l.setId(5);
			l.setName("MacBook");
			l.setPrice(1000000);
			return l;
		}
		
		
		
		
	@Bean(name="train")
	public Train getTrain() {
		Train g = new Train();
		g.setId(1);
		g.setName("Onde Bharath");
		g.setTicketPrice(300);
		return g;
	}
	
	@Bean(name = "train1")
	public Train getTrain1() {
		Train g = new Train();
		g.setId(2);
		g.setName("Onde Matharam");
		g.setTicketPrice(500);
		return g;
	}
	
	@Bean(name = "train2")
	public Train getTrain2() {
		Train g = new Train();
		g.setId(3);
		g.setName("Mysur Express");
		g.setTicketPrice(450);
		return g;
	}
	
	@Bean(name = "train3")
	public Train getTrain3() {
		Train g = new Train();
		g.setId(4);
		g.setName("Manglore Express");
		g.setTicketPrice(700);
		return g;
	}
	
	@Bean(name = "train4")
	public Train getTrain4() {
		Train g = new Train();
		g.setId(5);
		g.setName("Banglore Express");
		g.setTicketPrice(1000);
		return g;
	}
	
	
	@Bean(name = "i1")
	public Integer getInteger() {
		
		return 20;
		
	}
	
	@Bean(name = "i2")
	public Integer getInteger2() {
		
		return 21;
		
	}
	
	@Bean(name = "i3")
	public Integer getInteger3() {
		
		return 30;
		
	}
	
	
	@Bean(name = "i4")
	public Integer getInteger4() {
		
		return 40;
		
	}
	
	@Bean(name = "i5")
	public Integer getInteger5() {
		
		return 70;
		
	}
	
	
	@Bean(name = "s1")
	public Short getShort1() {
	return 23;	
	}
	@Bean(name = "s2")
	public Short getShort2() {
	return 24;	
	}
	@Bean(name = "s3")
	public Short getShort3() {
	return 25;	
	}
	@Bean(name = "s4")
	public Short getShort4() {
	return 26;	
	}
	@Bean(name = "s5")
	public Short getShort5() {
	return 27;	
	}
	
	@Bean(name = "d1")
	public String getString() {
		
		return "vijay";
	}
	
	@Bean(name = "d2")
	public String getString1() {
		
		return "viji";
	}
	
	@Bean(name = "d3")
	public String getString2() {
		
		return "likith";
	}
	
	
	@Bean(name = "d4")
	public String getString3() {
		
		return "likith";
	}
	
	
}
