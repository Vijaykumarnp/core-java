package com.xworkz.application.navya;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Read {

	
	
	public static void main(String[] args) {
		
		try {
			NavyaDTo l = new NavyaDTo();
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection co= DriverManager.getConnection("jdbc:mysql://localhost:3306/octoberbatch", "root", "Xworkzodc@123");
			String quer = "select*from navya";
			
			PreparedStatement sta = co.prepareStatement(quer);
					
		ResultSet s= sta.executeQuery();
		
		while(s.next()) {
			System.out.println(s.getInt(1) + " "+ s.getString(2) + " " + s.getString(3) + " "+ s.getLong(4));
		}
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}
