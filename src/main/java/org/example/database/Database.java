package org.example.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
public class Database {
    private final String HOST = "jdbc:mysql://localhost:3306/banksystem";
    private final String USERNAME = "root";
    private final String PASSWORD = "";
    private Connection connection;
    private static Database instance;

    public static Database getInstance() {
        if (instance == null) {
            instance = new Database();
        }
        return instance;
    }


    //object that connects project to database
    private Database() {
        try (Connection connection = DriverManager.getConnection(HOST, USERNAME, PASSWORD)) {
            System.out.println("connected");
            ;
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
