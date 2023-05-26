package com.xworkz.app.repository;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import com.xworkz.app.dto.NinjaDTO;

public class NinjaRepoImpl implements NinjaRepo {

	@Override
	public boolean onSave(NinjaDTO dto) {
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			Connection co = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc", "root", "Xworkzodc@123");
			
			PreparedStatement st =  co.prepareStatement("insert into ninja values(? ,? , ? )");
				st.setInt(1, dto.getId());
				st.setString(2, dto.getPlatForm());
				st.setInt(3, dto.getSize());
					
					
					
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

	@Override
	public boolean onUpdate(String platForm , int id) {
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			Connection co = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc", "root", "Xworkzodc@123");
			PreparedStatement st = co.prepareStatement("update ninja set platForm=platForm where id = id");
			
			st.setString(1, platForm);
			st.setInt(2, id);
			int i = st.executeUpdate();
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		return true;
	}

	@Override
	public boolean onRead() {
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection co = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc", "root", "Xworkzodc@123");
			PreparedStatement st = co.prepareStatement("select*from ninja");
			int i = st.executeUpdate();
			
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		
		
		
		return true;
	}

	@Override
	public boolean onDelete() {
		// TODO Auto-generated method stub
		return false;
	}

}
