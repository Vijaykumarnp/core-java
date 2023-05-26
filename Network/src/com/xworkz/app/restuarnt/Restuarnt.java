package com.xworkz.app.restuarnt;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class Restuarnt {

	
	@Autowired
	private List<Foods> foods;
	
	
}
