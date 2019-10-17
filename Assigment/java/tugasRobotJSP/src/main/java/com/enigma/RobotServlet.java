package com.enigma;

import com.enigma.model.Direction;
import com.enigma.model.Robot;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class RobotServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String cordx = req.getParameter("cordx");
        String cordy = req.getParameter("cordy");
        String direction = req.getParameter("direction");

        String fuel =req.getParameter("fuel");

        String command = req.getParameter("command");

        Robot robot = new Robot(Integer.parseInt(cordx),
                Integer.parseInt(cordy), Direction.valueOf(direction));

        robot.move(robot.setCommand(command));
        robot.run();
        req.setAttribute("contrasol", robot.getPos());
        req.getRequestDispatcher("/robot/hasilrobot.jsp").forward(req,resp);
    }
}
