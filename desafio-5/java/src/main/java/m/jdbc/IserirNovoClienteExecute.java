package m.jdbc;

import java.sql.Connection;
import java.sql.SQLException;

public class IserirNovoClienteExecute {

    public static void main(String[] args) throws SQLException {

        try(Connection connection = DB.getConnection()) {

            ClienteDAO clienteDAO = new ClienteDAO(connection);
            clienteDAO.inserirNovoCliente("Joao");

        }

    }

}
