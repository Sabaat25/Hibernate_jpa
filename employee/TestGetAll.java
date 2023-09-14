package com.jsp.employee;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;



public class TestGetAll {  
	public static void main(String[] args) {
		
		EntityManagerFactory entityManagerFactory= Persistence.createEntityManagerFactory("sabaat");
		EntityManager entityManager= entityManagerFactory.createEntityManager();
		
		String sql="Select e From Employee e"; 
		Query query=entityManager.createQuery(sql); 
		
		List<Employee> employees=query.getResultList(); 
		for(Employee e:employees) { 
			System.out.println("======================"); 
			System.out.println(e.getId()); 
			System.out.println(e.getName()); 
			System.out.println(e.getEmail()); 
			System.out.println(e.getCno()); 
			System.out.println("======================"); 
		}
		
	}
	
}
