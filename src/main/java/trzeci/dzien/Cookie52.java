package trzeci.dzien;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.net.URLEncoder;

@WebServlet("/cookie52")
public class Cookie52 extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {


        Cookie[] cookies = request.getCookies();
        String userCookiesValue = "";


        try{
        if(cookies.length > 0) {
            for (Cookie c : cookies) {
                userCookiesValue = c.getName();
                if (c.getName().equals("cookie51")) {
                    //valueExists = true;
                    c.setMaxAge(0);
                    response.addCookie(c);
                }
            }
        }
        }catch (NullPointerException e){
            String message = "Nie odwiedziles jeszcze tej strony";
            response.sendRedirect("cookie51?msg=FirstVisitCookie51" + URLEncoder.encode(message, "UTF-8"));
        }
        response.getWriter().append("Ciasteczko zostalo usuniete");

    }
}
