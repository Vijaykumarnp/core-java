package com.xworkz.app.KanthiSweets;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;


@Component
@Data
@ToString
@AllArgsConstructor
@Getter
@Setter
public class Sweets {

	
	
	
	public Sweets() {
		System.out.println(this.getClass().getSimpleName()+"Object is created");
	}
	
	//@Value("1")
	private int id;
	//@Value("Jangeer")
	private String sweetName;
	//@Value("20")
	private int price;
	
	
	
}
