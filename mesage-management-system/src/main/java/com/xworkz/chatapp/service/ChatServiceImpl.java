package com.xworkz.chatapp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import com.xworkz.chatapp.DTO.ChatDTO;
import com.xworkz.repository.ChatRepo;
@Service
public class ChatServiceImpl implements ChatSerivce {
      @Autowired
       ChatRepo repo;
	
	@Override
	public ChatDTO validateAndSaveChat(ChatDTO dto) {
	
		boolean isMesssageToPresent = false;
		boolean isMessagePresent= false;
		
		if(dto.getMessageTo() != null)
		isMesssageToPresent = true;
		
		if(dto.getMessage() != null)
		isMessagePresent = true;
			
		repo.saveChats(dto);
		
			
			
		return null;
	}

	@Override
	public List<ChatDTO> getAllChats() {
		// TODO Auto-generated method stub
		return null;
	}

}
