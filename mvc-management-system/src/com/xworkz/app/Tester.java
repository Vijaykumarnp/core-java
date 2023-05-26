package com.xworkz.app;

import org.springframework.context.ApplicationContext;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.xworkz.app.configuration.SpringConfiguration;
import com.xworkz.app.controler.AmusementParkControler;
import com.xworkz.app.dto.AmusemnetParkDTO;

public class Tester {

	public static void main(String[] args) {
		System.out.println("main method started");
		ApplicationContext con = new AnnotationConfigApplicationContext(SpringConfiguration.class);
		AmusementParkControler contro = con.getBean(AmusementParkControler.class);
		System.out.println("by bean");
		AmusemnetParkDTO dto = con.getBean(AmusemnetParkDTO.class);
		AmusementParkControler contro1 = con.getBean(AmusementParkControler.class);
		AmusementParkControler contro2 = con.getBean(AmusementParkControler.class);
		System.out.println(contro);
		System.out.println(contro1);
		System.out.println(contro2);
		System.out.println("by developer");
		AmusementParkControler c1 = new AmusementParkControler();
		AmusementParkControler c12 = new AmusementParkControler();
		AmusementParkControler c13 = new AmusementParkControler();
		System.out.println(c1);
		System.out.println(c12);
		System.out.println(c13);
		AmusemnetParkDTO c = contro.process(dto);
		
		System.out.println(c);
		System.out.println("main method ended");
	}

}
