package com.xworkz.ddapp.dboys;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor



	public class Dboys {

		private String name ;
		private int age;
		private String vehichleNumber;
		private long contact;
		
		public String toString() {
			return "DeliveryBoys - ["+this.name+" , "+this.age+" , "+this.vehichleNumber+" , "+this.contact+"]";
			
		}
		
		
	}

