package com.xworkz.theaterapp.screen;

import java.util.Scanner;

public class ScreenTester {

	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Screen scrr = new Screen();
		System.out.println("enter the screen name");
		scrr.setScreenName(sc.next());
		System.out.println("enter the screen type");
		scrr.setScreenType(sc.next());
		System.out.println("enter the screen size");
		scrr.setScreenSize(sc.nextInt());
		System.out.println(scrr[i] );
		
	}
}
