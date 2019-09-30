package com.enigma;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class ApaKabar extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
      String angka1 = req.getParameter("angka1");
      String angka2 = req.getParameter("angka2");

      Integer hasil = Integer.parseInt(angka1) + Integer.parseInt(angka2);
      req.setAttribute("hasil", String.valueOf(hasil));
      req.getRequestDispatcher("/hasil/hasilnya.jsp").forward(req,resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String angka3 = req.getParameter("angka3");
        String angka4 = req.getParameter("angka4");

        Integer hasil = Integer.parseInt(angka3) + Integer.parseInt(angka4);
        req.setAttribute("hasil", String.valueOf(hasil));
        req.getRequestDispatcher("/hasil/hasilnya.jsp").forward(req,resp);
    }
}
