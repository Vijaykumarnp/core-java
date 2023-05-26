package com.hdfc.bankapp.bank;

public class Hdfc extends Bank {

	public Hdfc(int size) {
		super(size);
		// TODO Auto-generated constructor stub
	}
	
	
	public Hdfc() {
		// TODO Auto-generated constructor stub
	}


	boolean accout = true;
	
	public String getDetailsofCustemer() {
		if(accout == true) {
System.out.println("overriding");
			super.getDetailsofCustemer();
		}
		return null;
		
	}
	
	

}
