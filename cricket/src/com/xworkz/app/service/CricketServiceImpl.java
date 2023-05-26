package com.xworkz.app.service;

import com.xworkz.app.cricketdto.CricketDTO;
import com.xworkz.app.repository.CricketRepoImpl;
import com.xworkz.app.repository.CricketRepository;

public class CricketServiceImpl implements CricketService {
	CricketRepository repository;
	
	
	public CricketServiceImpl() {
		System.out.println("this is CricketServiceImpl");
	}
	
	public CricketServiceImpl(CricketRepository repository  ) {
	this.repository = repository;
	}
	
	@Override
	public boolean validateAndSave(CricketDTO dto) {
		System.out.println("this is validate and save of CricketServiceImpl class");
		
		
		return true;
	}

}
