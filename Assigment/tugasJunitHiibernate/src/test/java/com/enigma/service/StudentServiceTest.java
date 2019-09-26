package com.enigma.service;

import com.enigma.model.Students;

import java.util.*;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.Assert.assertNull;
import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * * Create at 9/25/2019 9:46 PM @author Ilhamdoanggg
 **/
class StudentServiceTest {

    private final Integer id = 1;
    private final String  name = "nama", birthPlace="serang", gender="M";
    private final Date birthDate= new Date();
//    Students students = new Students(id, name, birthPlace, birthDate,  gender);


    //private StudentService studentService = mock(StudentService.class);




 /*   @Test
    public void testSampleCreateDataStudents() {
        Students students = new Students();
        students.setId(1);
        students.setName("maa");
        if(students !=null){
            assertThat(StudentService.create(students),instanceOf(Students.class));
        }

    }*/
}