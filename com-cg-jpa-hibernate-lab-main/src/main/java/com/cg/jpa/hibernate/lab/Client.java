package com.cg.jpa.hibernate.lab;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.cg.jpa.hibernate.lab.model.Greet;

public class Client {

	public static void main(String[] args) {
		
		System.out.println("Start");
		
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("abcde");
		EntityManager em = factory.createEntityManager();
		EntityTransaction tr = em.getTransaction();
		tr.begin();
	
		Greet grt2 = new Greet(100,"NIKHIL");
		grt2.setMessage_("Welcome to JPA!");
		em.persist(grt2);
		tr.commit();
		System.out.println("Added greeting to database.");
		em.close();
		factory.close();
		System.out.println("End");


	}

}
