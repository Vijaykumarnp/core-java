package com.xworkz.manager.showroom;

import com.xworkz.manager.manager.Manager;

public class ShowRoom {

	Manager manager [] = new Manager[2];
	int index;
	
	
	public ShowRoom(){
		System.out.println("the object show room is created");
	}
	
	public String saveManager(Manager manager) {
		System.out.println("inside the savemanager method ");
		boolean isSaved = false;
		if(manager.name != null ) {
			//getting first manager to the array
			this.manager[index++] = manager ;
			isSaved =  true ;
		}
		return null;
		
	}
	
	public void getManager() {
		System.out.println("inside the get manager method");
		for(int i=0 ; i<manager.length ; i++) {
			System.out.println(manager[i].name + " " + manager[i].age + " " + manager[i].contactNo + " "+ manager[i].qualification);
		}
		
	}
	
	public Manager getQualification(String qualification) {
		System.out.println("inside the qualifiction method");
		for(int i=0 ; i<manager.length ; i++) {
			if(manager[i].qualification == qualification) {
				System.out.println("the qualifiacation is matched proceed data");
				System.out.println(manager[i].name + " " + manager[i].age + " " + manager[i].contactNo + " "+ manager[i].qualification);
			}
			
			
			
		}
		return null ; 	
	}
	
	public Manager updateNameByqualification(String newName , String qualification) {
		System.out.println("inside the update method ");
		for(int i=0 ; i<manager.length ; i++) {
			if(manager[i].qualification == qualification) {
				System.out.println("the current name is " + manager[i].name);
				manager[i].name = newName;
				System.out.println("the updated name is " + manager[i].name);
			}
		}
		return null;
	}
	
	
	
}
