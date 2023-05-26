package com.xworkz.airsapp.terminals;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import lombok.Value;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString


public class Terminal implements Serializable{

	private String name;
	private int sizee;
	private String type;
	
	
	
}
