package com.xworkz.cityapp.city;

import com.xworkz.cityapp.area.Area;

public class City {
Area area[];
int ind;


public City(int sizee) {
	System.out.println("the object city is created");
	area = new Area[sizee];
}
public void addArea(Area area2) {
	System.out.println("adding area to city");
	if(area2.name != null ) {
		this.area[ind++] = area2 ;
		System.out.println("the area is added");
		
	}
	
}

public void getAreaDetails() {
	for(int i=0 ; i<area.length ; i++) {
		System.out.println(area[i].name + " "+ area[i].population + " " +area[i].size);
	}
	
	
}



}
