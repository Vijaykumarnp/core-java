package com.xworkz.application.bhavana;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.xworkz.application.subhash.SubhashDTO;

public class Read {

	
	
	

	public static void main(String[] args) {
		
		try {
			SubhashDTO l = new SubhashDTO();
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection co= DriverManager.getConnection("jdbc:mysql://localhost:3306/octoberbatch", "root", "Xworkzodc@123");
			String quer = "insert into bhavana values(?,?,?,?)";
			
			PreparedStatement sta = co.prepareStatement(quer);
					
		ResultSet s= sta.executeQuery("select*from  bhavana");
		
		while(s.next()) {
			System.out.println(s.getInt(1) + " "+ s.getString(2) + " " + s.getString(3) + " "+ s.getLong(4));
		}
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
}
