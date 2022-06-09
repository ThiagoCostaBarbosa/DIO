package l.jpa.ex3;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import jakarta.persistence.criteria.CriteriaQuery;
import jakarta.persistence.criteria.Root;
import l.jpa.classes.Aluno;
import l.jpa.classes.Estado;

import java.util.List;

/*
Consultas com os métodos find() do EntityManager, SQL nativo, JPQL e JPA Criteria API
equivalente aos seguintes SQL:

    SELECT * FROM Aluno WHERE id = 1              (traz somente 1 resultado)
    SELECT * FROM Aluno WHERE nome = 'Daniel'     (traz lista como resultado)
*/

public class ExecutionPart3 {

    public static void main( String[] args ) {

//      Dados instanciados como exemplo
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory( "l.jpa.ex2-DIO" );
        EntityManager entityManager = entityManagerFactory.createEntityManager( );
        entityManager.getTransaction( ).begin( );
        Estado estadoParaAdicionar = new Estado( "Rio de Janeiro", "RJ" );
        entityManager.persist( estadoParaAdicionar );
        entityManager.persist( new Estado( "Sao Paulo", "SP" ) );
        entityManager.persist( new Aluno( "Thiago", 29, estadoParaAdicionar ) );
        entityManager.persist( new Aluno( "Joao", 20, estadoParaAdicionar ) );
        entityManager.persist( new Aluno( "Pedro", 30, estadoParaAdicionar ) );
        entityManager.getTransaction( ).commit( );

//      Parametro das próximas buscas
        String nome = "Daniel";


//      find() do entityManager:

//          - Trazendo somente 1 resultado

            Aluno alunoEntityManager = entityManager.find( Aluno.class, 1 );
            System.out.println( "Consulta alunoEntityManager: " + alunoEntityManager );

//          - Não é possível trazer uma lista como resultado, deve-se utilizar um dos métodos abaixo.


//      SQL nativo:

//          - Trazendo somente 1 resultado

            String sql = "SELECT * FROM Aluno WHERE nome = :nome ";
            Aluno alunoSQL = (Aluno) entityManager
                    .createNativeQuery( sql, Aluno.class )
                    .setParameter( "nome", nome )
                    .getSingleResult( );
            System.out.println( "Consulta alunoSQL: " + alunoSQL );


//          - Trazendo uma lista como resultado

            String sqlList = "SELECT * FROM Aluno";
            List<Aluno> alunoSQLList = entityManager
                    .createNativeQuery( sqlList, Aluno.class )
                    .getResultList( );
            alunoSQLList.forEach( Aluno -> System.out.println( "Consulta alunoSQLList: " + Aluno ) );


//      JPQL - Java Persistence Query Language:

//          - Trazendo somente 1 resultado

            String jpql = "select a from Aluno a where a.nome = :nome";
            Aluno alunoJPQL = entityManager
                    .createQuery( jpql, Aluno.class )
                    .setParameter( "nome", nome )
                    .getSingleResult( );
            System.out.println( "Consulta alunoJPQL: " + alunoJPQL );


//          - Trazendo uma lista como resultado

            String jpqlList = "select a from Aluno a where a.estado = :estado";
            List<Aluno> alunoJPQLList = entityManager
                    .createQuery( jpqlList, Aluno.class )
                    .setParameter( "estado", estadoParaAdicionar )
                    .getResultList( );
            alunoJPQLList.forEach( Aluno -> System.out.println( "Consulta alunoJPQLList: " + Aluno ) );


//      JPA Criteria API + JPA Metamodel:

//          - Trazendo somente 1 resultado

//            CriteriaQuery<Aluno> criteriaQuery = entityManager.getCriteriaBuilder( ).createQuery( Aluno.class );
//            Root<Aluno> alunoRoot = criteriaQuery.from( Aluno.class );
//            CriteriaBuilder.In<String> inClause = entityManager.getCriteriaBuilder( ).in( alunoRoot.get( Aluno_.nome ) );
//            inClause.value( nome );
//            criteriaQuery.select( alunoRoot ).where( inClause );
//            Aluno alunoAPICriteria = entityManager.createQuery( criteriaQuery ).getSingleResult( );
//            System.out.println( "Consulta alunoAPICriteria: " + alunoAPICriteria );


//          - Trazendo uma lista como resultado

            CriteriaQuery<Aluno> criteriaQueryList = entityManager.getCriteriaBuilder( ).createQuery( Aluno.class );
            Root<Aluno> alunoRootList = criteriaQueryList.from( Aluno.class );
            List<Aluno> alunoAPICriteriaList = entityManager.createQuery( criteriaQueryList ).getResultList( );
            alunoAPICriteriaList.forEach( Aluno -> System.out.println( "Consulta alunoAPICriteriaList: " + Aluno ) );

    }

}
