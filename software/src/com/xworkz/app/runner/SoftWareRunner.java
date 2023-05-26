package com.xworkz.app.runner;

import com.xworkz.app.dto.SoftwareDTO;
import com.xworkz.app.repository.SoftwareRepo;
import com.xworkz.app.repository.SoftwareRepoImpl;
import com.xworkz.app.service.SoftWareService;
import com.xworkz.app.service.SoftWareServiceImpl;

public class SoftWareRunner {

	
	
	public static void main(String[] args) {
		
	
	SoftwareDTO dto = new SoftwareDTO(1, "whats app", 24, "messaging", 1.2);
	
	
	SoftwareRepo  repo = new SoftwareRepoImpl();
	

	
	SoftWareService ser = new SoftWareServiceImpl(repo);

ser	.validateAndSave(dto);
	
	
	}
	
	
}
