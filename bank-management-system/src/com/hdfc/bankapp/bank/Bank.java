package com.hdfc.bankapp.bank;

import com.hdfc.bankapp.custmer.Custmer;

abstract  class Bank   {
Custmer cust[] ;
int index;
 
public Bank(int size) {
	System.out.println("the object is created");
	cust = new Custmer[size];
}
public Bank() {
	// TODO Auto-generated constructor stub
}

public String toCreate(Custmer cust) {
	System.out.println("createing the account ");
	if(cust.getName() != null) {
		this.cust[index++] = cust;
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
		if(cust[i].getName() .equals(name) ){
			System.out.println("the name is matched proceed data");
			System.out.println(cust[i].getName() + " " + cust[i].getAge() + " "+ cust[i].getPhoneNo() + " " +cust[i].getNationality()  );
			
		}
		
	}
	return null;
	
}


public Custmer updateNamebyAge(String newName , int age) {
	System.out.println("inside the update nam by  age method");
	for (int i = 0; i < cust.length; i++) {
		if(cust[i].getAge() == age) {
			System.out.println("the current name is" + cust[i].getName());
			cust[i].setName(newName);
			System.out.println("the updated age is " + cust[i].getName());
			
		}
		
	}
	return null;

}

public Custmer updateContactNobyName(String name , long newPhoneNo) {
	System.out.println("inside the update contact no by name method");
	for (int i = 0; i < cust.length; i++) {
		if(cust[i].getName().equals(name)) {
			System.out.println("the current number  is " + cust[i].getPhoneNo());
			cust[i].setPhoneNo(newPhoneNo);
			System.out.println("the updated name is " + cust[i].getPhoneNo());
		}
		
		
		
	}
	return null;
	
	
}



public Custmer updateNationalityByname(String newNationality , String name) {
	System.out.println("inside the update nationality method");
	for (int i = 0; i < cust.length; i++) {
		if(cust[i].getName() .equals(name)) {
			System.out.println("the current nationality is" +cust[i].getNationality());
			cust[i].setNationality(newNationality);
			System.out.println("the updated name is " + cust[i].getNationality());
			
			
		}
	}
	return null;
	
	
}







}

