package com.xworkz.xworkzapp.controller;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.xworkz.service.LaptopService;
import com.xworkz.xworkzapp.dto.LaptopDTO;


@Controller
@RequestMapping("/")
@Component
public class LaptopController {

	@Autowired
	LaptopService service ; 
	
	
	
	@PostMapping("/registerLaptop")
	public String registerLaptop(@ModelAttribute LaptopDTO dto , HttpServletRequest req) {
		System.out.println("inside the controller class registerLaptop Method");
		if(dto != null) {
			service.validateAndRegisterLaptop(dto);
			
			req.setAttribute("name", dto.getCompanyName());
			return "/sucess.jsp";
		}
		
		return "failure";
	}
	
	
	
}
