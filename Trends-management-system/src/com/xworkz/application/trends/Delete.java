package com.xworkz.application.trends;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Delete {

	
	
	
	
	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/clothshop", "root", "Xworkzodc@123");
			Statement dy = con.createStatement();
			int i = dy.executeUpdate("delete from  trendss where id =1");
			
			if(i != 0) {
				System.out.println("deleted");
			}else {
				System.out.println("not deleted");
			}
			
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
		
		
		
	}
	
}
