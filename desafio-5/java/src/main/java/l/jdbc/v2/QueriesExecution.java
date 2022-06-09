package l.jdbc.v2;

import java.util.List;

public class QueriesExecution {

    public static void main( String[] args ) {

        AlunoDAO alunoDAO = new AlunoDAO( );

//      - Consulta com filtro

        Aluno alunoParaConsulta = alunoDAO.getById( 1 );
        System.out.println( alunoParaConsulta );


//      R - Ler uma lista no banco de dados

        List<Aluno> alunos = alunoDAO.list( );
        alunos.stream( ).forEach( System.out::println );


//      C - Criar instância para inserção no Banco de Dados

        Aluno alunoParaInsercao = new Aluno(
                "Matt",
                34,
                "SE"
        );
        alunoDAO.create( alunoParaInsercao );


//      U - Alterar uma entidade

        Aluno alunoParaAtualizar = alunoDAO.getById( 3 );
        alunoParaAtualizar.setNome( "James" );
        alunoParaAtualizar.setIdade( 28 );
        alunoParaAtualizar.setEstado( "MG" );
        alunoDAO.update( alunoParaAtualizar );

//      D - Remover uma entidade

        alunoDAO.delete( 1 );

    }

}
