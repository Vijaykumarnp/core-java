package com.xworkz.app.dto;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;



@Data
@AllArgsConstructor
@Getter
@Setter
public class BirthdayDTO {

	
	public BirthdayDTO() {
		// TODO Auto-generated constructor stub
	}
	private int id ;
	@NotBlank
	@NotEmpty
	@NotNull
	private String birthdayGuy;
	private String location;
	private String date;
	private String foodType;
	
	
	
	
	
}
