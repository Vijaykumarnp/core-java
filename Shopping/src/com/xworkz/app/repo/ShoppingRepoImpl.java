package com.xworkz.app.repo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.mysql.cj.xdevapi.Result;
import com.xworkz.app.dto.ShoppingDTO;

public class ShoppingRepoImpl implements ShoppingRepo{

	@Override
	public boolean onSave(ShoppingDTO dto) {
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc", "root", "Xworkzodc@123");
			PreparedStatement st = con.prepareStatement("insert into shopping values(?,?,?,?,?)");
			  st.setInt(1, dto.getId());
			  st.setString(2, dto.getName());
			  st.setString(3, dto.getEmail());
			  st.setString(4, dto.getLocation());
			  st.setLong(5, dto.getIncome());
			  
			  int i = st.executeUpdate();
			  if(i != 0) {
				  System.out.println("data is added");
			  }else {
				  System.out.println("daata is not added");
			  }
			
			
			
			
			
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
		return true;
	}

	@Override
	public boolean onReadByEmail(String email) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc", "root", "Xworkzodc@123");
			PreparedStatement st = con.prepareStatement("select*from shopping where email = ?");
			 st.setString(1, email);
			  ResultSet s = st.executeQuery();
			  while(s.next()) {
				  
				 
				  
				  System.out.println("Id" +s.getInt(1) + "Name" +s.getString(2) + "Email" + s.getString(3) + "Location" + s.getString(4) + "Income" + s.getLong(5));
			  }
			
			  
			
			
			
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		

		return true;
	}

	@Override
	public boolean onReadByName(String name) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc", "root", "Xworkzodc@123");
			PreparedStatement st = con.prepareStatement("select*from shopping where name_ = ?");
			 st.setString(1, name);
			  ResultSet s = st.executeQuery();
			  while(s.next()) {
				  
				 
				  
				  System.out.println("Id" +s.getInt(1) + "Name" +s.getString(2) + "Email" + s.getString(3) + "Location" + s.getString(4) + "Income" + s.getLong(5));
			  }
			
			  
			
			
			
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return true;
	}

	@Override
	public boolean readAll() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc", "root", "Xworkzodc@123");
			PreparedStatement st = con.prepareStatement("select*from shopping ");
			 
			  ResultSet s = st.executeQuery();
			  while(s.next()) {
				  
				 
				  
				  System.out.println("Id" +s.getInt(1) + "Name" +s.getString(2) + "Email" + s.getString(3) + "Location" + s.getString(4) + "Income" + s.getLong(5));
			  }
			
			  
			
			
			
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
		return true;
	}

	@Override
	public boolean onUpdateById(String name, int id) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc", "root", "Xworkzodc@123");
			PreparedStatement st = con.prepareStatement("update shopping set name = ?  where id = ?");
			 st.setString(1, name);
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
	public boolean onUpdateByName(String location, String name) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc", "root", "Xworkzodc@123");
			PreparedStatement st = con.prepareStatement("update shopping set location = ?  where name = ?");
			 st.setString(1, location);
			 st.setString(2, name);
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
	public boolean onUpdateByEmail(String name, String email) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc", "root", "Xworkzodc@123");
			PreparedStatement st = con.prepareStatement("update  shopping set name_= ?  where email = ?");
			 st.setString(1, name);
			 st.setString(2, email);
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
	public boolean onDeleteById(int id) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc", "root", "Xworkzodc@123");
			PreparedStatement st = con.prepareStatement("delete from shopping where id = ?");
			 st.setInt(1, id);
			
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
	public boolean onDeleteByEmail(String email) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc", "root", "Xworkzodc@123");
			PreparedStatement st = con.prepareStatement("delete from shopping where email = ?");
			 st.setString(1, email);
			
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

}
