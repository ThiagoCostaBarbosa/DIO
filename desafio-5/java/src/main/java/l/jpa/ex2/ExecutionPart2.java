package l.jpa.ex2;

import l.jpa.classes.Aluno;
import l.jpa.classes.Estado;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

// OBS: Esse codigo deve executar SEM ERROS com a implementacao JPA que foi definida no "persistence.xml".
// Se estiver somente com o JPA baixado, o codigo NAO IRA funcionar.

public class ExecutionPart2 {

    public static void main( String[] args ) {

        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory( "jpa2" );
        EntityManager entityManager = entityManagerFactory.createEntityManager( );

//      C - Criar instancias para serem adicionadas no Banco de Dados pela Transaction

        Estado estadoParaAdicionar = new Estado( "Santa Catarina", "SC" );
        Aluno alunoParaAdicionar = new Aluno( "Thiago", 29, estadoParaAdicionar );

        entityManager.getTransaction( ).begin( );
        entityManager.persist( estadoParaAdicionar );
        entityManager.persist( alunoParaAdicionar );
        entityManager.getTransaction( ).commit( );


//      R - Ler instâncias no banco de dados

        Estado estadoEncontrado = entityManager.find( Estado.class, 1 );
        Aluno alunoEncontrado = entityManager.find( Aluno.class, 1 );

        System.out.println( estadoEncontrado );
        System.out.println(alunoEncontrado);


//      U - Alterar uma entidade

        entityManager.getTransaction( ).begin( );
        alunoEncontrado.setNome( "Karam" );
        alunoEncontrado.setIdade( 20 );
        entityManager.getTransaction().commit();


//      D - Remover uma entidade

        entityManager.getTransaction( ).begin( );
        entityManager.remove( alunoEncontrado );
        entityManager.getTransaction().commit();


//      Encerrar o gerenciador de entidades e encerrar a fabrica de gerenciadores de entidade.

        entityManager.close( );
        entityManagerFactory.close( );

    }

}
