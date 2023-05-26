package com.vrl.app.bus;

import com.vrl.app.Vrl.Vrl;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@NoArgsConstructor
//@AllArgsConstructor
@ToString

public class Bus {

	
	
	private String number;
	private int size;
	private String type;
	private String name;
	
	
	public Bus(String number , String type ,int  size , String name) {
		
		this.name = name;
		this.type = type;
		this.size = size;
		this.number = number;
		
		
		
	}
	
		
		
	
	
	@Override
	public boolean equals(Object obj) {
		
		Bus vv = (Bus)obj;
		if(this.name.equals(vv.name)) {
			return true;
		}
		
		return false;
	}





	
	
	
}
