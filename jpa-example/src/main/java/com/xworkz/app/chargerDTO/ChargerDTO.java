package com.xworkz.app.chargerDTO;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "charger")
@ToString
public class ChargerDTO {

	
	@Id
	@Column(name="charger_id")
	int id ;
	@Column(name="charger_name")
	String companyName;
	@Column(name="charger_price")
	int price;
	@Column(name="charger_color")
	String color;
	
	
	
	
	
}
