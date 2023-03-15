package com.xworkz.application.bhavana;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import com.xworkz.application.subhash.SubhashDTO;

public class Insert {

	public static void main(String[] args) {
		
		

		try {
			BhavanaDTO l = new BhavanaDTO(1 , "banglore " , "Be" , 73827291l);
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection co= DriverManager.getConnection("jdbc:mysql://localhost:3306/octoberbatch", "root", "Xworkzodc@123");
			String quer = "insert into bhavana values(?,?,?,?)";
			
			PreparedStatement sta = co.prepareStatement(quer);
		sta.setInt(1, l.getId());
		sta.setString(2, l.getLocation());
		sta.setString(3 ,l.getQualification());
		sta.setLong(4, l.getContactNo());
			
		int i = sta.executeUpdate();
		
		if(i != 0) {
			System.out.println("insertion is done");
		}else {
			System.out.println("not done");
		}
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	




		
		
		
	}
	
	

