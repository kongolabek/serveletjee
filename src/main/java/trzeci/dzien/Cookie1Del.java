package trzeci.dzien;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/delCookie")
public class Cookie1Del extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        boolean foundCookie = false;
        Cookie[] cookies = request.getCookies();
        for(Cookie c : cookies){
            foundCookie = true;
            c.setMaxAge(0);
            response.addCookie(c);
        }

        if(!foundCookie){
            response.getWriter().append("BRAK COOKIES");
        }

    }
}
