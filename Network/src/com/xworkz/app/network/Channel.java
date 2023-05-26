package com.xworkz.app.network;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;

import lombok.Data;
import lombok.ToString;

@Data
@ToString
public class Channel {

	@Value("ZeeKannada")
	private String channelName;
	@Autowired
	private Viewers viewrName;
	
	
}
