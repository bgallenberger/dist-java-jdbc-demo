package edu.wctc;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.*;

@WebServlet(name = "ControllerServlet",
        urlPatterns = "/hidden")
public class ControllerServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String page = request.getParameter("page");
        switch (page){
            case "1":
                request.getRequestDispatcher("one.jsp").forward(request, response);
                break;
            case "2":
                request.getRequestDispatcher("two.jsp").forward(request, response);
                break;
            case "3":
                request.getRequestDispatcher("three.jsp").forward(request, response);
                break;
            case "4":
                request.getRequestDispatcher("four.jsp").forward(request, response);
                break;
            default:
                request.getRequestDispatcher("notFound.jsp").forward(request, response);
        }
    }
}
