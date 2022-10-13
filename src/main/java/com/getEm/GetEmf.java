package com.getEm;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class GetEmf {
	private static EntityManagerFactory emf;
	
	static {
		emf=Persistence.createEntityManagerFactory("empUnit");
	}
	
	public static EntityManager getEm() {
		EntityManager em=emf.createEntityManager();
		return em;
	};

}
