package com.xworkz.app.runner;

import com.xworkz.app.dto.ShoppingDTO;
import com.xworkz.app.repo.ShoppingRepo;
import com.xworkz.app.repo.ShoppingRepoImpl;
import com.xworkz.app.service.ShoppingService;
import com.xworkz.app.service.ShoppingServiceImpl;

public class Runeer {

	
	public static void main(String[] args) {
		
		ShoppingDTO dto = new ShoppingDTO();
		
		ShoppingRepo repo = new ShoppingRepoImpl();
		
		ShoppingService ser= new ShoppingServiceImpl(repo);
		ser.validateAndSave(dto);
		ser.readAll();
		ser.readByEmail("kfc@gmail.com");
		ser.readByName("sagar");
		ser.updateByEmail("savithri", "sagar@gmail.com");
		ser.deleteByEmail("sagar@gmail.com");
		
		
		
		
		
	}
	
}
