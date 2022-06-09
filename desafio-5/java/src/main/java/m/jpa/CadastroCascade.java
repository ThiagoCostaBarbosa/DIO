package m.jpa;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import m.jpa.model.Carro;
import m.jpa.model.Cliente;
import m.jpa.model.Multa;

import java.time.LocalDateTime;
import java.util.Collections;

public class CadastroCascade {

	public static void main(String... string) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory( "jpa2");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		entityManager.getTransaction().begin();



		Cliente cliente = new Cliente();
		cliente.setNome("Rei dos Tecidos");
		Multa multa = new Multa();
		multa.setData(LocalDateTime.now());
		multa.setValor(50.00);
		Carro carro = new Carro();
		carro.setCliente(cliente);
		carro.setModelo("Fusca");
		carro.setMarca("Ford");
		carro.setMultas(Collections.singletonList(multa));
		multa.setCarro(carro);
		cliente.setCarros(Collections.singletonList(carro));
		entityManager.persist(cliente);
		System.out.println(cliente);
		entityManager.getTransaction().commit();

		entityManager.close();
		entityManagerFactory.close();

	}
}
