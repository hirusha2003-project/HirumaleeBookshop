package com.hirumalee.hirumaleebookshop.util;

import java.sql.Connection;
import java.sql.DriverManager;


public class DBConnection {
    private static Connection connection;

    // Private constructor ekak danna ona Singleton pattern eka nisa
    private DBConnection() {} 

    public static Connection getConnection() throws Exception {
        if (connection == null) {
            // MySQL Driver eka load kireema
            Class.forName("com.mysql.cj.jdbc.Driver");
            
            // Database ekata connect wena URL eka, username (root) saha password (empty)
            connection = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/hirumalee_bookshop", "root", "");
        }
        return connection;
    }
}