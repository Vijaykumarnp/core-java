package com.xworkz.application.trends;

import java.sql.Connection;

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import com.mysql.cj.xdevapi.Result;

public class Read {

	
	public static void main(String[] args) {
		
		try {
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connec =  DriverManager. getConnection("jdbc:mysql://localhost:3306/clothshop", "root", "Xworkzodc@123");
			String query = "select*from trendss";
			Statement state = connec.createStatement();
			ResultSet result = state.executeQuery(query);
			System.out.println("fetching the data");
			while(result.next()) {
				System.out.println("id :" +result.getInt(1) + " " +  " location :" +result.getString(2)
				+ " "+    "Nofloors :" +result.getInt(3)  +" "+ "type of clothes :" + result.getString(4));
}
			
		}catch(Exception f ) {
			f.printStackTrace();
		}
	}
	
	
}
