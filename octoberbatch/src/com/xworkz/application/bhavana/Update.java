package com.xworkz.application.bhavana;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import com.xworkz.application.subhash.SubhashDTO;

public class Update {

	
	public static void main(String[] args) {
		
		
		

		try {
			BhavanaDTO l = new BhavanaDTO();
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection co= DriverManager.getConnection("jdbc:mysql://localhost:3306/octoberbatch", "root", "Xworkzodc@123");
			String quer = "insert into likith values(?,?,?,?)";
			
			PreparedStatement sta = co.prepareStatement(quer);
		sta.setInt(1, l.getId());
		sta.setString(2, l.getLocation());
		sta.setString(3 ,l.getQualification());
		sta.setLong(4, l.getContactNo());
			
		int i = sta.executeUpdate("update bhavana set location = 'bng' where id = 1");
		
		if(i != 0) {
			System.out.println("update");
		}else {
			System.out.println("not updated");
		}
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
	}
	
}
