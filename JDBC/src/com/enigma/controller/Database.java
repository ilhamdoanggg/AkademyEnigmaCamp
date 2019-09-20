package com.enigma.controller;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * * Create at 9/21/2019 2:48 AM @author Ilhamdoanggg
 **/
public class Database {
    String url = "jdbc:postgresql://localhost:5432/school";
    String user = "postgres";
    String password = "lake";

    public Database(){
        try (Connection konek = new DriverManager.getConnection(this.url, this.user, this.password);
             Statement stat = konek.createStatement();
             ResultSet rest = stat.executeQuery("SELECT VERSION()")) {

            if (rest.next()){
                System.out.println(rest.getString(1));
            }
        } catch (SQLException ex) {
            Logger lgr = Logger.getLogger();
            lgr.log(Level.SEVERE, ex.getMessage(), ex);
            ex.printStackTrace();
        }

    }
    }
