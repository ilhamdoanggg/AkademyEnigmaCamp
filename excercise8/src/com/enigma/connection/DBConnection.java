package com.enigma.connection;

import java.sql.*;

/**
 * * Create at 9/23/2019 5:15 PM @author Ilhamdoanggg
 **/
public class DBConnection {

    static Connection connection;

    public static Connection letsCreateConnections(){
       try {
           connection= DriverManager.getConnection("jdbc:postgresql://127.0.0.1:5432/school", "postgres",
           "lake");
       } catch (SQLException e) {
           e.printStackTrace();
       }
        return connection;
    }
}
