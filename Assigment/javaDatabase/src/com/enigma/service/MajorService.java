package com.enigma.service;

import com.enigma.connection.DBConnection;
import com.enigma.model.Major;
import jdk.nashorn.internal.runtime.UnwarrantedOptimismException;

import java.sql.*;
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
        String sqlInsert= "insert into major valuse (?,?)";

        try {
            PreparedStatement preparedStatement = connection.prepareStatement(sqlInsert);
            preparedStatement.setString(1, major.getIdMajor());
            preparedStatement.setString(2, major.getManjorName());

            preparedStatement.executeUpdate();

            } catch (SQLException e) {
                e.printStackTrace();
            }
    }

    /*
     * menampilkan semua data yang ada di table major
     *
     * @return data major
     * */

    public static List<Major> getAllMajor() throws SQLException {
        String sqlSelect="select * from major";
        List<Major> majors= new ArrayList<>();
        Connection connection= DBConnection.letsCreateConnections();
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(sqlSelect);
            ResultSet res=preparedStatement.executeQuery();
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
