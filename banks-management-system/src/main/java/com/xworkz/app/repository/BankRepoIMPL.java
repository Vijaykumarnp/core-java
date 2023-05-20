package com.xworkz.app.repository;

import java.sql.Connection;

import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.xworkz.app.dto.CustomerDTO;

@Repository
public class BankRepoIMPL implements BankRepo {

	@Override
	public CustomerDTO createAccount(CustomerDTO dto) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
		     Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc", "root", "Xworkzodc@123");
		     
		     PreparedStatement st = conn.prepareStatement("insert into bank values(?,?,?,?,?)");
		     st.setInt(1, dto.getId());
		     st.setString(2, dto.getCustomerName());
		     st.setString(3, dto.getPhoneNo() );
		     st.setString(4, dto.getAdharNO());
		     st.setString(5, dto.getAdress());
		     
		     int i = st.executeUpdate();
		     if( i != 0 ) {
		    	System.out.println("Account Is Create"); 
		     }else {
		    	 System.out.println("Account is not created");
		     }
		     }catch (Exception e) {
				e.printStackTrace();
			}
		     
		     
		     
		return null;
	}

	@Override
	public List<CustomerDTO> getAllCustomers() {
		System.out.println("get all customers repo");
	List<CustomerDTO> list = new ArrayList<CustomerDTO>();
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
		     Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc", "root", "Xworkzodc@123");
		     
		     PreparedStatement st = conn.prepareStatement("select*from bank");
		     ResultSet j =  st.executeQuery();
		     
		     while (j.next()) {
				CustomerDTO dto = new CustomerDTO();
				dto.setId(j.getInt(1));
				dto.setCustomerName(j.getString(2));
				dto.setPhoneNo(j.getString(3));
				dto.setAdharNO(j.getString(4));
				dto.setAdress(j.getString(5));
				list.add(dto);
			}
		}catch (Exception e) {
				e.printStackTrace();
			}
		     
		     
		     
		return null;
	}

	@Override
	public CustomerDTO updateCustomerById(CustomerDTO dtos) {
		CustomerDTO dto = new CustomerDTO();
		try {
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			
		     Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc", "root", "Xworkzodc@123");
		     
		     PreparedStatement st = conn.prepareStatement("update bank set customer_name = ? , phone_no = ? , adhar_no = ? , adress = ? where id=? ");
		     st.setInt(5, dto.getId());
		     st.setString(1, dto.getCustomerName());
		     st.setString(2, dto.getPhoneNo() );
		     st.setString(3, dto.getAdharNO());
		     st.setString(4, dto.getAdress());
		     
		     int i = st.executeUpdate();
		     if( i != 0 ) {
		    	System.out.println("Account Is Create"); 
		     }else {
		    	 System.out.println("Account is not created");
		     }
		     }catch (Exception e) {
				e.printStackTrace();
			}
		     
		     
		
		
		
		
		
		return null;
	}

	@Override
	public List<CustomerDTO> deleteById(int id) {
		List<CustomerDTO> list = new ArrayList<CustomerDTO>();
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connection =DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc", "root", "Xworkzodc@123");
			String querry="delete from bank where id=?";

			PreparedStatement statement =connection.prepareStatement(querry);
			statement.setInt(1, id);
			int i = statement.executeUpdate();
			ResultSet rs=statement.executeQuery("select * from bank");
			while(rs.next()) {

				 CustomerDTO dto = new CustomerDTO();
				    dto.setId(rs.getInt(1)) ; 
		            dto.setCustomerName(rs.getString(2));
		            dto.setPhoneNo(rs.getString(3));
		            dto.setAdharNO(rs.getString(4));
		            dto.setAdress(rs.getString(5));
		          
		    	   
			list.add(dto);
			}

		} catch (Exception e) {
			e.printStackTrace();
		}		return list;
	
		
	}

	@Override
	public List<CustomerDTO> getCustomersById(int id) {
		CustomerDTO dtos = new CustomerDTO();
		try {
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			
		     Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc", "root", "Xworkzodc@123");
		     
		     PreparedStatement st = conn.prepareStatement("select * from where id = ?");
		    st.setInt(1, id);
		     
ResultSet j	=	st.executeQuery();

while (j.next()) {
	CustomerDTO dto = new CustomerDTO();
	dto.setId(j.getInt(1));
	dto.setCustomerName(j.getString(2));
	dto.setPhoneNo(j.getString(3));
	dto.setAdharNO(j.getString(4));
	dto.setAdress(j.getString(5));
}


	}catch (Exception e) {
	e.printStackTrace();
	}
return null;
	}
}
