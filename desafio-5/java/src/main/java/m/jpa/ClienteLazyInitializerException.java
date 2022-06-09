package m.jpa;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import m.jpa.model.Cliente;

public class ClienteLazyInitializerException {

	public static void main(String... string) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory( "jpa2");
		EntityManager entityManager = entityManagerFactory.createEntityManager();

		Cliente cliente = entityManager.find(Cliente.class, 1);
		entityManager.close();
		System.out.println(cliente.getCarros().get(0).getMultas());
		entityManagerFactory.close();

	}
}
