package com.xworkz.manager;



import com.xworkz.manager.manager.Manager;//FQCN - fully qualified class name or qualified name ---- it is combination of pacaakege + class name
import com.xworkz.manager.showroom.ShowRoom;
import java.util.Scanner;


public class ShowRoomTester {
	
	

	public static void main(String[] args) {
		
		//scanner will created only once
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter the size of an array");
		int size = scanner.nextInt();
		ShowRoom room = new ShowRoom(size);
		for(int i=0 ; i<size ; i++) {
		
		System.out.println("enter manager name");
		String name = scanner.next();
		System.out.println("enter the age of the manager");
		int age =scanner.nextInt();
		System.out.println("enter the qualification");
		String qualification = scanner.next();
		System.out.println("enter the contact number");
		long contactNO=scanner.nextLong();
		
		
		Manager mag = new Manager(name,age,qualification,contactNO);
		room.saveManager(mag);
		}
		room.getManager();
		try {
		System.out.println("enter the qualification to fetch details of manager ");
		room.getQualification(scanner.next());
		}catch(MangerNotFoundException k) {
			k.printStackTrace();
		}
		System.out.println("main ended");
	}
}

