package com.enigma.dao;

import com.enigma.model.Student;

import java.util.ArrayList;
import java.util.List;

public class StudentDao {

    List<Student>students=new ArrayList<>();

    public void save(Student student){
        students.add(student);
    }

    public Student getById(Integer id){
        Student found= null;
        for (Student student:students) {
            if (student.getId()==id){
                found=student;
                break;
            }
        }
        return found;
    }

    public List<Student> getAll(){
        return students;
    }

}
