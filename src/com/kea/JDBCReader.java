package com.kea;

import java.sql.PreparedStatement;
import java.sql.SQLException;

public class JDBCReader {

    public String readFromDB(String sql) {
        JDBCWriter.connectDB();

        return sql;
    }

    public String printTableFromDB(String table){
        JDBCWriter.connectDB();

        String printTable = "SELECT * FROM football_club.?;";
        PreparedStatement statement = prepareStatement(printTable);
        try {
            statement.setString(1, table);
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return printTable;
    }
}
