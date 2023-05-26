package com.xworkz.app.service;

import java.util.List;
import java.util.Properties;
import java.util.function.Consumer;

import javax.mail.Authenticator;
import javax.mail.Message;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import com.xworkz.app.repository.*;

import com.xworkz.app.dto.LaptopDTO;
@Service
public class LaptopSericeIMPL implements LaptopService {

	
	 @Autowired
     LaptopRepository laptopRepo ; 
	 

	@Override
	public boolean sendMail(String email) {
	String portNumber= "587";
	String hostName = "smtp.office365.com";
	String fromEmail = "vijaykumarvini59@outlook.com";
	String password = "Vij@y123";
	String to = email;
		
		Properties prop = new Properties();
		prop.put("mail.smtp.host", hostName);
		prop.put("mail.smtp.port", portNumber);
		prop.put("mail.smtp.starttls.enable", "true");
		prop.put("mail.smtp.auth", "true");
		prop.put("mail.transport.protocal", "smtp");

		
		Session session = Session.getDefaultInstance(prop, new Authenticator() {
			@Override
		protected	javax.mail.PasswordAuthentication getPasswordAuthentication() {
			
			
			return new javax.mail.PasswordAuthentication(fromEmail, password);
		}
		});
		
		MimeMessage message = new MimeMessage(session);
		
		try {
			
			message.setFrom(new InternetAddress(fromEmail));
			message.setSubject("Registration completed");
			message.setText("thanks fro registering");
			message.addRecipient(Message.RecipientType.TO, new InternetAddress(to));
			Transport.send(message);
			System.out.println("mail sent");
			
		}catch (Exception e) {
			e.printStackTrace();
		}
		
		return true;
	}
	 

	
	@Override
	public LaptopDTO validateAndRegisterLaptop(LaptopDTO dto) {
		
		try {
		boolean isCompanyNamePresent = false;
		boolean isModelNoPresent = false;
		boolean isColorPresent = false;
		boolean isRampresent = false;
		boolean isGenerationPresent = false;
		
	
		
		if(dto.getCompanyName() != null && !dto.getCompanyName().isEmpty()) 
		isCompanyNamePresent = true;
		
		if(dto.getModelNo() != null && !dto.getModelNo().isEmpty())
		isModelNoPresent = true;
		
		if(dto.getColor() !=null)
			isColorPresent = true;
		if(dto.getRam() != null)
			isRampresent = false;
		
		if(dto.getGeneration() != null)
			isGenerationPresent = true;
		
		 LaptopSericeIMPL im =  new LaptopSericeIMPL();
		laptopRepo.saveLaptop(dto);
		im.sendMail(dto.getEmail());
		
		
		}catch (Exception e) {
			e.printStackTrace();
		}
		
		
		return null;
	}


	@Override
	public List<LaptopDTO> getAllLaptops() {
		// TODO Auto-generated method stub
		return laptopRepo.getAllLaptops();
	}



	@Override
	public List<LaptopDTO> getLaptopByCompanyName(String companyName) {
		// TODO Auto-generated method stub
		 return laptopRepo.getLaptopByCompanyName(companyName);
	}



	@Override
	public LaptopDTO getLaptopById(int id) {
		if(id > 0) {
			
			return laptopRepo.getLaptopById(id);
		}
		return null;
		
	}



	@Override
	public LaptopDTO updateLaptopById(LaptopDTO dto) {
	
		return laptopRepo.updateLaptopById(dto);
	}

	@Override
	public List<LaptopDTO> validateAndDelete(int id) {

		return laptopRepo.deleteById(id);


	}
}
