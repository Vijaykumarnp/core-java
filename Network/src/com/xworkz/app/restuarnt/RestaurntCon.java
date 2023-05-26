package com.xworkz.app.restuarnt;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import lombok.Getter;
import lombok.Setter;



@Configuration
@Getter
@Setter
public class RestaurntCon {

	
	@Bean
	public Restuarnt getRestaurnt() {
		return new Restuarnt();
		
	}
	@Bean
	public List<Foods> getFood(){
		List<Foods> l = new ArrayList<Foods>();
		l.add(new Foods(1, "Biriyani", 225));
		l.add(new Foods(2, "MuttonBiriyani", 400));
		l.add(new Foods(3, "RotiCurry", 245));
		l.add(new Foods(4, "shawarma", 400));
		l.add(new Foods(5, "chickencurry", 400));
		l.add(new Foods(6, "chickenfry", 78));
		l.add(new Foods(7, "thale mamsa", 500));
		l.add(new Foods(8, "liver", 200));
		l.add(new Foods(9, "barbeque", 190));
		l.add(new Foods(10, "boti", 450));
		l.add(new Foods(11, "pannerbuttermasala", 77));
		l.add(new Foods(12, "RotiCurry", 90));
		l.add(new Foods(13, "mushroom",100));
		l.add(new Foods(14, "maggie", 50));
		l.add(new Foods(15, "mutton", 200));
		return l;
		
	}
	
}
