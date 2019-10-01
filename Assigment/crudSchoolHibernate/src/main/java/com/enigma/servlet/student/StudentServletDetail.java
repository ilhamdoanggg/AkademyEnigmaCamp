package com.enigma.servlet.student;

import com.enigma.config.HibernateConfiguration;
import com.enigma.dao.StudentDao;
import com.enigma.model.Student;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Date;
import java.util.List;

public class StudentServletDetail extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String id = req.getParameter("id");
        Integer hasil=Integer.parseInt(id);
        req.setAttribute("detail", StudentDao.getById(hasil));
        req.getRequestDispatcher("student/student-detail.jsp").forward(req,resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Integer id = Integer.parseInt( req.getParameter("id"));
        String name = req.getParameter("name");
        String birth_place = req.getParameter("birth_place");
        Date birth_date = java.sql.Date.valueOf(req.getParameter("birth_date"));
        String gender = req.getParameter("gender");
        Integer room=Integer.parseInt(req.getParameter("room"));
        Student student = new Student(id, name,birth_place,birth_date,gender, room);
        StudentDao.create(student);
        /* req.getRequestDispatcher("student/student-add.jsp").forward(req,resp);*/
        resp.sendRedirect("student.doang");
    }
}
