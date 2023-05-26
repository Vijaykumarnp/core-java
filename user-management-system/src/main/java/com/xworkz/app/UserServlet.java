package com.xworkz.app;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class UserServlet  extends HttpServlet{

	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		 String firstName = 		req.getParameter("firstName");
			String middleName =    req.getParameter("middleName");
			String lastName = req.getParameter("lastName");
			Integer
			PrintWriter print = new PrintWriter(resp.getWriter());
			
			print.print(
					"<html>"
					+ "<body>"
					
					+"<h2> Welcome to Naukri " +firstName +"  " +middleName+"  "+lastName+" </h2>"
					+"</body>"
					
					
					
					+"</html>"
					
					
					);
		
	}
	
	
	
}
