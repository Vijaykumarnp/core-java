package com.xworkz.app.repository;

import java.util.List;


import com.xworkz.app.dto.CustomerDTO;

public interface BankRepo {

	
	CustomerDTO createAccount(CustomerDTO dto);

	List<CustomerDTO> getAllCustomers();

	CustomerDTO updateCustomerById(CustomerDTO dto);

	List<CustomerDTO> deleteById(int id);

	List<CustomerDTO> getCustomersById(int id);
}
