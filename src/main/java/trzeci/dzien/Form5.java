package trzeci.dzien;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/post5")
public class Form5 extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {


        double degrees = Integer.parseInt(request.getParameter("degrees"));
//        String convertionToFahr = request.getParameter("convertionToFahr");
//        String convertionToCelc = request.getParameter("convertionToCelc");

        String convertion = request.getParameter("convertionType");

        if(convertion.equals("celcToFahr")){
            double TF = 32.0 + ((9.0/5.0)* degrees);
            response.getWriter().append("Celc to ").append(Double.toString(TF));
        }
        if(convertion.equals("FahrToCelc")){
            double TC = (5.0/9.0) * (degrees - 32.0);
            response.getWriter().append("Fahr to ").append(Double.toString(TC));
        }

    }
}
