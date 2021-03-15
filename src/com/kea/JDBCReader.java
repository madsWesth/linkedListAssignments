package com.kea;

import java.sql.*;
import java.util.HashMap;

public class JDBCReader {

    public void printTableFromDB(String table) {
        PlayerLinkedList list = new PlayerLinkedList();

        try {
            Connection cn = DriverManager.getConnection
                    ("jdbc:mysql://127.0.0.1:3306/football_club?lingding=SERVER?serverTimezone=UTC", "lingding", "lol");
            Statement statement = cn.createStatement();

            //query that displays all records from table, "table"
            String q = "SELECT * FROM football_club."+table;
            ResultSet rs = statement.executeQuery(q);

            //print resultset
            if (rs.next()) {
                do {
                    int key = rs.getInt(1);
                    String firstName = rs.getString(2);
                    String lastName = rs.getString(3);
                    int age = rs.getInt(4);
                    String team = rs.getString(5);
                    Player player = new Player(key,firstName,lastName,age,team);
                    list.add(player);
                    //System.out.println(rs.getString(1) + "," + rs.getString(2) + ","
                      //      + rs.getString(3) + "," + rs.getString(4) + "," + rs.getString(5));
                } while (rs.next());
            } else {
                System.out.println("Record Not Found...");
            }
            cn.close();
        } catch (Exception e) {
            System.out.println(e);
        }
        System.out.println(list.toString());
    }
}
