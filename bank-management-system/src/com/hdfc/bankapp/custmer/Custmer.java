package com.hdfc.bankapp.custmer;

public class Custmer {

	public String name;
	public  int age;
	public long phoneNo;
	public String nationality;
	
	public Custmer(String name , int age , long phoneNo , String nationality) {
		this.name = name;
		this.age = age;
		this.phoneNo = phoneNo;
		this.nationality = nationality;
		
	}
	
	public Custmer() {
		// TODO Auto-generated constructor stub
	}

	

	public void setName(String name) {
		this.name = name;
	} 
	
	public String getName() {
		return name;
		
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	public int getAge() {
		return age;
	}
	
	public void setPhoneNo(long phoneNo ) {
		this.phoneNo = phoneNo;
	}
	
	public long getPhoneNo() {
		return phoneNo;
	}
	
	public void setNationality(String nationality) {
		this.nationality= nationality;
	}
	
	public String getNationality() {
		return nationality;
	}
	
	
	
	
}
