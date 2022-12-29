
public class CityTester {

	
	public static void main(String a[]) {
		City city = new City();
		Area area = new Area("Rajajinagar" , "100/sqft" , 20000);
		
		city.addArea(area);
		city.getAreaDetails();
	}
	
	
}
