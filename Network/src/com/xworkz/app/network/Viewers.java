package com.xworkz.app.network;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import lombok.Data;

@Component
@Data
public class Viewers {

	@Value("20")
	private int noOfViewers;
	
}
