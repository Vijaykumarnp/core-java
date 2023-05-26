package  com.xworkz.manager;
import java.util.Scanner;

import com.xworkz.manager.manager.Manager;
;




public class ManagerTester {

	
	
	public static void main(String[] args) {
		
		
		
		Scanner scanner =  new Scanner(System.in);
		
		Manager manager  = new Manager();
		System.out.println("enter the manager name");
		String name = scanner.next();
		manager.setName(name);
		System.out.println("enter the manager age");
		manager.setAge(scanner.nextInt());
		System.out.println("enter  the qualification");
		manager.setQualification(scanner.next());
		System.out.println("enter the contacatno");
		manager.setContactNo(scanner.nextLong());
		System.out.println(manager.getName() + " " + manager.getAge() + " " + manager.getQualification() + " "+ manager.getContactNo());
		
	
	}
}
