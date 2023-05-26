package com.xworkz.application.trends;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Update {

	
	
	public static void main(String[] args) {
		
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection co = DriverManager.getConnection("jdbc:mysql://localhost:3306/clothshop", "root", "Xworkzodc@123");
			Statement st = co.createStatement();
			int i = st.executeUpdate("update  trendss set  no_of_floors = 6 where id = 1");
			
			if(i != 0 ) {
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
