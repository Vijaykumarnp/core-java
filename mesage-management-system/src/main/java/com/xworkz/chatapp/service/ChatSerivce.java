package com.xworkz.chatapp.service;

import java.util.List;

import com.xworkz.chatapp.DTO.ChatDTO;

public interface ChatSerivce {

	
	ChatDTO validateAndSaveChat(ChatDTO dto);
	
	
	List<ChatDTO> getAllChats();
	
}
