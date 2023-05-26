package com.xworkz.app.network;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

import lombok.Data;
import lombok.ToString;

@Data
@ToString
@Configuration
public class Juice {

	@Value("Apple Juice")
	private String juiceName;
	@Autowired
	private Fruit fruitName;
}
