package com.enigma.service;

import org.junit.Assert.*;
import com.enigma.model.Students;
import org.hibernate.Session;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import static org.mockito.Mockito.*;

import java.util.Date;

import static org.hamcrest.CoreMatchers.instanceOf;
import static org.hamcrest.MatcherAssert.assertThat;

/**
 * * Create at 9/25/2019 9:46 PM @author Ilhamdoanggg
 **/
class StudentServiceTest {

    private final Integer id = 1;
    private final String  name = "nama", birthPlace="serang", gender="M";
    private final Date birthDate= new Date();
    Students students = new Students(id, name, birthPlace, birthDate, gender);

    private StudentService studentService = mock(StudentService.class);

    @Test
    public void testAddData(){
        when((studentService).equals(id));
    }
    @Test
    public void testSampleCreateDataStudents() {
        /*Students students = new Students();
        students.setId(1);
        students.setName("maa");
        if(students !=null){
            assertThat(StudentService.create(students),instanceOf(Students.class));
        }
*/
    }
}