package com.xworkz.app.network;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import lombok.Data;
@Data
@Component
public class Players {

	
	@Value("Virat kohli")
	private String playerName;
}
