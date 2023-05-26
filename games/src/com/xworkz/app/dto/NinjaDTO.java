package com.xworkz.app.dto;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

import io.smallrye.common.constraint.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
@Data
@AllArgsConstructor
public class NinjaDTO {

	private int id;
	
	@NotBlank
	@NotNull
	@Size(min=5 , max= 25)
	private String platForm;
	private int size;
	
	
	
	
}
