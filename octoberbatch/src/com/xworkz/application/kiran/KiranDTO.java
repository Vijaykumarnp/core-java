package com.xworkz.application.kiran;

import com.xworkz.application.likith.LikithDTO;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@AllArgsConstructor
@Getter
@Setter
public class KiranDTO {

	
	
	public KiranDTO() {
		// TODO Auto-generated constructor stub
	}
	private int id;
	private String location;
	private String qualification;
	private long contactNo;
	
	
	
}
