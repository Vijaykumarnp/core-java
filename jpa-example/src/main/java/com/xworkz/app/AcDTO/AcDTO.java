package com.xworkz.app.AcDTO;

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
@Table(name = "ac")
@ToString
public class AcDTO {
    @Id
    @Column(name = "ac_id")
	int id;
    @Column(name = "ac_name")
	String name;
    @Column(name = "ac_color")
	String color;
    @Column(name = "ac_voltage")
	int voltage;
	
	
	
	
}
