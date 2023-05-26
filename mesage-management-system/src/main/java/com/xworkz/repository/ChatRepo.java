package com.xworkz.repository;

import java.util.List;

import com.xworkz.chatapp.DTO.ChatDTO;

public interface ChatRepo {

	
	List<ChatDTO> getAllChats();

	ChatDTO saveChats(ChatDTO dto);
	
	
	
}
