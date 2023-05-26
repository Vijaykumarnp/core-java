package com.xworkz.app.network;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import lombok.Data;
import lombok.ToString;

@ToString
@Data
@Component
@Configuration
public class Doors {

	@Value("2")
	private int noOfDoors;
}
