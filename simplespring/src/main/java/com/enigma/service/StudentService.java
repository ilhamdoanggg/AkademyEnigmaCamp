package com.enigma.service;

import com.enigma.constanta.Constant;
import com.enigma.dao.StudentDao;
import com.enigma.model.Student;

public class StudentService {
    StudentDao studentDao;

    public StudentService() {
    }
    public Integer countFemale(){
        int count =0;
        for (Student student:studentDao.getAll()){
            if (student.getGender().equals(Constant.getFEMALE())){
                count++;
            }
        }
        return  count;
    }

    public Integer countMale(){
        int count =0;
        for (Student student:studentDao.getAll()){
            if (student.getGender().equals(Constant.getMALE())){
                count++;
            }
        }
        return  count;
    }

    public void setStudentDao(StudentDao setStudentDao) {
        this.studentDao=setStudentDao;
    }
}
