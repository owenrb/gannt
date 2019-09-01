package io.owenrbee.gannt.jpa.model;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.junit.Before;
import org.junit.Test;


public class PersistenceTest {

    private static EntityManager em;
    
	@Before
	public void setupDb() {

        EntityManagerFactory emf = Persistence
                .createEntityManagerFactory("gannt");
        emf.createEntityManager();
	}
	
	@Test
	public void noop() {
		
	}
	
	public void addData() {
		
		em.getTransaction().begin();
		
		Role role = new Role();
		role.setId("BE");
		role.setName("Backend Developer");
		em.persist(role);
		em.getTransaction().commit();
	}
}
