package pl.coderslab;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Map;

@WebServlet("/get3")
public class Get3 extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {


//        W projekcie stwórz servlet Get3, dostępny pod
//    adresem /get3, który ma pobierać dwie zmienne o nazwach width i height.
//                Jeżeli informacje nie są przesłane to przyjmij, że: width = 5 i height = 10.


        String width = request.getParameter("width");
        String height = request.getParameter("height");

        if(width == null){
            width = "5";
        }

        if(height == null){
            height = "10";
        }

       // int[][] tab = new int[Integer.parseInt(width)][Integer.parseInt(height)];

        for(Integer i = 0; i < Integer.parseInt(width); i++){
            for(Integer j = 0; j < Integer.parseInt(height); j++){

                Integer mnoz = i *j;

                response.getWriter().append(mnoz.toString()).append("  ");
            }
            response.getWriter().append("\n");

        }





    }
}