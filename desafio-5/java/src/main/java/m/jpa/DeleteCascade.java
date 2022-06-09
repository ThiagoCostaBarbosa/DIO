package m.jpa;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import jakarta.persistence.Query;
import m.jpa.model.Cliente;

public class DeleteCascade {

	public static void main(String... string) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory( "jpa2");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		entityManager.getTransaction().begin();
//		EntityGraph<Cliente> entityGraph = entityManager.createEntityGraph(Cliente.class);
//		Subgraph<Object> carros = entityGraph.addSubgraph("carros");
//		carros.addSubgraph("multas");
		Query query = entityManager.createQuery( "SELECT c FROM Cliente c join fetch c.carros ca join fetch ca.multas m where c.id = :id");
		query.setParameter("id",7);
		Cliente singleResult = (Cliente) query.getSingleResult();
//		Cliente cliente = entityManager.find(Cliente.class, 6, Collections.singletonMap("jakarta.persistence.loadgraph", entityGraph));
		entityManager.remove(singleResult);
		entityManager.getTransaction().commit();
		entityManager.close();
		entityManagerFactory.close();

	}
}
