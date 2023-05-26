package com.xworkz.app;

import java.util.List;


import javax.persistence.EntityManager;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import javax.persistence.Query;

import com.xworkz.app.cosmeticsDTO.CosmeticsDTO;

public class Tester {

	
	public static void main(String[] args) {
		
		
	EntityManagerFactory factory=	Persistence.createEntityManagerFactory("jpa");
	EntityManager entityManagre = factory.createEntityManager();
	entityManagre.getTransaction().begin();

	//entityManagre.persist (new CosmeticsDTO(7, "isha", 89, "march-2020", "feb-2024"));
	
//entityManagre.merge(new CosmeticsDTO(2 ,"hassus" , 10000 , "jan-2021" , "feb-2024"  ));

 //    CosmeticsDTO dt =  	entityManagre.find(CosmeticsDTO.class, 1);
    // System.out.println(dt);
      
     //entityManagre.remove(dt);
Query query =  	entityManagre.createQuery("select entity from CosmeticsDTO entity");
CosmeticsDTO list = (CosmeticsDTO) query.getSingleResult();
System.out.println(list);
 	
	}
}
