/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package singleton;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class singletonconnect {
    private static singletonconnect instance;
    private Connection connection;
    private static final String URL = "jdbc:mysql://localhost/dbBooks";
    private static final String USER = "root";
    private static final String PASSWORD = "";

    private singletonconnect() {
        try {
            this.connection = DriverManager.getConnection(URL, USER, PASSWORD);
            System.out.println("Congratulations you are now connected to dbBooks.");
        } catch (SQLException e) {
            System.out.println("Connection error : " + e.getMessage());
        }
    }

    public static singletonconnect getInstance() {
        if (instance == null) {
            instance = new singletonconnect();
        }
        return instance;
    }

    public Connection getConnection() {
        return connection;
    }
}

