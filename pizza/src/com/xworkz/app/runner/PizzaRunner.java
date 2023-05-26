package com.xworkz.app.runner;

import com.xworkz.app.dto.PizzaDTO;
import com.xworkz.app.repository.PizzaRepo;
import com.xworkz.app.repository.PizzaRepoImpl;
import com.xworkz.app.service.PizzaService;
import com.xworkz.app.service.PizzaServiceImpl;

public class PizzaRunner {

	
	public static void main(String[] args) {
		PizzaDTO dto = new PizzaDTO(1, "corn", 833, "small", "pizza mania");
		PizzaRepo rep = new PizzaRepoImpl() ;
			
		
			PizzaService serc = new PizzaServiceImpl(rep);
			
		//serc.validateAndSave(dto);
		//serc.update(1);
		serc.delete("small");
		
		
	}
}
