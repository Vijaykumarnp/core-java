package com.xworkz.app;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString

public class FinanceDTO  implements Serializable{

	private int id;
	private String financeName;
	private String location;
	private String financeType;
	
	
	
	
	
}
