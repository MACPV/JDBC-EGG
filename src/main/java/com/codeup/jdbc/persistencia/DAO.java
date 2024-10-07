package com.codeup.jdbc.persistencia;

import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

public abstract class DAO {
    protected Connection connection = null;
    protected ResultSet resultSet = null;
    protected Statement statement = null;
    private final String HOST = "localhost";
    private final String PORT = "3306";
    private final String USER = "root";
    private final String PASSWORD = "21Magnus07**";
    private final String DATABASE = "jardineria";
    private final String DRIVER = "com.mysql.cj.jdbc.Driver";

    protected void connectarDataBase() throws SQLException, ClassNotFoundException {
        try {
            Class.forName(DRIVER);
            String url = "jdbc:mysql://" + HOST + ":" + PORT + "/" + DATABASE;
            connection = DriverManager.getConnection(url, USER, PASSWORD);
            System.out.println("Conexión exitosa a la base de datos.");
        } catch (Exception e) {
            System.out.println(e.getMessage());
            throw e;
        }
    }

    protected void desconectarDataBase() throws SQLException, ClassNotFoundException {
        try {
            if (resultSet != null) {
                resultSet.close();
            }
            if (statement != null) {
                statement.close();
            }
            if (connection != null) {
                connection.close();
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
            throw e;
        }
    }

    protected void insertarModificarEliminarDataBase(String cadenaSQL) throws Exception {
        try {
            connectarDataBase();
            statement = connection.createStatement();
            statement.executeUpdate(cadenaSQL);
        } catch (SQLException e) {
            System.out.println(e.getMessage());
            throw e;
        } finally {
            desconectarDataBase();
        }
    }

    protected void consultarDataBase(String cadenaSQL) throws Exception {
        try {
            connectarDataBase();
            statement = connection.createStatement();
            statement.executeUpdate(cadenaSQL);
        } catch (SQLException e) {
            System.out.println(e.getMessage());
            throw e;
        }
    }

}
