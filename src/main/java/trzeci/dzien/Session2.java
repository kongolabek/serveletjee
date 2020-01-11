package trzeci.dzien;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet("/session2")
public class Session2 extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        HttpSession session = request.getSession();
        List<Double> oceny = (List<Double>) session.getAttribute("ocena");
        if(oceny == null){
            oceny = new ArrayList<>();
        }
        
        double ocena = Double.parseDouble(request.getParameter("ocena"));
        oceny.add(ocena);
        session.setAttribute("oceny", ocena);

        double sum = 0;
        for(Double mojaOcena : oceny){
            sum += mojaOcena;
            response.getWriter().append(mojaOcena.toString()).append(" ");
        }
        response.getWriter().append("srednia ").append(String.valueOf(sum/oceny.size()));


    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        response.getWriter()
                .append("<from action=\"/session2\"method=\"POST\">")
                .append("<input type =\"number\" name=\"ocena\">")
                .append("<input type =\"submit\">")
                .append("</form>");

    }
}
