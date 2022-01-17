package com.mendonca;

import java.util.Date;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

public class PercistenceContextDemo {

	public static void main(String[] args) {
		  
		  EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("myApp"); 
			EntityManager em =   entityManagerFactory.createEntityManager();
			
	      TypedQuery<Employee> query = em.createQuery("select e from Employee e where e.ssn = :ssn_p  ",Employee.class );
	      query.setParameter("ssn_p", "123");
	      List<Employee> resultList = query.getResultList();
		  
		  resultList.forEach( e -> System.out.println(e.getName())  );
		  
		  TypedQuery<Employee> query2 = em.createNamedQuery("get_all", Employee.class );
		  
		  List<Employee> resultList2 = query2.getResultList();
		  resultList2.forEach( e -> System.out.println(e+"  named"));
		  

	}

}
