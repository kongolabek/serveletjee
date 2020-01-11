package trzeci.dzien;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/removeCookie")
public class Cookie4Delete extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {


        String cookieId = request.getParameter("cookieId");


//        boolean foundCookie = false;
        Cookie[] cookies = request.getCookies();
        Cookie doUsuniecia = cookies[Integer.parseInt(cookieId)];
        doUsuniecia.setMaxAge(0);
        response.addCookie(doUsuniecia);

//        if(!foundCookie){
//            response.getWriter().append("BRAK COOKIES");
//        }

    }
}
