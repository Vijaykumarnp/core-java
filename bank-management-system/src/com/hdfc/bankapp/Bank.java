package com.hdfc.bankapp;

public class Bank {
Custmer cust[] ;
int index;

public Bank(int size) {
	System.out.println("the object is created");
	cust = new Custmer[size];
}

public String toCreate(Custmer custy) {
	System.out.println("createing the account ");
	if(custy.name != null) {
		this.cust[index++] = custy;
		System.out.println("account created");
		
	}
	return null;
	
}

public String getDetailsofCustemer() {
	for(int i=0 ; i<cust.length ; i++) {
		System.out.println(cust[i].name + " " + cust[i].age + " "+ cust[i].phoneNo + " " +cust[i].nationality  );
		
		
	}
	return null;	
}

public Custmer getDetailsByName(String name) {
	System.out.println("inside the getDetails method");
	
	for(int i=0 ; i<cust.length ; i++) {
		if(cust[i].name == name) {
			System.out.println("the name is matched proceed data");
			System.out.println(cust[i].name + " " + cust[i].age + " "+ cust[i].phoneNo + " " +cust[i].nationality  );
			
		}
		
	}
	return null;
	
}

public Custmer updateNamebyage(String newName , int age) {
	System.out.println("inside the update name method");
	for(int i=0 ; i<cust.length ; i++) {
		if(cust[i].age == age) {
			System.out.println("the current name " +cust[i].name);
			cust[i].name = newName ;
			System.out.println("the udated name is " +cust[i].name);
		}
		
	}
	
	
	return null;
	
}
public Custmer updateageByName(int newAge ,String name) {
	System.out.println("inside the updateage method");
	for(int i = 0 ; i<cust.length ; i++) {
		if(cust[i].name == name) {
			System.out.println("the current age is " + cust[i].age);
			cust[i].age = newAge ;
			System.out.println("the updated age is " + cust[i].age);
		}
		
		
	}
	return null;
}


}
