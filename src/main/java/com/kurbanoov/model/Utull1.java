package com.kurbanoov.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Utull1 {
    private final static String url = "jdbc:postgresql://localhost:5432/postgres";
    private final static String user = "postgres";
    private final static String password = "123123";

    public static Connection connections() {
        Connection connection1 = null;
        try {
            connection1 = DriverManager.getConnection(url, user, password);
            System.out.println("Подключено к серверу PostgreSQL  " + "успешно.");
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return connection1;
    }

}
