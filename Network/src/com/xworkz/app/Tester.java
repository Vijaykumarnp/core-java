package com.xworkz.app;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.xworkz.app.network.AllConfig;
import com.xworkz.app.network.Building;
import com.xworkz.app.network.Channel;
import com.xworkz.app.network.Company;
import com.xworkz.app.network.Hotel;
import com.xworkz.app.network.House;
import com.xworkz.app.network.Institute;
import com.xworkz.app.network.Juice;
import com.xworkz.app.network.Mobile;
import com.xworkz.app.network.Team;


public class Tester {

	public static void main(String[] args) {
		ApplicationContext con = new AnnotationConfigApplicationContext(AllConfig.class);
		House h = con.getBean("t", House.class);
		Team j = con.getBean("a", Team.class );
		Channel l = con.getBean("b", Channel.class);
		Mobile m = con.getBean("c", Mobile.class);
		Hotel b = con.getBean("d" , Hotel.class);
		Institute i = con.getBean("e", Institute.class);
		Juice k = con.getBean("f", Juice.class);
		Building z = con.getBean("g" , Building.class);
		Company com = con.getBean("h" , Company.class);
		
		
		
		System.out.println(h);
		System.out.println(j);
		System.out.println(l);
		System.out.println(m);
	    System.out.println(b);
	    System.out.println(i);
		System.out.println(k);
		System.out.println(z);
	}
	
}
