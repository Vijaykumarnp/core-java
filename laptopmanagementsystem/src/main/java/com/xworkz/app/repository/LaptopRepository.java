package com.xworkz.app.repository;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.mysql.cj.protocol.Resultset;
import com.xworkz.app.dto.LaptopDTO;
@Repository
public class LaptopRepository implements LaptopRepo{

	
	@Override
	public LaptopDTO saveLaptop(LaptopDTO dto) {
	
	
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
		     Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc", "root", "Xworkzodc@123");
		     
		     PreparedStatement st = conn.prepareStatement("insert into laptop values(?,?,?,?,?,?)");
		     st.setInt(1, dto.getId());
		     st.setString(2,dto.getCompanyName());
		     st.setString(3, dto.getModelNo());
		     
		     st.setString(4, dto.getColor());
		     st.setString(5, dto.getGeneration());
		     st.setString(6, dto.getRam());
		     int i = st.executeUpdate();
		     
		     if(i != 0) {
		    	 System.out.println("saves");
		    	 
		     }else {
		    	 
		    	 System.out.println("not saved");
		     }
		     
		     
		     
			
			
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
		
		return null;
	}

	@Override
	public List<LaptopDTO> getAllLaptops() {
		List<LaptopDTO> dtos = new ArrayList<LaptopDTO>();
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
		     Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc", "root", "Xworkzodc@123");
		     
		     PreparedStatement st = conn.prepareStatement("select * from laptop");
		       ResultSet rt = st.executeQuery();
		       
		       while (rt.next()) {
		    	   LaptopDTO dto = new LaptopDTO();
				    dto.setId(rt.getInt(1)) ; 
		            dto.setCompanyName(rt.getString(2));
		            dto.setModelNo(rt.getString(3));
		            dto.setColor(rt.getString(4));
		            dto.setGeneration(rt.getString(5));
		            dto.setRam(rt.getString(6));
		    	   
			 dtos.add(dto);
		    	   
			}
		}catch (Exception e) {
				e.printStackTrace();
			}
		
		
		
		
		return dtos;
	}

	public List<LaptopDTO> getLaptopByCompanyName(String name) {
		
		List<LaptopDTO> dtos = new 	ArrayList<LaptopDTO>();
		try {
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc", "root", "Xworkzodc@123");
			PreparedStatement st = con.prepareStatement("Select * from laptop where companyName = ?" );
			st.setString(1, name);
			ResultSet rt = st.executeQuery();
			
			while (rt.next()) {
				
				 LaptopDTO dto = new LaptopDTO();
				    dto.setId(rt.getInt(1)) ; 
		            dto.setCompanyName(rt.getString(2));
		            dto.setModelNo(rt.getString(3));
		            dto.setColor(rt.getString(4));
		            dto.setGeneration(rt.getString(5));
		            dto.setRam(rt.getString(6));
		    	   
			 dtos.add(dto);
			}
			
			
			
		}catch (Exception e) {
			e.printStackTrace();
		}
		
		
		
		
		
		
		
		return dtos;
	}

	public LaptopDTO getLaptopById(int id) {
		LaptopDTO dtos = new LaptopDTO();
		try {
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc", "root", "Xworkzodc@123");
			PreparedStatement st = con.prepareStatement("Select * from laptop where id = ?" );
			st.setInt(1, id);
			ResultSet rt = st.executeQuery();
			
			while (rt.next()) {
				
				 LaptopDTO dto = new LaptopDTO();
				    dto.setId(rt.getInt(1)) ; 
		            dto.setCompanyName(rt.getString(2));
		            dto.setModelNo(rt.getString(3));
		            dto.setColor(rt.getString(4));
		            dto.setGeneration(rt.getString(5));
		            dto.setRam(rt.getString(6));
		    	   
			dtos= dto;
			}	
		}catch (Exception e) {
			e.printStackTrace();
		}
		
		
		
		
		
		
		
		return dtos;
	}

	public LaptopDTO updateLaptopById(LaptopDTO dto2) {
		LaptopDTO dto = new LaptopDTO();
		try {
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc", "root", "Xworkzodc@123");
			PreparedStatement st = con.prepareStatement("update laptop set companyName = ? , modelNo = ? ,color = ? , generation = ? , ram = ? where id=?  " );
			 st.setInt(6, dto2.getId());
		     st.setString(1,dto2.getCompanyName());
		     st.setString(2, dto2.getModelNo());
		     
		     st.setString(3, dto2.getColor());
		     st.setString(4, dto2.getGeneration());
		     st.setString(5, dto2.getRam());
			int i = st.executeUpdate();
			
			if (i != 0 ) {
				System.out.println("updated");
				
			}else {
				System.out.println("not updated");
			}
			
			
			
		}catch (Exception e) {
			e.printStackTrace();
		}
		
		
		
		
		
		
		
		return dto2;
	}

	@Override
	public List<LaptopDTO> deleteById(int id) {
		List<LaptopDTO> list = new ArrayList<LaptopDTO>();
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connection =DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc", "root", "Xworkzodc@123");
			String querry="delete from laptop where id=?";

			PreparedStatement statement =connection.prepareStatement(querry);
			statement.setInt(1, id);
			int i = statement.executeUpdate();
			ResultSet rs=statement.executeQuery("select * from laptop");
			while(rs.next()) {

				 LaptopDTO dto = new LaptopDTO();
				    dto.setId(rs.getInt(1)) ; 
		            dto.setCompanyName(rs.getString(2));
		            dto.setModelNo(rs.getString(3));
		            dto.setColor(rs.getString(4));
		            dto.setGeneration(rs.getString(5));
		            dto.setRam(rs.getString(6));
		    	   
			list.add(dto);
			}

		} catch (Exception e) {
			e.printStackTrace();
		}		return list;
	}
	
	
}
