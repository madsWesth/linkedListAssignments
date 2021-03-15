package com.kea;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class JDBCWriter {
    private static Connection cn = null;

    public static void connectDB(){
        final String url = "jdbc:mysql://127.0.0.1:3306/football_club?lingding=SERVER?serverTimezone=UTC";
        try {
            cn = DriverManager.getConnection(url,"lingding", "lol");
            System.out.println("Data base connection established");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    //Har jeg fat i det rigtige?
    public static void updatePlayer(int id, String firstname, String lastname, int age, int team){
        String updateStr = String.format("UPDATE member %d, '%s', '%s', %d, %d", id, firstname, lastname, age, team);
        PreparedStatement preparedStatement;

        try {
            preparedStatement = cn.prepareStatement(updateStr);
            preparedStatement.executeUpdate();
        } catch (SQLException err) {
            System.out.println("Update Error: " + err.getMessage());
        }
    }

    // Remove Player
    public static void removePlayer(String firstname, String lastname) {
        String revstr = String.format("remove from member where %s = %s, %s", firstname, lastname);
        PreparedStatement preparedStatement;
        try {
            preparedStatement = cn.prepareStatement(revstr);
            preparedStatement.executeUpdate();
        } catch (SQLException err) {
            System.out.println("Delete Error: " + err.getMessage());
        }
    }


}
