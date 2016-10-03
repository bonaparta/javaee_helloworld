package test;

import javax.enterprise.context.ApplicationScoped;
import javax.enterprise.context.RequestScoped;
import javax.enterprise.inject.Produces;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 * For producing the EntityManager needed in our project. Currently we produce
 * our NBoss DB EM only. Depending on the NTT decision on the project design, we
 * may need to access the bottom systems' DB as well.
 * 
 * @author lokey.chow
 *
 */
@ApplicationScoped
public class EntityManagerProvider {

	@Produces
	@PersistenceContext(unitName = "test-just-tag")
	private EntityManager vdcLayoutEm;

	@Produces
	@RequestScoped
	@VdcLayoutDataSource
	public EntityManager getVdcLayoutEntityManager() {
		return vdcLayoutEm;
	}

}
