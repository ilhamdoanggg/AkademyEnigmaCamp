package com.enigma.service;

import com.enigma.connection.DBConnection;
import com.enigma.model.Major;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 * * Create at 9/25/2019 2:40 AM @author Ilhamdoanggg
 **/

public class MajorService {
    /*
    * Create Data major
    * */

    public static void create (Major major){
        Connection connection = DBConnection.letsCreateConnections();
        try {
            Statement statement = connection.createStatement();
            String sqlInsert="insert into students values("+major.getIdMajor()+","+
                    "'"+ major.getManjorName()+"'"+")";
            statement.execute(sqlInsert);
            } catch (SQLException e) {
                e.printStackTrace();
            }
    }

    /*
     * menampilkan semua data yang ada di table major
     *
     * @return data major
     * */

    public static List<Major> getAllMajor(){
        List<Major> majors= new ArrayList<>();
        Connection connection= DBConnection.letsCreateConnections();
        try {
            Statement statement =connection.createStatement();
            ResultSet res=statement.executeQuery("select *from major");
            for (int i = 0; true ; i++) {
                if (res.next()){
                    majors.add(new Major(res.getString("Id_major")
                            ,res.getString("major_name")));
                }else{
                    break;
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return majors;
    }
}
