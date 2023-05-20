package com.xworkz.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xworkz.app.dto.CustomerDTO;
import com.xworkz.app.repository.BankRepo;
@Service
public class BankServiceIMPL implements BankService {

	@Autowired
	BankRepo repo;
	
	@Override
	public CustomerDTO validateAndCreateAccount(CustomerDTO dto) {
	
		try {
			boolean isCoustomerNamePresent = false;
			boolean isPhoneNoPresent = false;
			boolean isAdharNOPresent = false;
			boolean isAdreesPresent  = false;
			
			
			if(dto.getCustomerName() != null) {
				isCoustomerNamePresent = true;
			}
			if(dto.getPhoneNo() != null) {
				isPhoneNoPresent = true;
			}
			if(dto.getAdharNO() != null) {
				isAdharNOPresent = true;
			}
			if(dto.getAdress() != null) {
				isAdreesPresent = true;
			}
		
			if(isCoustomerNamePresent == true && isPhoneNoPresent == true  && isAdharNOPresent == true && isAdreesPresent == true) {
			
				System.out.println("service");
			repo.createAccount(dto);
			}
		}catch (Exception e) {
		e.printStackTrace();
		}
		return dto;
	}

	@Override
	public List<CustomerDTO> getAllCustomers() {
		System.out.println("get all customers service");
		return repo.getAllCustomers();
	}

	@Override
	public CustomerDTO updateCustomerById(CustomerDTO dto) {
		// TODO Auto-generated method stub
		return repo.updateCustomerById(dto);
	}

	@Override
	public List<CustomerDTO> validateAndDelete(int id) {
		
		return repo.deleteById(id);
	}

	@Override
	public List<CustomerDTO> getCustomersId(int id) {
		// TODO Auto-generated method stub
		return repo.getCustomersById(id);
	}

}
