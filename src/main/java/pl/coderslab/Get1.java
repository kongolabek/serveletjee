package pl.coderslab;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/get1")
public class Get1 extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String start = request.getParameter("start");
        String end = request.getParameter("end");

        if(start == null || end == null){
            response.getWriter().append("BRAK");
        }

        int startInt = Integer.parseInt(start);
        int endInt = Integer.parseInt(end);

        for(Integer i = startInt; i < endInt; i++){
            response.getWriter().append(i.toString()).append(" ");
        }

    }
}
