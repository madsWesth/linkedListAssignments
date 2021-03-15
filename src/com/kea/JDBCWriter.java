package com.kea;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class JDBCWriter {
    private static Connection cn = null;

    public static void connectDB(){
        final String url = "jdbc:mysql://127.0.0.1:3306/football_club?user=SERVER?serverTimezone=UTC";
        try {
            cn = DriverManager.getConnection(url,"?", "?");
            System.out.println("Data base connection established");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    //Har jeg fat i det rigtige?
    public static void update(String firstname, String lastname, int Age, int Team){
        String updateStr = String.format(firstname, lastname, Age, Team);
        PreparedStatement preparedStatement;

        try {
            preparedStatement = cn.prepareStatement(updateStr);
            preparedStatement.executeUpdate();
        } catch (SQLException err) {
            System.out.println("Update Error: " + err.getMessage());
        }
    }
}
