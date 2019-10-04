package com.enigma;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Hello extends HttpServlet {

    private static Logger logger= Logger.getLogger(Hello.class.getName());

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        logger.log(Level.INFO, "Do Get Di panggil!!");
    }

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("Ini Di panggil!!!!");
        String name=req.getParameter("name");
        String output="<html>" +
                "<body>" +
                "<h1>Aing Macan"+name+"Maung</h1>" +
                "</body>" +
                "</html>";
        resp.setContentType("text/html");
        resp.getWriter().print(output);
        logger.log(Level.INFO, "Do Get Di panggil!!");
        /*System.out.println("ini Di panggil!!!");*/
    }

    @Override
    public void init() throws ServletException {
        super.init();
        logger.log(Level.INFO, "Do Get Di panggil!!");
    }
}
