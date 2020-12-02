package eu.bsinfo.fiae12.jpa.proj01;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class SchuelerTest {

	public static void main(String[] args) {
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("schule");
		EntityManager em = emf.createEntityManager();
		
		Schueler klara = new Schueler();
		klara.setId(1);
		klara.setVorname("Klara");
		klara.setNachname("Fall");
		
		em.getTransaction().begin();
		em.persist(klara);
		em.getTransaction().commit();
		
		Schueler gregor = new Schueler();
		gregor.setId(2);
		gregor.setVorname("Gregor");
		gregor.setNachname("Janisch");
		
		
		
		em.getTransaction().begin();
		em.persist(gregor);
		em.getTransaction().commit();
		
		em.close();
		emf.close();
	}

}
