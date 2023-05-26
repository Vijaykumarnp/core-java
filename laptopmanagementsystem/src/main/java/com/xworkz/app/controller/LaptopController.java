package com.xworkz.app.controller;




import java.util.List;

import javax.servlet.http.HttpServlet;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.view.RedirectView;

import com.xworkz.app.service.LaptopService;
import com.xworkz.app.dto.LaptopDTO;

import com.xworkz.app.service.*;
import com.xworkz.app.dto.*;
@Controller
@RequestMapping("/")
@Component
public class LaptopController {

	@Autowired
	LaptopService serice ;
	
	
	
	
	@PostMapping("/registerLaptop")
	public String registerLaptop(@ModelAttribute LaptopDTO dto , HttpServletRequest req) {
		System.out.println("inside the controller class registerLaptop Method");
		if(dto != null) {
			
			serice.validateAndRegisterLaptop(dto);
			req.setAttribute("name", dto.getCompanyName());
			return "sucess";
		}
		
		return "failure";
	}
	
	
	@GetMapping("/listofLaptops")
	public String getAllLaptop(HttpServletRequest req) {
		List<LaptopDTO> dtos = serice.getAllLaptops();
	req.setAttribute("laptops", dtos);
		return "index";
		
	}
	
	@GetMapping("/search")
	public String getLaptopByCompanyName(@RequestParam("companyName") String companyName , HttpServletRequest req ) {
		
		List<LaptopDTO > dto = serice.getLaptopByCompanyName(companyName);
		System.out.println(dto);
		req.setAttribute("laptops", dto);
		return "index";
		
	}
	
	@GetMapping("/update/{id}")
	public String getLaptopById(@PathVariable("id") int id , HttpServletRequest req) {
		
	LaptopDTO  dto = serice.getLaptopById(id);
	
		System.out.println(dto);
		req.setAttribute("laptop", dto);
		return "update";
		
		
	}
	
	@PostMapping("/update")
	public String updateLaptopById(@ModelAttribute LaptopDTO dto , HttpServletRequest req) {
		
	LaptopDTO  dtos = serice.updateLaptopById(dto);
		System.out.println(dto);
		req.setAttribute("laptop", dto);
		return "sucess";
		
		
	}
	
	@GetMapping("/delete/{id}")
	public  RedirectView deleteById(@PathVariable("id") int id,HttpServletRequest req) {
	List<LaptopDTO> list = serice.validateAndDelete(id);
		
		req.setAttribute("laptop", list);	
		RedirectView rd = new RedirectView();
		rd.setUrl(req.getContextPath());
		rd.setUrl(req.getContextPath() + "/listofLaptops");
		
		return rd;
		}
}
