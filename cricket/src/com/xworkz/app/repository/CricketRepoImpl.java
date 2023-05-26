package com.xworkz.app.repository;

import com.xworkz.app.cricketdto.CricketDTO;

public class CricketRepoImpl implements CricketRepository {
	
	
	public CricketRepoImpl() {
		System.out.println("cricket repository class");
	}

	@Override
	public boolean onSave(CricketDTO dto) {
	System.out.println("this is onSave of CricketRepoImpl");
		return true;
	}

}
