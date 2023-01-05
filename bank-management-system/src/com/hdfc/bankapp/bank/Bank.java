package com.hdfc.bankapp.bank;

import com.hdfc.bankapp.custmer.Custmer;

public class Bank {
Custmer cust[] ;
int index;

public Bank(int size) {
	System.out.println("the object is created");
	cust = new Custmer[size];
}

public String toCreate(Custmer custy) {
	System.out.println("createing the account ");
	if(custy.getName() != null) {
		this.cust[index++] = custy;
		System.out.println("account created");
		
	}
	return null;
	
}

public String getDetailsofCustemer() {
	for(int i=0 ; i<cust.length ; i++) {
		System.out.println(cust[i].getName() + " " + cust[i].getAge() + " "+ cust[i].getPhoneNo() + " " +cust[i].getNationality()  );
		
		
	}
	return null;	
}

public Custmer getDetailsByName(String name) {
	System.out.println("inside the getDetails method");
	
	for(int i=0 ; i<cust.length ; i++) {
		if(cust[i].getName() == name) {
			System.out.println("the name is matched proceed data");
			System.out.println(cust[i].getName() + " " + cust[i].getAge() + " "+ cust[i].getPhoneNo() + " " +cust[i].getNationality()  );
			
		}
		
	}
	return null;
	
}
}

