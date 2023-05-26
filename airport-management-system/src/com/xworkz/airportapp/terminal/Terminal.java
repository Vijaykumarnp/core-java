package com.xworkz.airportapp.terminal;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class Terminal {
	
	private String name;
	private int sizee;
	private String type;
@Override
public String toString() {
	return "terminal- {"+this.name+" , "+this.getSizee()+" , "+this.getType()+"}" ;
}

}