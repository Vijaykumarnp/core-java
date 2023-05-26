package com.xworkz.app.runner;

import com.xworkz.app.dto.WaterFallsDTO;
import com.xworkz.app.repository.WaterFalsRepo;
import com.xworkz.app.repository.WaterFalsRepoImpl;
import com.xworkz.app.service.WaterFalsService;
import com.xworkz.app.service.WaterFalsServiceImpl;

public class WaterFalsRunner {

	
	
	public static void main(String[] args) {
		
		WaterFallsDTO dto = new WaterFallsDTO(1, "chikmanluru", "cold", 700, "peoples are alowed");
		
		WaterFalsRepo repo = new WaterFalsRepoImpl();
		
		
		WaterFalsService ser = new  WaterFalsServiceImpl(repo);
		
		System.out.println(ser.validateAndSave(dto));
			
	}
	
}
