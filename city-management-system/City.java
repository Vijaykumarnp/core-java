
public class City {
Area area[] = new Area[1];
int ind;


public City() {
	System.out.println("the object city is created");
	
}
public void addArea(Area area) {
	System.out.println("adding area to city");
	if(area.name != null ) {
		this.area[ind++] = area ;
		System.out.println("the area is added");
		
	}
	
}

public void getAreaDetails() {
	for(int i=0 ; i<area.length ; i++) {
		System.out.println(area[i].name + " "+ area[i].population + " " +area[i].size);
	}
	
	
}



}
