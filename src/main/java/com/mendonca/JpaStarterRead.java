package com.mendonca;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class JpaStarterRead {

	public static void main(String[] args) {
		
		
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("myApp"); 
		EntityManager em =   entityManagerFactory.createEntityManager();
		
		//Employee employee =  em.find(Employee.class, 1);
		System.out.println("*********************");
		//System.out.println(employee.getName());
		//System.out.println("*********************");
	//System.out.println("!!!!!!!"+employee.getCard());
		
		
    System.out.println("*********************");
    EmailGroup emailGroup = em.find(EmailGroup.class, 4);
    // PayStub payStub = em.find(PayStub.class, 3);
	
	System.out.println(emailGroup.getEmployees());
		
		

	}

}
