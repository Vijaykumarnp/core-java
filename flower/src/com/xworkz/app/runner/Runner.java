package com.xworkz.app.runner;

import com.xworkz.app.dto.FlowerDTO;
import com.xworkz.app.repo.FlowerRepo;
import com.xworkz.app.repo.FlowerRepoImpl;
import com.xworkz.app.service.FlowerService;
import com.xworkz.app.service.FlowerServiceImpl;

public class Runner {

	
	public static void main(String[] args) {
		
		FlowerDTO dto = new FlowerDTO();
		
		FlowerRepo h = new FlowerRepoImpl() ;
			
		
		
		FlowerService sec = new FlowerServiceImpl(h);
		
		//sec.validateAndUpdate(dto);
		//sec.update(4);
		sec.delete("mansoon");
		
}
}