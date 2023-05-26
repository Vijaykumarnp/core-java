package com.xworkz.app.dto;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;

import io.smallrye.common.constraint.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class FestivalDTO {

	
	public FestivalDTO() {
		// TODO Auto-generated constructor stub
	}
	private int id;
@NotBlank

@NotEmpty
	private String festname;
	private String religion;
	private String sweet;
	private String foodType;
	
	
	
	
}
