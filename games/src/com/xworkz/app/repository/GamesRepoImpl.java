package com.xworkz.app.repository;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import javax.validation.ValidatorFactory;

import com.xworkz.app.dto.GamesDTO;

public class GamesRepoImpl implements GamesRepository {

	@Override
	public boolean onSave(GamesDTO dto) {
		System.out.println("inside the onSave methpod");
		
	try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		Connection co = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc", "root", "Xworkzodc@123");
		
		PreparedStatement st =  co.prepareStatement("insert into games values(? ,? , ? , ? , ?)");
				
				
				
				st.setInt(1, dto.getId());
				st.setString(2, dto.getName());
				st.setInt(3, dto.getSize());
				st.setString(4, dto.getLanguage());
				st.setString(5, dto.getGameType());
				
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
