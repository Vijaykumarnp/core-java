import com.xworkz.airportapp.airport.Airport;
import com.xworkz.airportapp.terminal.Terminal;

public class AirportTester {
public static void main(String a[]) {
	Airport air = new Airport();
	
	Terminal ter = new Terminal("fin" , 5 , "domastic");
	air.addTerminals(ter);
	Terminal ter1 = new Terminal("fifa" , 10 , "internaltional");
	air.addTerminals(ter1);
	Terminal ter2 = new Terminal("Fed" , 15 , "National");
	air.addTerminals(ter2);
	air.getTerminal();
	//air.getTerminalByName("fifa");
	air.updateTerminalnameBysize("fitch", 5);
}
}
