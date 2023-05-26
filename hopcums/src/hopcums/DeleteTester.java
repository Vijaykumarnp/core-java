package hopcums;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class DeleteTester {

	public static void main(String[] args) {
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection co= DriverManager.getConnection("jdbc:mysql://localhost:3306/clothshop", "root", "Xworkzodc@123");
			String q = "delete from hopcums where id = 1";
			Statement s = co.createStatement();
			int i = s.executeUpdate(q);
			
			if(i != 0) {
				System.out.println("data deleted");
			}else {
				System.out.println("not deleted");
			}
			
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}
	
	
	
}
