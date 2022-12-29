
public class RajajinagarTestre {
public static void main(String a[]) {
	City city = new City();
	Area area = new Area("RajajiNagar" , "100/sqft"  , 6575);
	
	city.addArea(area);
	city.getAreaDetails();
	
}
}
