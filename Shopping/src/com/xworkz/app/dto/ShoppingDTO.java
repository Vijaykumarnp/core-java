package com.xworkz.app.dto;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;

import io.smallrye.common.constraint.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ShoppingDTO {

	private int id;
	@NotBlank
	@NotNull
	@NotEmpty
	private String name;
	@NotBlank
	@NotNull
	@NotEmpty
	private String email;
	@NotBlank
	@NotNull
	@NotEmpty
	private String location;
	private long income;
	
	
	
}
