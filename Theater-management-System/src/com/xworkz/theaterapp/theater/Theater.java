package com.xworkz.theaterapp.theater;

import com.xworkz.theaterapp.screen.Screen;

public class Theater {

	Screen screen[] ;
	int ind;
	
	public Theater() {
		// TODO Auto-generated constructor stub
	}
	
	public Theater(int size) {	
		System.out.println("the theater object is created");
		screen = new Screen[size];
	}
	
	public String  addScreen(Screen screen) {
		if(screen.getScreenName() != null && screen.getScreenType() !=null ) {
			this.screen[ind++]= screen; 
		}
		return null;
	}
	public void  getScreen() {
		for(int i=0 ; i<screen.length ; i++) {
			System.out.println(screen[i].getScreenName() + " " + screen[i].getScreenType() + " " + screen[i].getScreenName() );
			
		}
		
		
	}
	
	
	
	public String getScreenByName(String screenName) {
		for (int i = 0; i < screen.length; i++) {
			
		
		screen[i].setScreenName(screenName) ;
		System.out.println(screen[i].getScreenName() + " " + screen[i].getScreenType() + " " + screen[i].getScreenName() );
		
		}
		return null;
	}
	
	
}
