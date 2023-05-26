package com.xworkz.app;
import javax.persistence.Query;

import java.util.Iterator;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.xworkz.app.AcDTO.AcDTO;
import com.xworkz.app.chargerDTO.ChargerDTO;
import com.xworkz.app.cosmeticsDTO.CosmeticsDTO;
import com.xworkz.app.trimmerDTO.TrimmerDTO;

public class JpaTester {

	public static void main(String[] args) {	
	EntityManager manager =	Persistence.createEntityManagerFactory("jpa").createEntityManager();
		
		manager.getTransaction().begin();
		//manager.persist(new ChargerDTO(3 , "one-plus" , 1200 , "brown") );
Query query = 	manager.createQuery("select companyName , price from ChargerDTO entit  ");
List<Object[]> list = (List<Object[]>) query.getResultList();
for (Object[] objects : list) {
	for (Object objects2 : objects) {
		System.out.println(objects2);
	}
}


Query query1 = 	manager.createQuery("select entit from ChargerDTO entit");
List<CosmeticsDTO> list1 =  query1.getResultList();
System.out.println(list1);




	Query query2 = 	manager.createQuery("select entit from ChargerDTO entit where id = 1");
	ChargerDTO list2 =   (ChargerDTO) query2.getSingleResult();
	System.out.println(list2);

	
	
	Query query3 = 	manager.createQuery("select companyName , price from ChargerDTO entit where id = 1");
	Object[] list3 = (Object[]) query3.getSingleResult();
	for (Object object : list3) {
		System.out.println(object);
	}

	
	
	Query query4 = 	manager.createQuery("select companyName , color from ChargerDTO entit where id = 1");
Object[]  list4 = (Object[]) query4.getSingleResult();
for (Object object : list4) {
	System.out.println(object);
}	


	Query query5 = 	manager.createQuery("update ChargerDTO entity set color = :pt where id = :id");
	
	query5.setParameter("pt", "brown");
query5.setParameter("id", 1);
int row= query5.executeUpdate();

	System.out.println(row);
	
	
	
	Query q = manager.createQuery("update ChargerDTO entity set companyName = :jsd where id = :id");
	q.setParameter("jsd", "hwai");
	q.setParameter("id", 1);
	int ro = q.executeUpdate();

	
	System.out.println(ro);
	
	
	Query k = manager.createQuery("update ChargerDTO entity set price = :h where id=:i");
	k.setParameter("h", 72828);
	k.setParameter("i", 1);
	int i = k.executeUpdate();
	manager.getTransaction().commit();
	System.out.println(i);
	
	}


	}

