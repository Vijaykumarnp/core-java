package com.xworkz.application.trends;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Insertion {

public static void main(String[] args) {
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection co = DriverManager.getConnection("jdbc:mysql://localhost:3306/clothshop", "root", "Xworkzodc@123");
			Statement st = co.createStatement();
			int i = st.executeUpdate("insert into blinkit values (2 , 'hassn' , 4 ,'both men & women' )");
			
			if(i != 0 ) {
				System.out.println("data inserted");
			}else {
				System.out.println("not insereted");
			}
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
	}
	
	
}
