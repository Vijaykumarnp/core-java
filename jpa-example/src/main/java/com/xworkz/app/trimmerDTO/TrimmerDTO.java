package com.xworkz.app.trimmerDTO;

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
@Table(name = "trimmer")
@ToString
public class TrimmerDTO {

	@Id
	@Column(name = "trimmer_id")
	int id;
	@Column(name = "trimmer_name")
	String companyName;
	@Column(name = "trimmer_operation")
	String operationType;
	@Column(name = "trimmer_price")
	double price;
	@Column(name = "trimmer_warranty")
	String warranty;
	
	
	
}
