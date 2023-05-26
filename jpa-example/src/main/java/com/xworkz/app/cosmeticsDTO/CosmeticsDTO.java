package com.xworkz.app.cosmeticsDTO;

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
@Table(name = "cosmetics")
@ToString
public class CosmeticsDTO {
    @Id
   @Column(name ="cosmetics_id")
	int cosmeticsId;
    @Column(name="cosmetics_name")
	String cosmeticsName;
    @Column(name="cosmetics_price")
	int price;
    @Column(name="cosmetics_mfg")
	String mfDate;
    @Column(name="cosmetics_exp")
	String exDate;
	
	
	
}
