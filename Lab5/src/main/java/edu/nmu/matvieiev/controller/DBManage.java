package edu.nmu.matvieiev.controller;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
public class DBManage {
    private static Connection DbConnection;
    private DBManage() {}
    public static Connection getDbConnection() throws SQLException {
        if (DbConnection == null) {
            DbConnection = DriverManager.getConnection(
                    "jdbc:postgresql://localhost:5432/postgres",
                    "Vova",
                    "25.04.2003"
            );
        }
        return DbConnection;
    }
}
