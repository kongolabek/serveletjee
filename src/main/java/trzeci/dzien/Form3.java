package trzeci.dzien;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/getForm3")
public class Form3 extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String number = request.getParameter("page");

        String dzielniki = "";

        for(int i = 1; i <= Integer.parseInt(number); i++){
            if(Integer.parseInt(number)%i == 0){
                dzielniki += i + " ";
            }
        }
        response.getWriter().append(dzielniki);

    }
}
