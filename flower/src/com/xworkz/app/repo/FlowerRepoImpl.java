package com.xworkz.app.repo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;

import com.xworkz.app.dto.FlowerDTO;

public class FlowerRepoImpl implements FlowerRepo{

	@Override
	public boolean onSave(FlowerDTO dto) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc", "root", "Xworkzodc@123");
			PreparedStatement pr  = con.prepareStatement("insert into flower values(?,?,?,?,?)");
			
			pr.setInt(1, dto.getId());
			pr.setString(2, dto.getName());
			pr.setInt(3, dto.getPrice());
			pr.setString(4, dto.getUse());
			pr.setString(5, dto.getSeanson());
			
			int i =  pr.executeUpdate();
			if(i != 0) {
				System.out.println("data is added");
			}else {
				System.out.println("data is not added");
			}
			
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		return true;
	}

	@Override
	public boolean onUpdate(int id) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con =  DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc", "root", "Xworkzodc@123");
			Statement st = con.createStatement();
			int i = st.executeUpdate("update flower set season = 'mansoon' where id =  4");
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
	public boolean onDelete(String season) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con =  DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc", "root", "Xworkzodc@123");
			Statement st = con.createStatement();
			int i = st.executeUpdate("delete from flower where season=  'mansoon'");
			if(i != 0) {
				System.out.println("deleted");
			}else {
				System.out.println("not deletd");
			}
			
			
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		return true;
	}

}
