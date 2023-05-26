package com.xworkz.app.configuration;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.xworkz.app.FinanceDTO;

@Configuration
@ComponentScan(basePackages =  "com.xworkz.app")
public class SpringConfiguration {
     @Bean
	public List<FinanceDTO> getList(){
		
		return new ArrayList<FinanceDTO>();
	}
	   
	@Bean
     public FinanceDTO getDto() {
    	 
    	 FinanceDTO d = new FinanceDTO();
    	 d.setId(1);
    	 d.setFinanceName("sriram");
    	 d.setFinanceType("vehicle");
    	 d.setLocation("arkalgud");
    	 
    	 return d;
    	 
     }
	
	
	
}
