package com.xworkz.dto;

import java.io.Serializable;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
public class TerminalDTO implements Serializable  , Comparable<TerminalDTO>{

	

	private String name;
	private Integer sizee;
	private String type;
	private String location;
	private Integer id;
	
	public TerminalDTO(String name , Integer sizee , String type , String location , Integer id) {
		this.name = name;
		this.sizee= sizee;
		this.type = type ;
		this.location= location;
		this.id = id;
	}
	
	
	public TerminalDTO() {
		// TODO Auto-generated constructor stub
	}


	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	public void setSize(Integer sizee) {
		this.sizee=sizee;
	}
	
	public Integer getSize() {
		return sizee;
		
	}
	
	public void setType(String type) {
		this.type = type;
		
	}
	
	public String getType() {
		return type;
	}
	public void setlocation(String location) {
		this.location= location;
	}
	
	public String getLocation() {
		return location;
	}
	
	public void setId(Integer id) {
		this.id = id;
	}
	
	public Integer getId() {
		return id;
	}
	
	

	@Override
	public int compareTo(TerminalDTO o) {

		return this.id  - o.id;
	}
	
	
	
	
}
