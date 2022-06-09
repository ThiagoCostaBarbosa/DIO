package m.jdbc;

import m.jdbc.entity.Cliente;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ClienteDAO {

    private final Connection connection;

    public ClienteDAO( Connection connection ) {

        this.connection = connection;

    }

    public List<Cliente> buscarTodosOsClientes() throws SQLException {

        String SQL = "SELECT * FROM cliente";
        PreparedStatement preparedStatement = connection.prepareStatement( SQL );
        ResultSet resultSet = preparedStatement.executeQuery( );
        List<Cliente> clientes = new ArrayList<>( );

        while( resultSet.next( ) ) {

            Cliente cliente = new Cliente( );
            cliente.setId( resultSet.getInt( "id" ) );
            cliente.setNome( resultSet.getString( "nome" ) );
            clientes.add( cliente );

        }

        return clientes;

    }

    public void inserirNovoCliente( String nome ) throws SQLException {

        String SQL = "INSERT INTO cliente(nome) values (?)";
        PreparedStatement preparedStatement = connection.prepareStatement( SQL );
        preparedStatement.setString( 1, nome );
        preparedStatement.executeUpdate( );

    }

}
