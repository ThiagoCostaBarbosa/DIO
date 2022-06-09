package m.jpa;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import m.jpa.model.Cliente;

public class CadastroClienteTransacao {

    public static void main( String... string ) {

        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory( "jpa2" );
        EntityManager entityManager = entityManagerFactory.createEntityManager( );
        entityManager.getTransaction( ).begin( );

        Cliente cliente = new Cliente( );
        cliente.setNome( "Joao Paulo" );
        entityManager.persist( cliente );
        entityManager.getTransaction( ).commit( );
        entityManager.close( );
        entityManagerFactory.close( );
    }
}

