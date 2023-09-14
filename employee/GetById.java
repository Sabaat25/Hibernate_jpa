package com.jsp.employee;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class GetById { 
	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory= Persistence.createEntityManagerFactory("sabaat"); 
		EntityManager entityManager= entityManagerFactory.createEntityManager(); 
		
		Employee employee=entityManager.find(Employee.class,3);
		System.out.println(employee.getId()); 
		System.out.println(employee.getName()); 
		System.out.println(employee.getEmail()); 
		System.out.println(employee.getCno());
	}

}
