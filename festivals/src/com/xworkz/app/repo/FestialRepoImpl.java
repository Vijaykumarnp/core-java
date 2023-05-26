package com.xworkz.app.repo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;

import com.xworkz.app.dto.FestivalDTO;

public class FestialRepoImpl implements FestivalRepository {

	@Override
	public boolean onSave(FestivalDTO dto) {
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc", "root", "Xworkzodc@123");
			PreparedStatement st = con.prepareStatement("insert into festival values(?,?,?,?,?)");
			st.setInt(1, dto.getId());
			st.setString(2, dto.getFestname());
			st.setString(5, dto.getFoodType());
			st.setString(3 , dto.getReligion());
			st.setString(4, dto.getSweet());
			
			
			
			int i = st.executeUpdate();
			
			if(i != 0) {
				System.out.println("data is added");
			}else {
				System.out.println("data not added");
			}
			
			
			
			
			
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
		return true;
	}

	@Override
	public boolean onUpdate(String festName , int id ) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc", "root", "Xworkzodc@123");
			PreparedStatement st = con.prepareStatement("update festival set f_name = ? where id =?");
			st.setString(1, festName);
			st.setInt(2, id);
			int i = st.executeUpdate();
			
			if(i != 0) {
				System.out.println("updated");
			}else {
				System.out.println("not updated");
			}
			
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		return true;
	}

	@Override
	public boolean onDelete(int id) {
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc", "root", "Xworkzodc@123");
			PreparedStatement st = con.prepareStatement("delete from festival where id = ?");
			st.setInt(1, id);
			int i = st.executeUpdate();
			
			
			
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		return true;
	}

}
