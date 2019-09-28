package com.enigma.service;

import com.enigma.config.HibernateConfig;
import com.enigma.model.Students;
import org.hibernate.Session;

import java.text.ParseException;
import java.util.Date;
import java.util.List;

/**
 * * Create at 9/25/2019 9:20 PM @author Ilhamdoanggg
 **/
public class StudentService {

    public static void create(Students students) {
        Session session = HibernateConfig.getSessionFactory().getCurrentSession();
        Date date= new Date();
        Students student = new Students();
        session.beginTransaction();
        session.getTransaction();
        session.save(student);
        session.getTransaction().commit();

    }

    public void getStudent(){
        Session session = HibernateConfig.getSessionFactory().getCurrentSession();
        session.beginTransaction();
        Students student = session.get(Students.class, 2) ;
        session.getTransaction().commit();
        System.out.println(student.toString());
    }

    public  void getStudents(){
        Session session = HibernateConfig.getSessionFactory().getCurrentSession();
        session.beginTransaction();
        List<Students> students = session.createQuery("from com.enigma.model.Student")
                .getResultList();
        for (Students student: students) {
            System.out.println(student.toString());
        }
    }
    /*
    * */
    public void updateStudent() throws ParseException {

        Session session = HibernateConfig.getSessionFactory().getCurrentSession();
        Date date = new Date();
        Students students = new Students();
        session.beginTransaction();
        session.update(students);
        session.getTransaction().commit();
    }


    public void deleteStudent(){
        Session session = HibernateConfig.getSessionFactory().getCurrentSession();
        Students student = new Students();
        session.beginTransaction();
        session.delete(student);
        session.getTransaction().commit();
    }
}
