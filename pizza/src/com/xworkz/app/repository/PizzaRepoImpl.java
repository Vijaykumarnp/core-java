package com.xworkz.app.repository;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;

import com.xworkz.app.dto.PizzaDTO;

public class PizzaRepoImpl implements PizzaRepo{

	@Override
	public boolean onSave(PizzaDTO dto) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc", "root", "Xworkzodc@123");
			PreparedStatement pr = con.prepareStatement("insert into pizza values(?,?,?,?,?)");
			
			pr.setInt(1, dto.getId());
			pr.setString(2, dto.getName());
             pr.setInt(3, dto.getPrize());
             pr.setString(4 , dto.getSize());
             pr.setString(5, dto.getStoreName());
             
             int i = pr.executeUpdate();
             
             if(i != 0) {
            	 System.out.println("data saved");
             }
             else {
            	 System.out.println("data not saved");
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
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc", "root", "Xworkzodc@123");
			Statement st = con.createStatement();
			int i = st.executeUpdate("update pizza set p_name = 'pizza hut' where id = 1");
			if(i !=0) {
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
	public boolean onDelete(String size) {
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc", "root", "Xworkzodc@123");
			Statement st = con.createStatement();
			int i = st.executeUpdate("delete from pizza where size= size");
			if(i != 0) {
				System.out.println("deleted");
			}else {
				System.out.println("not deleted");
			}
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		return true;
	}

	
	
	
}
