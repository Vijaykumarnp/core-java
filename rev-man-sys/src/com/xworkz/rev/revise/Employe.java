package com.xworkz.rev.revise;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Data;
@Data
@AllArgsConstructor
public class Employe  implements Serializable, Comparable<Employe>{

	
	public Employe() {
		// TODO Auto-generated constructor stub
	}
	private int id;
	private String name;
	private String location;
	private Long contactNo;
	@Override
	public int compareTo(Employe o) {
		
		return this.id - o.id;
	}
	
	
	
	
}
