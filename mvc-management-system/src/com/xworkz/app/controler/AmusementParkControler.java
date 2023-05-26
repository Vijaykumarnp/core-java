package com.xworkz.app.controler;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import com.xworkz.app.dto.AmusemnetParkDTO;
import com.xworkz.app.exception.AmusementParkException;
import com.xworkz.app.repository.AmusementParkRepository;
import com.xworkz.app.service.AmusementParkService;

@Component
@Scope(value = "prototype")
public class AmusementParkControler {

	@Autowired
	private AmusementParkService aumuse;

	// methods -- which helps to process data

	public AmusemnetParkDTO process(AmusemnetParkDTO dto) {
		System.out.println("inside process");
		try {
			if (dto != null) {
				AmusemnetParkDTO dtos = aumuse.validateAndSave(dto);
				return dtos;
			} else {
				System.out.println("Dto is null");
			}
		} catch (AmusementParkException e) {
			e.printStackTrace();
			throw new AmusementParkException();
		}
		return dto;
	}

}
