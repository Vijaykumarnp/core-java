package com.xworkz.app;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet(value= "/user")
public class NaukriServlet  extends HttpServlet{

	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		try {
		 String firstName = 		req.getParameter("firstName");
			String middleName =    req.getParameter("middleName");
			String lastName = req.getParameter("lastName");
			String contactNo = req.getParameter("contactNo");
		Long c=	Long.parseLong(contactNo);
			PrintWriter print = new PrintWriter(resp.getWriter());
			
			print.print(
					"<html>"
					+ "<body>"
					
					+"<h2> Welcome to Naukri " +firstName +"  " +middleName+"  "+lastName+" </h2>"
					+"</body>"
					
					
					
					+"</html>"
					);
					    Class.forName("");
			            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc", "root", "Xworkzodc@123");
			            System.out.println("connection successful");
			              
			        
			            PreparedStatement st = conn.prepareStatement("insert into naukrii values(?, ?, ?, ?)");
			  
			           
			            
			            st.setString(1, req.getParameter("firstName"));
			            st.setString(2, req.getParameter("middleName"));
			            st.setString(3, req.getParameter("lastName"));
			            st.setLong(4, Long.valueOf(req.getParameter("contactNo")));
			  
			           
			            st.executeUpdate();
			  
			            st.close();
			            conn.close();
			  
			            
			           
			        } catch (Exception e) {
					       e.printStackTrace();
			        }
					
			
		
	}
	
	
	


}
