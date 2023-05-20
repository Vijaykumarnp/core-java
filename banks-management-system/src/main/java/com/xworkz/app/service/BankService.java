package com.xworkz.app.service;

import java.util.List;

import com.xworkz.app.dto.CustomerDTO;

public interface BankService {

	
	public CustomerDTO validateAndCreateAccount(CustomerDTO dto);

	public List<CustomerDTO> getAllCustomers();

	public CustomerDTO updateCustomerById(CustomerDTO dto);

	public List<CustomerDTO> validateAndDelete(int id);

	public List<CustomerDTO> getCustomersId(int id);
	
}
