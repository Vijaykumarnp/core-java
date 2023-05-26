package com.xworkz.app.dto;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.NotEmpty;

import io.smallrye.common.constraint.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class SoftwareDTO {

	
	
	private int id;
	@NotBlank
	@NotNull
	@NotEmpty
	@Size(min = 2 , max =20)
	private String name;
	private int size;
	private String use;
	private double currentVersion;
	
}
