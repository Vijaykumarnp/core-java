package com.xworkz.app.runner;

import java.sql.PreparedStatement;

import com.xworkz.app.dto.FestivalDTO;
import com.xworkz.app.repo.FestialRepoImpl;
import com.xworkz.app.repo.FestivalRepository;
import com.xworkz.app.service.FestivalService;
import com.xworkz.app.service.FestivalServiceImpl;

public class Runner {

	
	public static void main(String[] args) {
		
		FestivalDTO  dto = new FestivalDTO();
		FestivalRepository sr = new FestialRepoImpl();
		FestivalService sre = new FestivalServiceImpl(sr);
		//sre.validateAndSave(dto);
		//sre.update("hhh" , 3);
		sre.delete(5);
		
	}
}
