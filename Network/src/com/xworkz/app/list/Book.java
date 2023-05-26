package com.xworkz.app.list;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Component
@Data
@ToString
@AllArgsConstructor


public class Book  {

	
	public Book() {
		System.out.println(this.getClass().getSimpleName()+"object is created");
		
		
	}
	
	
	@Value("1 ")
	private int id;
	@Value("girish")
	private String authore;
	@Value("mookajiyakanasugalu ")
	private String bookName;
	
	
	
	
	
}
