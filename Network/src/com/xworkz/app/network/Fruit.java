package com.xworkz.app.network;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import lombok.Data;
import lombok.ToString;

@Component
@ToString
@Data
public class Fruit {

	@Value("Apple")
	private String fruitName;
	
}
