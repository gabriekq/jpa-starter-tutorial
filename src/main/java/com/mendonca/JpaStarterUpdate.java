package com.mendonca;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class JpaStarterUpdate {

	public static void main(String[] args) {
	
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("myApp"); 
		EntityManager em =   entityManagerFactory.createEntityManager();
		
		Employee employee =  em.find(Employee.class, 1);
		
		EmailGroup emailGroup = em.find(EmailGroup.class, 4);
		
		employee.addEmailGroups(emailGroup);
		emailGroup.addMembers(employee);
		
	    EntityTransaction transaction = em.getTransaction();  
	    transaction.begin();	
	    
	    em.persist(employee);
	    em.persist(emailGroup);
	    
		 transaction.commit();
		 em.close();
		 entityManagerFactory.close();

	}

}
