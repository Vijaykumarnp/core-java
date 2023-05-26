package com.xworkz.app.network;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan
public class AllConfig {

	@Bean(value = "t")
	public House getHouse() {
		House k = new House();
		
		return k;
	}
	
	@Bean(value="a")
	public Team getTeam() {
		
		return new Team();
	}
	
	@Bean(value="b")
	public Channel getChannel() {
		
		return new Channel();
	}
	
	@Bean(value = "c")
	public Mobile getMobile() {
		
		return new Mobile();
	}
	@Bean(value = "d")
	public Hotel getHotel() {
		
		return new Hotel();
	}
	@Bean(value = "e")
	public Institute getInstitute() {
		return new Institute();
	}
	@Bean(value = "f")
	public Juice getJuice() {
		return new Juice();
	}
	
	@Bean(value="g")
	public Building getBuilding() {
		
		return new Building();
	}
	
	@Bean(value="h")
	public Company getCompany() {
		return new Company();
	}
	
}
