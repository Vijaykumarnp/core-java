import java.util.Scanner;

import com.xworkz.theaterapp.screen.Screen;
import com.xworkz.theaterapp.theater.Theater;

public class TheaterTester {

	
	public static void main(String a[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the size of the array");
		int size = sc.nextInt();
		Theater thea = new Theater(size);
		
		
		for (int i = 0; i < size; i++) {
			
		
		System.out.println("enter the name of the screen  ");
		String name = sc.next();
		System.out.println("enter the type of the screen");
		String type = sc.next();
		System.out.println("enter the size of the screen");
		int sizee = sc.nextInt();
		Screen scree = new Screen(name , type , sizee);
		thea.addScreen(scree);
		}
		thea.getScreen();
		//thea.getScreenByName("polymer");
		
		
	}
	
	
}
