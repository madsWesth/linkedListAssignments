package com.kea;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JDBCWriter {
    private static Connection cn = null;

    public static void connectDB(){
        final String url = "jdbc:mysql://127.0.0.1:3306/football_club?user=Frederik_Server?serverTimezone=UTC";
        try {
            cn = DriverManager.getConnection(url,"Frederik", "Frederik");
            System.out.println("Data base connection established");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
