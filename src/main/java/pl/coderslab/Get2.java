package pl.coderslab;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Map;

@WebServlet("/get2")
public class Get2 extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {


        Map<String, String[]> parameterMap = request.getParameterMap();

        for(Map.Entry<String, String[]> entry : parameterMap.entrySet()){
            response.getWriter().append(entry.getKey()).append(" : [");
            for(String param : entry.getValue()){
                response.getWriter().append(param).append(", ");
            }

            response.getWriter().append("]\n");
        }

    }
}
