package com.xworkz.app.network;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import lombok.Data;
import lombok.ToString;

@Component
@Data
@ToString
public class Client {

	@Value("Shankesh")
	private String clientName;
}
