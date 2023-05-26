package com.xworkz.app.automobile;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
@Configuration
@ComponentScan(basePackages=" com.xworkz.app.automobile")
public class AutoMobileCon {

	
	@Bean
	public List<SpareParts> getSpare(){
		List<SpareParts> l = new ArrayList<SpareParts>();
		l.add(new SpareParts(1, "battery", 2400));
		l.add(new SpareParts(2 , "mobileholder" , 1500));
		l.add(new SpareParts(3, "mirror", 500));
		l.add(new SpareParts(5, "fronttyre" , 1200));
		l.add(new SpareParts(6, "backtyre", 2000));
		l.add(new SpareParts(7 , "cylencer" , 5000));
		l.add(new SpareParts(8, "sparkplug", 100));
		l.add(new SpareParts(9 , "carborator" , 400));
		l.add(new SpareParts(10, "mask", 500));
		l.add(new SpareParts(11, "headlight" , 1500));
		l.add(new SpareParts(12, "airfilter", 500));
		l.add(new SpareParts(13, "seatcover" , 700));
		l.add(new SpareParts(14, "deiseltank", 24000));
		l.add(new SpareParts(15, "petroltank" , 1500));
		
		return l;
		
	}
	
	
}
