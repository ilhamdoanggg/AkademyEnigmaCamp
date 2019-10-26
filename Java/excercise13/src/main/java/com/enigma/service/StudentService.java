package com.enigma.service;

import com.enigma.model.Student;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class StudentService {

    List<Student>students=new  ArrayList<Student>();

    public void save(Student student){
        students.add(student);
    }

    public List<Student>getStudents(){
        return this.students;
    }
}
