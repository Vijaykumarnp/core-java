package com.xworkz.app.controller;

import java.util.List;


import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.view.RedirectView;

import com.xworkz.app.dto.CustomerDTO;

import com.xworkz.app.service.BankService;

@Component
@RequestMapping("/")
@Controller
public class BankController {

	@Autowired
    BankService service;
		
	public BankController() {
		System.out.println(this.getClass() + "object is created");
	}
		
		@PostMapping("/createAccount")
		public String createAccount(@ModelAttribute CustomerDTO dto , HttpServletRequest req) {
			System.out.println("inside the controller class  Method");
			if(dto != null) {
				System.out.println("dto not null");
				service.validateAndCreateAccount(dto);
				req.setAttribute("name", dto.getCustomerName());
				return "sucess";
			}
			
			return "failure";
		}
		
		@GetMapping("/listofCustomers")
		
		public String getAllCustomers(HttpServletRequest req) {
			System.out.println("get all customers");
			List<CustomerDTO> dtos = service.getAllCustomers();
		req.setAttribute("customers", dtos);
			return "sucess";
			
		}
		@GetMapping("/update/{id}")
		public String getAllById(@PathVariable int id , HttpServletRequest req) {
			List<CustomerDTO> dtos = service.getCustomersId(id);
		req.setAttribute("customer", dtos);
			return "sucess";
			
		}
		@PostMapping("/update")
		public String updateCustomerById(@ModelAttribute CustomerDTO dto , HttpServletRequest req) {
			
		CustomerDTO  dtos = service.updateCustomerById(dto);
			System.out.println(dto);
			req.setAttribute("customers", dto);
			return "sucess";
			
			
		}
		
		@DeleteMapping("/delete/{id}")
		public  RedirectView deleteById(@PathVariable("id") int id,HttpServletRequest req) {
		List<CustomerDTO> list = service.validateAndDelete(id);
			
			req.setAttribute("customer", list);	
			RedirectView rd = new RedirectView();
			rd.setUrl(req.getContextPath());
			rd.setUrl(req.getContextPath() + "/listofCustomers");
			
			return rd;
			}
		
	}
	

