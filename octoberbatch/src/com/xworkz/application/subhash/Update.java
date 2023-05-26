package com.xworkz.application.subhash;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import com.xworkz.application.likith.LikithDTO;

public class Update {

	
	public static void main(String[] args) {
		
	
	try {
		SubhashDTO l = new SubhashDTO();
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection co= DriverManager.getConnection("jdbc:mysql://localhost:3306/octoberbatch", "root", "Xworkzodc@123");
		String quer = "update likith set location = 'bng' where id = 1";
		
		PreparedStatement sta = co.prepareStatement(quer);
	sta.setInt(1, l.getId());
	sta.setString(2, l.getLocation());
	sta.setString(3 ,l.getQualification());
	sta.setLong(4, l.getContactNo());
		
	int i = sta.executeUpdate();
	
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
