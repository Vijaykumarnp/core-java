package com.xworkz.app.cricketdto;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class CricketDTO {

	private int id;
	private String type;
	private String location;
	private String weather;
	private int ticketPrice;
	
	
	
	
}
