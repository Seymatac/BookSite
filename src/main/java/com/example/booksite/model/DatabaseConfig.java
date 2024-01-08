package com.example.booksite.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConfig {

   // Database Configten tek nesne oluşturma.
    private static DatabaseConfig instance = new DatabaseConfig();

    //Veritabanı bağlantısı Connection
    private Connection connection;

    //private tanımlandığı için sınıfın dışından doğrudan bir erişim engellendi.
    private DatabaseConfig() {

        try {
            String url = "jdbc:mysql://localhost:3306/booksite";
            String username = "root";
            String password = "2772";
            this.connection = DriverManager.getConnection(url, username, password);
        } catch (SQLException e) {
            e.printStackTrace();

        }
    }

    public static DatabaseConfig getInstance() {
        return instance;
    }

    public Connection getConnection() {
        return connection;
    }
}

