package com.xworkz.app.runner;

import com.xworkz.app.cricketdto.CricketDTO;
import com.xworkz.app.repository.CricketRepoImpl;
import com.xworkz.app.repository.CricketRepository;
import com.xworkz.app.service.CricketService;
import com.xworkz.app.service.CricketServiceImpl;

public class CricketRunner {

	
	public static void main(String[] args) {
		System.out.println("runner class");
		
		CricketDTO dto = new CricketDTO(1, "test", "bangalore", "cloudy", 1000);
		
		CricketRepository repo = new CricketRepoImpl();
		
		CricketService service = new CricketServiceImpl(repo);
		service.validateAndSave(dto);
	}
	
	
}
