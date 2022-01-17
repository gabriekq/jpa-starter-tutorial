package com.mendonca;

import java.util.Date;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class JpaStarterMain {

	public static void main(String[] args) {
		
		
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("myApp"); 
		EntityManager em =   entityManagerFactory.createEntityManager();
		
		
		
		/*
		Employee objEmployee =  em.find(Employee.class, 2);
		EntityTransaction transaction = em.getTransaction(); 
		transaction.begin();
		em.remove(objEmployee);
		transaction.commit();
		*/
		
		
		
		
		
		/*
		objEmployee.setAge(69);
		objEmployee.setType(EmployeeType.FULL_TIME);
		
		EntityTransaction transaction = em.getTransaction(); 
		transaction.begin();
		em.persist(objEmployee);
		transaction.commit();
		
		System.out.println(objEmployee);
		
		*/
		
		
		
		  Employee employee774 = new Employee(); 
		  employee774.setName("Foo");
		  employee774.setSsn("123"); employee774.setDob(new Date());
		  employee774.setType(EmployeeType.CONTRACTOR);
		  employee774.setAge(30); 
		  
		  
		  Employee employee12 = new Employee(); 
		  employee12.setName("wq");
		  employee12.setSsn("129"); 
		  employee12.setAge(30); 
		  employee12.setDob(new Date()); 
		  employee12.setType(EmployeeType.CONTRACTOR);
		  
		//  EntityManagerFactory entityManagerFactory =Persistence.createEntityManagerFactory("myApp"); 
		 // EntityManager em =  entityManagerFactory.createEntityManager();
		 
		  
		  AccessCard card1 = new AccessCard();
		  card1.setActive(true);
		  card1.setIssueDate(new Date());
		  card1.setFirmwareVersion("1.0.0");
		  employee12.setCard(card1);
		   card1.setOwner(employee12);
		  
		  AccessCard card2 = new AccessCard();
		  card2.setActive(false);
		  card2.setIssueDate(new Date());
		  card2.setFirmwareVersion("2.0.0");
		  employee774.setCard(card2);
		  card2.setOwner(employee774);
		  
		  PayStub payStub = new PayStub();
		  payStub.setPayPeriodStart(new Date());
		  payStub.setPayPeriodEnd(new Date());
		  payStub.setSalary(1000);
		  payStub.setEmployee(employee12);
		  employee12.addPaystub(payStub);
		  
		  PayStub payStub2 = new PayStub();
		  payStub2.setPayPeriodStart(new Date());
		  payStub2.setPayPeriodEnd(new Date());
		  payStub2.setSalary(2000);
		  payStub2.setEmployee(employee12);
		  employee12.addPaystub(payStub2);
		  
		 // employee12.setPayStub(List.of(payStub,payStub2));
		  
		  
		  EmailGroup emailGroup1 = new EmailGroup();
		  emailGroup1.setName("Watter coller");
		  emailGroup1.addMembers(employee12);
		  emailGroup1.addMembers(employee774);
		  
		  employee12.addEmailGroups(emailGroup1);
		  employee774.addEmailGroups(emailGroup1);
		  
		  
		  EmailGroup emailGroup2 = new EmailGroup();
		  emailGroup2.setName("ENG");
		  
		  employee12.addEmailGroups(emailGroup2);
		  emailGroup2.addMembers(employee12);
		  
		  
		 EntityTransaction transaction = em.getTransaction(); 
		 transaction.begin();
		 em.persist(employee774);
		 em.persist(employee12); 
		 
		 em.persist(card1); 
		 em.persist(card2); 
		 
		 em.persist(emailGroup1);
		 em.persist(emailGroup2);
		 
		 em.persist(payStub); 
		 em.persist(payStub2); 
		 
		 transaction.commit();
		
	
	
      
     
    
      
	}

}
