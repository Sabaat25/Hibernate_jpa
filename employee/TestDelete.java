package com.jsp.employee;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class TestDelete { 
	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory= Persistence.createEntityManagerFactory("sabaat"); 
		EntityManager entityManager= entityManagerFactory.createEntityManager(); 
		EntityTransaction entityTransaction=entityManager.getTransaction(); 
		
		Employee employee=entityManager.find(Employee.class, 1); 
		
		if(employee!=null) { 
			entityTransaction.begin(); 
			entityManager.remove(employee); 
			entityTransaction.commit();
		}else { 
			System.out.println("NoT DeleTed");
		}
	}

}
