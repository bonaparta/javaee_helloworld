package test;

import java.util.List;

import javax.annotation.PostConstruct;
import javax.ejb.Singleton;
import javax.ejb.Startup;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.Query;

@Singleton
@Startup
public class DBConnectTest {

	@Inject
	private EntityManager em;

	@PostConstruct
	public void startup() {
		System.out.println("Hello");
//		EntityManagerFactory emf = Persistence.createEntityManagerFactory("test-just-tag");
//		EntityManager em = emf.createEntityManager();
		Query query = em.createQuery("select b from VdcBuilding b");
		@SuppressWarnings("unchecked")
		List<VdcBuilding> hihi = query.getResultList();
		System.out.println("**** Size: " + hihi.size());
//		em.close();
	}
}

//@VdcLayoutDataSource