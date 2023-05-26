package com.xworkz.bankapp.bankff;

import com.xworkz.bankapp.customerff.Customer;
import com.xworkz.bankapp.exception.CustomerNotFoundException;

public class AxisBank implements Bank {

	
	Customer cus[] ;
	int index;
	
	public AxisBank(int size) {
		cus = new Customer[size];
		
		
	}
	
	
	
	public int doBusiness() {
		return 2762;
	}
	
	@Override
	public void addCostumers(Customer cust) {
		System.out.println("inside the add customer method");
		if(cust.getCusName() != null && !(cust.getCusName().isEmpty())) {
			this.cus[index++] = cust;
		}
		
		
	}

	@Override
	public Customer getAllCustomers() {
		System.out.println("inside the  get all customers method");
		for (int i = 0; i < cus.length; i++) {
		
		System.out.println(cus[i]);
		}
		
		return null;
	}
  	@Override
	public Customer getCustomerById(int id) {
		System.out.println("inside the udate method");
		for (int i = 0; i < cus.length; i++) {
			if(cus[i].getCusId() == id) {
			System.out.println(cus[i]);	
			}
			else {
				throw new CustomerNotFoundException();
			}
					}
		return null;
	}
	
	

	

}
