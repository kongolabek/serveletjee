package pl.coderslab;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "Servlet14", urlPatterns = {"/servlet14"})
public class Servlet14 extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        System.out.println("Hello Fourth Servlet");

        response.getWriter().append(request.getRemoteAddr());
        response.getWriter().append("\n");
        response.getWriter().append(request.getHeader("User-Agent"));

//        response.sendRedirect(request.getContextPath() + "/servlet13");


    }
}
