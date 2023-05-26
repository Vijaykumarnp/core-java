package com.xworkz.app.dto;


import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NonNull;

@Data
@AllArgsConstructor
public class WaterFallsDTO {

	private int id;
	
	
	@NotBlank
	@NotEmpty
	@NonNull
	
	private String waterFalsName;
	private String location;
	private String waterType;
	private int height;
	private String alowance;
	
	
	
	
	
}
