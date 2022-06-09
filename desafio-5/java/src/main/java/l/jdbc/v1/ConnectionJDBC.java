package l.jdbc.v1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionJDBC {

    public static void main( String[] args ) {

        String driver = "mysql";
        String dataBaseAddress = "localhost";
        String dataBaseName = "dio";
        String user = "root";
        String password = "root";

        String connectionUrl = "jdbc:" +
                               driver + "://" +
                               dataBaseAddress + "/" +
                               dataBaseName;

        try (Connection conn = DriverManager.getConnection( connectionUrl, user, password )) {

            System.out.println( "Só sucesso!" );

        } catch (SQLException e) {

            System.out.println( "Ihh... Falhou!" );
            e.printStackTrace( );

        }

    }

}
