package com.xworkz.applic.typeofdatas;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@NoArgsConstructor
@ToString


public class Custmer implements Comparable<Custmer> {

	
	
	

		
		private String  cusName;
		private int cusId;
		private int cusAge;
		private String adress;
		private String branch;

		public Custmer(String cusName , int cusId , int cusAge , String adress , String branch) {
			this.cusName = cusName;
			this.cusId = cusId;
			this.cusAge = cusAge;
			this.adress= adress;
			this.branch = branch;
			
		
		}

		@Override
		public int compareTo(Custmer o) {
			// TODO Auto-generated method stub
			return this.getCusId()-o.cusId ;
		}
		
		
		
		
		
		
		
	}

	

