package com.xworkz.app.repository;

import com.xworkz.app.dto.WaterFallsDTO;

public class WaterFalsRepoImpl implements WaterFalsRepo{

	@Override
	public boolean onSave(WaterFallsDTO dto) {
		System.out.println("onSave method");
		return true;
	}

}
