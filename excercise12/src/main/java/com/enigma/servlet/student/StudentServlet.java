package com.enigma.servlet.student;

import com.enigma.config.HibernateConfiguration;
import com.enigma.model.Student;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

public class StudentServlet extends HttpServlet {

    /*
    * get All Student
    * */
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        SessionFactory sessionFactory = HibernateConfiguration.getSessionFactory();
        Session session = sessionFactory.getCurrentSession();
        session.beginTransaction();
        List<Student> students = session.createQuery("from com.enigma.model.Student").getResultList();
        session.getTransaction().commit();
        req.setAttribute("hasil", students);
        req.getRequestDispatcher("student/student-list.jsp").forward(req,resp);
    }
}
