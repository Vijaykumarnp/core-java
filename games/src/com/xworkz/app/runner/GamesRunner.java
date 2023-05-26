package com.xworkz.app.runner;

import com.xworkz.app.dto.GamesDTO;
import com.xworkz.app.repository.GamesRepoImpl;
import com.xworkz.app.repository.GamesRepository;
import com.xworkz.app.service.GamesSericeImpl;
import com.xworkz.app.service.GamesService;

public class GamesRunner {

	
	public static void main(String[] args) {
		
		
		
		GamesDTO dto = new GamesDTO(1, "GTYCITY", 87, "python", "adult");
		
		
		GamesRepository repo = new GamesRepoImpl();
		
		
		GamesService ser = new GamesSericeImpl(repo);
	ser.validateAndSave(dto);
	
	}
	
	
	
	
}
