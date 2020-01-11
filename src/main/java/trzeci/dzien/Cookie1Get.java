package trzeci.dzien;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/getCookie")
public class Cookie1Get extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {


        Cookie[] cookies = request.getCookies();
        String userCookiesValue = "";
        for(Cookie c : cookies){
            userCookiesValue = c.getValue();
        }
        response.getWriter().append(userCookiesValue);

    }
}
