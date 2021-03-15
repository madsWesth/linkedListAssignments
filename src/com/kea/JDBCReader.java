package com.kea;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class JDBCReader {

    // cn skal ind her?? som en referrence

    public String readFromDB(String sql) {
        JDBCWriter.connectDB();

        return sql;
    }

   /* public String printTableFromDB(String table){
        JDBCWriter.connectDB();

        String printTable = "SELECT * FROM football_club.?;";
        PreparedStatement preparedStatement;
        try {
            preparedStatement = cn.prepareStatement(printTable);
            preparedStatement.executeUpdate();
        } catch (SQLException err) {
            System.out.println("Update Error: " + err.getMessage());
        }
        return printTable;
    }*/
}
