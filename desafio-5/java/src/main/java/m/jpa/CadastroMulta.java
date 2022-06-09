package m.jpa;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import m.jpa.model.Carro;
import m.jpa.model.Multa;

import java.time.LocalDateTime;

public class CadastroMulta {

	public static void main(String... string) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory( "jpa2");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		entityManager.getTransaction().begin();
		Carro carro = new Carro();
		carro.setId(1);
		Multa multa = new Multa();
		multa.setData(LocalDateTime.now());
		multa.setValor(100.00);
		multa.setCarro(carro);
		entityManager.persist(multa);
		System.out.println(carro);
		entityManager.getTransaction().commit();
		entityManager.close();
		entityManagerFactory.close();
	}
}
