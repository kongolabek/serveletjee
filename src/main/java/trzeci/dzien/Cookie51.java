package trzeci.dzien;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/cookie51")
public class Cookie51 extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        Cookie cookie = new Cookie("cookie51", "Coderslab");
        cookie.setMaxAge(60*60*24);
        response.addCookie(cookie);

        response.getWriter().append("<a href=\"cookie52\">Link do cookie52</a>").append("\n");

    }
}
