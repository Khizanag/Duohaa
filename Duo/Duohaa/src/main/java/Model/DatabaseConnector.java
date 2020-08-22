package Model;

import Configs.DatabaseConfig;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnector implements DatabaseConfig {

    /* private instance variables */
    private static Connection connection;

    private DatabaseConnector(){}

    public static Connection getConnection(){
        if(connection == null)
            initConnection();
        return connection;
    }

    private static void initConnection(){
        System.setProperty("jdbc.drivers", "sun.jdbc.odbc.JdbcodbcDriver");
        try {
            connection = DriverManager.getConnection(URL+DATABASE_NAME, USERNAME, PASSWORD);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

}
