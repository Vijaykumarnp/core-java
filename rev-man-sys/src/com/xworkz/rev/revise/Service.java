package com.xworkz.rev.revise;

import java.util.Scanner;

public class Service {

	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the size");
		int size = sc.nextInt();
		
		
		for (int i = 0; i < size; i++) {
			Repo is =  new RepoImpl();
			Employe f = new Employe();
			System.out.println("enter id ");
		   f.setId(sc.nextInt());
			System.out.println("enter name");
			f.setName(sc.next());
			
		}
		
		
		
		
	}
	
}
