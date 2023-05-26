package com.xworkz.app.dto;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NonNull;

@Data
@AllArgsConstructor
public class GamesDTO {

	
	
	private int id;
	@NotBlank
	@NonNull
	@NotEmpty
	@Size(min =2 , max= 20)
	private String name;
	private int size;
	private String language;
	private String gameType;
	
	
	
}
