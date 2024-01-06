package com.example.booksite.model;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import javax.sql.DataSource;
//spring bootta veritabanı bağlantılarını yönetmek için DataSource kullanılır.
@Configuration
public class DatabaseConfig {

    private static final String URL = "jdbc:mysql://localhost:3306/booksite";
    private static final String USER = "root";
    private static final String PASSWORD = "2772";

    @Bean
    public DataSource dataSource() {
        DriverManagerDataSource dataSource = new DriverManagerDataSource();
        dataSource.setDriverClassName("com.mysql.cj.jdbc.Driver");
        dataSource.setUrl(URL);
        dataSource.setUsername(USER);
        dataSource.setPassword(PASSWORD);
        return dataSource;
    }
}

