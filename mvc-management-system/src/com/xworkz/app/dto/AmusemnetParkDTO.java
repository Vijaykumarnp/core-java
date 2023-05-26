package com.xworkz.app.dto;

import java.io.Serializable;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class AmusemnetParkDTO implements Serializable{

	
	
	private int amusementParkId;
	private String amusementParkAdress;
	private String areaOccupied;
	private double entryFee;
	
	
	
	
}
