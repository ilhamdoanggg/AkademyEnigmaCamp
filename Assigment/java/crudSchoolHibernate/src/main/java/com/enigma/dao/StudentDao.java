package com.enigma.dao;

import com.enigma.config.HibernateConfiguration;
import com.enigma.model.Student;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import java.util.Date;
import java.util.List;

public class StudentDao {

    public static void create(Student student) {
        SessionFactory sessionFactory = HibernateConfiguration.getSessionFactory();
        Session session = sessionFactory.getCurrentSession();
        session.beginTransaction();
        session.save(student);
        session.getTransaction().commit();
        session.close();
    }

    public static List<Student>getById(Integer id){
        SessionFactory sessionFactory = HibernateConfiguration.getSessionFactory();
        Session session = sessionFactory.getCurrentSession();
        session.beginTransaction();
        List<Student> students = session.createQuery("from com.enigma.model.Student where id ="
                +id+"").getResultList();
        session.getTransaction().commit();
        session.close();
        return students;
    }


    public  void getStudents(){
        Session session = HibernateConfiguration.getSessionFactory().getCurrentSession();
        session.beginTransaction();
        List<Student> students = session.createQuery("from com.enigma.model.Student")
                .getResultList();
        for (Student student: students) {
            System.out.println(student.toString());
        }
    }

    public static void update(Student student) {
        SessionFactory sessionFactory = HibernateConfiguration.getSessionFactory();
        Session session = sessionFactory.getCurrentSession();
        session.beginTransaction();
        session.update(student);
        session.getTransaction().commit();
        session.close();
    }

    public void deleteStudent(int student_id){
        Session session = HibernateConfiguration.getSessionFactory().getCurrentSession();
        session.beginTransaction();
        Student student =  session.load(Student.class, new Integer(student_id));
        session.getTransaction().commit();
    }
}
