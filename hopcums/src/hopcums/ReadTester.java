package hopcums;

import java.sql.Connection;

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ReadTester {

	
	public static void main(String[] args)  {
		
		try {
		     // Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/clothshop", "root", "Xworkzodc@123");
			Class.forName("com.mysql.cj.jdbc.Driver");
		
		      Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/clothshop", "root", "Xworkzodc@123");
			String query = "select * from hopcums ";
           Statement state= conn.createStatement();
      ResultSet se  = state.executeQuery(query);
      
           
           while(se.next()) {
        	   System.out.println(se.getInt(1) + " "+ se.getString(2) + " "+ se.getInt(3) + " "+ se.getString(4));
        	   
        	   
           }
		
			} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
			
	}
	
	
	
	
}
