package com.xworkz.app;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Read {

	
	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection co = DriverManager.getConnection("jdbc:mysql://localhost:3306/clothshop", "root", "Xworkzodc@123");
			Statement st = co.createStatement();
			ResultSet u = st.executeQuery("select * from blinkit");
			
			while(u.next()) {
				System.out.println(u.getInt(1) + " " + u.getString(2) + " "+ u.getInt(3) + " "+ u.getString(4));
			}
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
