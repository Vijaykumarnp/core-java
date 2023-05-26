package com.xworkz.app.configuration;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.xworkz.app.dto.AmusemnetParkDTO;
@Configuration
@ComponentScan(basePackages = "com.xworkz.app")
public class SpringConfiguration {
    @Bean
	public List<AmusemnetParkDTO> getList(){
		
		
		return new ArrayList<AmusemnetParkDTO>();
	}
	
	@Bean
	AmusemnetParkDTO getAmusemnetParkDTO(){
		System.out.println("inside configuration");
		AmusemnetParkDTO amus = new AmusemnetParkDTO();
		amus.setAmusementParkId(1);
		amus.setAmusementParkAdress("Honkong");
		amus.setAreaOccupied("5600");
		amus.setEntryFee(4789.99);
		
		
	return amus;	
	}
	
	
	
	
	
}
