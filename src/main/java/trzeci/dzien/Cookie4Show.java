package trzeci.dzien;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/showAllCookies")
public class Cookie4Show extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {


        Cookie[] cookies = request.getCookies();
        String userCookiesValue = "";
        int i = 0;
        for(Cookie c : cookies){
            userCookiesValue = c.getValue();
            response.getWriter().append("<a href=\"removeCookie?cookieId="+i+"\">USUWAM ciasteczko o ID "+i+"</a>").append(System.getProperty("line.separator"));
            response.getWriter().append(System.getProperty("line.separator"));
            i++;
        }
        response.getWriter().append(userCookiesValue);


    }
}
