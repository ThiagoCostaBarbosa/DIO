package m.jpa;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import m.jpa.model.Carro;
import m.jpa.model.Cliente;
import m.jpa.model.Multa;

import java.time.LocalDateTime;

public class UpdateClienteTransacao {

    public static void main(String... string) {
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory( "jpa2");
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        entityManager.getTransaction().begin();

        Cliente cliente = new Cliente();
        cliente.setNome("Maria Testa Transacao");
        entityManager.persist(cliente);

        Carro carro = new Carro();

        carro.setCliente(cliente);
        carro.setMarca("Ford");
        carro.setModelo("Fiesta");

        entityManager.persist(carro);

        Multa multa = new Multa();
        multa.setCarro(carro);
        multa.setValor(50.00);
        multa.setData(LocalDateTime.now());

        entityManager.persist(multa);
        entityManager.getTransaction().commit();
        entityManager.getTransaction().begin();
        entityManager.getTransaction().commit();
        entityManager.close();
        entityManagerFactory.close();
    }
}

