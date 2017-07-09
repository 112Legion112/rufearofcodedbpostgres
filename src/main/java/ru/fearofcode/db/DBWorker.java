package ru.fearofcode.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * Created by Max on 7/9/2017.
 */
public class DBWorker {
    private final String HOST = "jdbc:postgresql://localhost:5432/testdb";
    private final String USERNAME = "root";
    private final String PASSWORD = "root";

    private Connection connection;
    public DBWorker(){
        try{
            connection = DriverManager.getConnection(HOST,USERNAME,PASSWORD);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public Connection getConnection() {
        return connection;
    }
}
