package com.xworkz.repository;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.mysql.cj.protocol.Resultset;
import com.xworkz.chatapp.DTO.ChatDTO;

public class ChatRepoImpl implements ChatRepo{

	@Override
	public ChatDTO saveChats(ChatDTO dto) {
	
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
		     Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc", "root", "Xworkzodc@123");
		     
		     PreparedStatement st = conn.prepareStatement("insert into chats values(?,?,?)");
		     st.setInt(1, dto.getId());
		    st.setString(2, dto.getMessageTo());
		    st.setString(3, dto.getMessage());
		    
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
	public List<ChatDTO> getAllChats() {
		List<ChatDTO> dto = new ArrayList<ChatDTO >(); 
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
		     Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc", "root", "Xworkzodc@123");
		     
		     PreparedStatement st = conn.prepareStatement("select * from chats");
		     
		   ResultSet rt = st.executeQuery();
		     while (rt.next()) {
			ChatDTO dtso =  new ChatDTO();
				dtso.setId(rt.getInt(1));
				dtso.setMessageTo(rt.getString(2));
				dtso.setMessage(rt.getString(3));
				dto.add(dtso);
				
			}
		     
		     
		}catch (Exception e) {
			e.printStackTrace();
		}
		return dto;
	}

}
