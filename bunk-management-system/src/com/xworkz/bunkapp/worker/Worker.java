package com.xworkz.bunkapp.worker;

public class Worker {

	
	private String name;
	private int age;
	private String gender;
	private long contactNo;
	
	public Worker(String name , int age , String gender , long contactNo ) {
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.contactNo = contactNo;
	}
	
	
	

	public Worker(int size) {
		// TODO Auto-generated constructor stub
	}


	public  Worker() {
		// TODO Auto-generated constructor stub
	}




	public void setName(String name) {
		this.name =name;
		
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
	
	public void setGender(String gender) {
		this.gender = gender;
	}
	
	public String getGender() {
		return gender;
		
	}
	
	public void setContactNo(long contactNo) {
		
	this.contactNo = contactNo;
	}
	
	public long getContactNo() {
		return contactNo;
	}
	
	
	
	
}
