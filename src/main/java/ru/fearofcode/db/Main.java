package ru.fearofcode.db;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * Created by Max on 7/9/2017.
 */
public class Main {
    public static void main(String[] args) {
        DBWorker worker = new DBWorker();

        String query = "SELECT * FROM users WHERE id=2;";
        try {
            Statement statement = worker.getConnection().createStatement();
            ResultSet resultSet = statement.executeQuery(query);

            while (resultSet.next()) {
                User user = new User();
                user.setId(resultSet.getInt("id"));
                user.setName(resultSet.getString("name"));
                user.setPassword(resultSet.getString("password"));

                System.out.println(user);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
