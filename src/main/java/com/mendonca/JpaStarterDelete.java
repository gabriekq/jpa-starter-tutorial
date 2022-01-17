package com.mendonca;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class JpaStarterDelete {

	public static void main(String[] args) {
		
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("myApp"); 
		EntityManager em =   entityManagerFactory.createEntityManager();
		
		Employee employee =  em.find(Employee.class, 2);
		
		

		
	    EntityTransaction transaction = em.getTransaction();  
	    transaction.begin();	
	    
	    em.remove(employee);
	   
		 transaction.commit();
		 em.close();
		 entityManagerFactory.close();
		
		
		
		

	}

}
