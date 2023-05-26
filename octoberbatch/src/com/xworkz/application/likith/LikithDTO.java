package com.xworkz.application.likith;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@AllArgsConstructor
@Getter
@Setter
public class LikithDTO {

	public LikithDTO() {
		// TODO Auto-generated constructor stub
	}
	private int id;
	private String location;
	private String qualification;
	private long contactNo;
	
	
	
	
}
