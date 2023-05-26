package hopcums;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class InsertionTester {

	public static void main(String[] args) {
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/clothshop", "root", "Xworkzodc@123");
			Statement st = con.createStatement();
			String q = "insert into hopcums values(2 , 'jayanagr' , 3 ,'fruits & vegetables')";
			int i = st.executeUpdate(q);
			
		    if(i != 0) {
		    	System.out.println("data inserted");
		    }else {
		    	System.out.println("data not inserted");
		    }
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
		
	}
	
	
	
	
}
