package com.xworkz.chatapp.Controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;


import com.xworkz.chatapp.DTO.ChatDTO;
import com.xworkz.chatapp.service.ChatSerivce;
@Controller
@RequestMapping("/")
@Component
public class ChatController {

	@Autowired
	ChatSerivce service;
	
	@PostMapping("/rChat")
	public String registerChat(@ModelAttribute ChatDTO dto , HttpServletRequest req) {
		System.out.println("inside register chat");
		if(dto != null) {
			
			req.setAttribute("messagingTo", dto.getMessageTo());
			service.validateAndSaveChat(dto);
			return "/sucess.jsp";
		}
		
		
		return "failure";
	}
	@GetMapping("/listofchats")
	public String getAllChats(HttpServletRequest req) {
		List<ChatDTO> dtos = service.getAllChats();
	req.setAttribute("chats", dtos);
		return "/sucess.jsp";
		
	}
}
