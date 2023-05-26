package com.xworkz.app;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.xworkz.app.configuration.SpringConfiguration;
import com.xworkz.app.controler.FinanceControler;

public class Tester {

	
	public static void main(String[] args) {
		
		ApplicationContext con = new AnnotationConfigApplicationContext(SpringConfiguration.class);
	FinanceControler d =  	 con.getBean(FinanceControler.class);
	//FinanceDTO f = 	   con.getBean(FinanceDTO.class);
	FinanceDTO f1 = 	   con.getBean("a",FinanceDTO.class);
	FinanceDTO g =	d.process(f1); 
	List<FinanceDTO> lis = new ArrayList<FinanceDTO>();
	
		
		
		
		
	}
	
	
	
}
