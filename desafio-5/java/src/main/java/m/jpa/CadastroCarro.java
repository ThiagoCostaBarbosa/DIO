package m.jpa;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import m.jpa.model.Carro;
import m.jpa.model.Cliente;

public class CadastroCarro {

    public static void main( String... string ) {

        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory( "jpa2" );
        EntityManager entityManager = entityManagerFactory.createEntityManager( );
        entityManager.getTransaction( ).begin( );
        Cliente cliente = new Cliente( );
        cliente.setId( 1 );
        Carro carro = new Carro( );
        carro.setCliente( cliente );
        carro.setMarca( "Ford" );
        carro.setModelo( "Fusion" );
        entityManager.persist( carro );
        System.out.println( carro );
        entityManager.getTransaction( ).commit( );
        entityManager.close( );
        entityManagerFactory.close( );

    }

}
