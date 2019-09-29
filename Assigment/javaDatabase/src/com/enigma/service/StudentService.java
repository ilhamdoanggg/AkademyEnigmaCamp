package com.enigma.service;

import com.enigma.connection.DBConnection;
import com.enigma.model.Students;
import sun.security.krb5.internal.tools.Klist;

import javax.security.auth.login.AccountException;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

/**
 * * Create at 9/23/2019 5:52 PM @author Ilhamdoanggg
 **/
public class StudentService {

    /*
    * metod insert atau tambah data
    *
    * @param id
    * */
    public static void create (Students students){
        Connection connection = DBConnection.letsCreateConnections();
        try {
            Statement statement = connection.createStatement();
            String sqlInsert="insert into students values("+students.getId()+","+
                    "'"+ students.getName()+"'"+","+
                    "'"+ students.getBirthPlace()+"'"+","+
                    "'"+ students.getBirthDate()+"'"+","+
                    "'"+ students.getGender()+"'"+")";

            statement.execute(sqlInsert);

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
/*
* menampilkan semua data yang ada di table student
*
* @return
* */
    public static List<Students> getAllStudents(){
        List<Students> students= new ArrayList<>();
        Connection connection= DBConnection.letsCreateConnections();
        try {
//            Statement statement =connection.createStatement();
            PreparedStatement preparedStatement = connection.prepareStatement("select *from students");
            ResultSet res=preparedStatement.executeQuery();
            for (int i = 0; true ; i++) {
                if (res.next()){
                    students.add(new  Students(res.getInt("Id_student")
                            ,res.getString("student_name")
                            ,res.getString("birth_place")
                            ,res.getDate("birth_date")
                            ,res.getString("gender")));
                }else{
                    break;
                }

            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return students;
    }

/*
* Method mencari data berdasarkan nama
*
* @return
* */
    public static List<Students> getSearchStudents(String students){
        List<Students> student= new ArrayList<>();
        Connection connection= DBConnection.letsCreateConnections();
        try {
            Statement statement =connection.createStatement();
            ResultSet res=statement.executeQuery("select *from students where student_name like " +
                    ""+"'%"+students+"%'");
            for (int i = 0; true ; i++) {
                if (res.next()){
                    student.add(new Students(res.getInt("Id_student")
                            ,res.getString("student_name")
                            ,res.getString("birth_place")
                            ,res.getDate("birth_date")
                            ,res.getString("gender")));
                }else{
                    break;
                }

            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return student;
    }
    /*
    * delete data berdasarkan ID
    * */
    public void delete(Students students) {
        String sqlDelete = "DELETE FROM students WHERE Id_student = ?";
        Connection connection= DBConnection.letsCreateConnections();
        try {

            PreparedStatement preparedStatement = connection.prepareStatement(sqlDelete);
            preparedStatement.setInt(1, students.getId());
            preparedStatement.executeUpdate();

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

}
