package com.xworkz.app.dto;

import javax.validation.constraints.NotBlank;

import io.smallrye.common.constraint.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
@Data
@AllArgsConstructor
public class FlowerDTO {

	public FlowerDTO() {
		// TODO Auto-generated constructor stub
	}
	private int id;
	@NotNull
	@NotBlank
	private String name;
	private int price;
	private String use;
	private String seanson;
	
	
}
