package com.xworkz.app.dto;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;

import io.smallrye.common.constraint.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class PizzaDTO {

	
	
	public PizzaDTO() {
		// TODO Auto-generated constructor stub
	}
	private int id;
	@NotBlank
	@NotEmpty
	@NotNull
	private String name;
	private int prize;
	private String size;
	private String storeName;
}
