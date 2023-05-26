package com.xworkz.app;

import java.io.IOException;

import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet (value = "/link")
public class UserSerlet extends HttpServlet {

	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

	String userName = 	req.getParameter("userName");
		String qualification = req.getParameter("qualification");
		
		PrintWriter pr = new PrintWriter(resp.getWriter());
		pr.print(
				"<html>"
				+"<body>"
				+"<h2> helo "+userName+" get your own job </h2>"		
				
				+"</body>"
				+"</html>"
				);
		
		
	}
	
	
	
}
