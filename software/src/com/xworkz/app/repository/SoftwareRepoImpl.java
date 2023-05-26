package com.xworkz.app.repository;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.xworkz.app.dto.SoftwareDTO;

public class SoftwareRepoImpl implements SoftwareRepo{

	
	public SoftwareRepoImpl() {
		System.out.println("SoftwareRepoImpl class");
	}
	
	
	


	@Override
	public boolean onSave(SoftwareDTO dto) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		
			
			Connection 	con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc", "root", "Xworkzodc@123");
			
			
			PreparedStatement st = con.prepareStatement("insert into software values(? ,? , ? , ? , ?)");
			
			st.setInt(1, dto.getId());
			st.setString(2, dto.getName());
			st.setString(3, dto.getUse());
			st.setInt(4, dto.getSize());
			st.setDouble(5, dto.getCurrentVersion());
			int i = st.executeUpdate();
			
			if(i!=0) {
				System.out.println("added");
			}else {
				System.out.println("not added");
			}
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return true;
	}

}
