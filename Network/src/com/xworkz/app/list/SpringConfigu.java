package com.xworkz.app.list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import lombok.Lombok;

@Configuration


@ComponentScan(basePackages = "com.xworkz.app.list")
public class SpringConfigu {

	
	public Library getLibrary() {
		
		return new Library();
	}
    @Bean
	public List<Book> getBook() {
		List<Book> l =  new ArrayList<Book>();
		l.add(new Book(1, "Darabendre", "MokajiyaKanasugalu"));
		l.add(new Book(2 , "Aspire" , "Stark"));
		l.add(new Book(3, "Dandi" , "Marcile"));
		l.add(new Book(4, "ThorBiography", "Thor"));
		l.add(new Book(5 , "Gulaal" , "Laala"));
		l.add(new Book(6, "Nakuthanthi" , "GirishKarnad"));
		l.add(new Book(7, "dubare", "kja"));
		l.add(new Book(8 , "ew" , "Evil"));
		l.add(new Book(9, "will" , "Williams"));
		l.add(new Book(10, "bang", "jaja"));
		l.add(new Book(11 , "Kumpa" , "zampa"));
		l.add(new Book(12, "bandil" , "Marcile"));
		l.add(new Book(13 , "bandana" , "vishnu"));
		l.add(new Book(14 , "belbottom" , "rishab"));
		l.add(new Book(15, "hangon" , "william"));
		return l ;
	}
	  
	
	
	
}
