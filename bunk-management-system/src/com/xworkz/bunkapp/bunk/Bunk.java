package com.xworkz.bunkapp.bunk;

import com.xworkz.bunkapp.worker.Worker;

public class Bunk {

	
	Worker work[];
	int ind;
	
	public Bunk(int size) {
		System.out.println("the objrct bunk is created");
         work = new Worker[size];
	}
	
	public Bunk() {
		// TODO Auto-generated constructor stub
	}


	public void addWorker(Worker works) {
		if(works.getName() !=  null) {
			this.work[ind++] = works;
			
		}
	}
		
		public String getWorker() {
			for (int i = 0; i < work.length; i++) {
				System.out.println(work[i].getName() + " " +work[i].getAge() + " "+ work[i].getGender() + " "+ work[i].getContactNo ());
			}
			return null;
		}
		
		public Worker getWorkerByName(String name) {
			System.out.println("inside the  getWorkerByName");
			for (int i = 0; i < work.length; i++) {
				
			
			if(work[i].getName() .equals(name) ) {
				System.out.println(work[i].getName() + " " +work[i].getAge() + " "+ work[i].getGender() + " "+ work[i].getContactNo ());
			
			}
			
		}
			return null;
		
		}
		
		public Worker updateWorkerNameByAge(String newName , int age) {
			System.out.println("inside the update worker name by age method");
			for (int i = 0; i < work.length; i++) {
				if(work[i].getAge() == age) {
					System.out.println("the current name is " + work[i].getName());
					 work[i].setName(newName);
					 System.out.println("the updated name is " + work[i].getName());
				}
				
				
				
			}
			return null;
			
			
			
		}
		
		
		
	}
	

