package hopcums;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class UpdateTester {

	
	public static void main(String[] args){
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/clothshop", "root", "Xworkzodc@123");
			String query = "update hopcums set location = 'vijaynagar' where id =1";
			Statement state = con.createStatement();
			int i = state.executeUpdate(query);
			
			if(i != 0) {
				System.out.println("updated");
			}else {
				System.out.println("not updated");
			}
			
			
			
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
		
	}
	
	
	
	
}
