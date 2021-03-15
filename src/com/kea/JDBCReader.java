package com.kea;

public class JDBCReader {

    public String readFromDB(String sql) {
        JDBCWriter.connectDB();

        return sql;
    }
}
