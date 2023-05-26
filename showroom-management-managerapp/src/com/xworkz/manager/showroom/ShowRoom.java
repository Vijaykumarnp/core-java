package com.xworkz.manager.showroom;

import com.xworkz.manager.MangerNotFoundException;
import com.xworkz.manager.manager.Manager;

public class ShowRoom {

	Manager manager [] ;// the size is the major draw back of array
	int index;
	//scanner is object in which by this we can provide the data at run time 
	
	public ShowRoom(int size){
		System.out.println("the object show room is created");
		manager= new Manager[size];
	}
	
	public String saveManager(Manager manager) {
		System.out.println("inside the savemanager method ");
		boolean isSaved = false;
		if(manager.getName() != null ) {
			//getting first manager to the array
			// class in only on compile time after comiple it it is an object(in run time )
			// scanner is available in java.ulti class
			// scanner is a class a compile time 
			this.manager[index++] = manager ;
			isSaved =  true ;
		}
		return null;
		
	}
	
	public void getManager() {
		System.out.println("inside the get manager method");
		for(int i=0 ; i<manager.length ; i++) {
System.out.println(manager[i].getName() + " " + manager[i].getAge() + " "
		+ manager[i].getQualification()+ " "+ manager[i].getContactNo() );
		}
		
	}
	
	public Manager getQualification(String qualification) throws MangerNotFoundException {
		System.out.println("inside the qualifiction method");
		for(int i=0 ; i<manager.length ; i++) {
			if(manager[i].getQualification() == qualification) { // === this is not in the java 
				System.out.println("the qualifiacation is matched proceed data");
				System.out.println(manager[i].getName() + " " + manager[i].getAge() + " " + manager[i].getContactNo() + " "+ manager[i].getQualification());
			}
			else {
				throw new MangerNotFoundException("Manager not found in a given qualification");
			}
			
			
			
		}
		return null ; 	
	}
	
	public boolean updateNameByqualification(String newName , String qualification) {
		System.out.println("inside the update method ");
		for(int i=0 ; i<manager.length ; i++) {
			if(manager[i].getQualification() == qualification) {
				System.out.println("the current name is " + manager[i].getName());
			manager[i].setName(newName);
				System.out.println("the updated name is " + manager[i].getName());
			}
			
		}
		return false;
	}
	
	
	public String updateContactNobyName(long newcontactNo , String name) {  
		System.out.println("inside the update contact method ");
		for(int i= 0 ; i<manager.length ; i++) {
			if(manager[i].getName() == name) {
				System.out.println("the current contact nukmber is " + manager[i].getName());
			 // manager[i].getContactNo() = newcontactNo;	
				System.out.println("");
			}
			
		}
		return null;
	}
}
