package com.xworkz.app.automobile;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;


@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Component
public class AutoMobile {

	@Autowired
	private List<SpareParts> spare;
	
	
	
	
}
