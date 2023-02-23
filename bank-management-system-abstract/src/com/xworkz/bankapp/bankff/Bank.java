package com.xworkz.bankapp.bankff;

import com.xworkz.bankapp.customerff.Customer;

public interface Bank {

	public  void addCostumers(Customer cust);
	public Customer getAllCustomers();
    public Customer getCustomerById(int id);
	
	
}
