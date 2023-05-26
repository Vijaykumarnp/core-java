package com.xworkz.bunkapp;

import java.util.Scanner;

import com.xworkz.bunkapp.bunk.Bunk;
import com.xworkz.bunkapp.worker.Worker;

public class BunkTester {

	public BunkTester() {


	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the size of the array");
		int size =  sc.nextInt();
		Bunk bunk = new Bunk(size);
		for (int i = 0; i < size; i++) {
			Worker work = new Worker();
			System.out.println("enter the name of worker");
			work.setName(sc.next());
			System.out.println("enter the age of the worker");
			work.setAge(sc.nextInt());
			System.out.println("enter the contact number of worker");
			work.setContactNo(sc.nextLong());
			System.out.println("enter the gender of worker");
			work.setGender(sc.next());
			
			bunk.addWorker(work);
	
		}
		System.out.println("enter 1 to get the all boys of bunk");
		System.out.println("enter 2 to get details  by name");
		System.out.println("enter 3 to update the name with refrence of age");
		int option = sc.nextInt();
		
		switch(option) {
		case 1 : bunk.getWorker();
		break;
		
		case 2 : System.out.println("enter the name to get the details ");
		         bunk.getWorkerByName(sc.next());
		         break;
		         
		  case 3 : System.out.println("enter update name ");
		           System.out.println("enter the refrence age");
		           bunk.updateWorkerNameByAge(sc.next(), sc.nextInt());
		  
	}
	}
	
	
	
	
}
