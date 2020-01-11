package trzeci.dzien;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/post4")
public class Form4 extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {


//        Napisz formularz, zawierający trzy pola liczbowe: a, b i c.
//        Dopisz funkcjonalność, która po przesłaniu formularza wyliczy miejsca zerowe funkcji
//        kwadratowej zdefiniowanej poprzez podane w formularzu liczby (ax^2+bx+c).
//        Wyświetl wyliczone miejsca zerowe na stronie. W przypadku delta<0 servlet wyświetli odpowiedni komunikat.


        int a = Integer.parseInt(request.getParameter("number1"));
        int b = Integer.parseInt(request.getParameter("number2"));
        int c = Integer.parseInt(request.getParameter("number3"));

        double x1 = 0;
        double x2 = 0;

        int delta = b*b - (4*a*c);
        if(delta == 0){
            x1 = -b/(2*a);
            response.getWriter().append("miejsce zerowe to ").append(Double.toString(x1));
        }else if (delta > 0 ){
            x1 = (-b - Math.pow(delta, -2))/4*a;
            x2 = (-b + Math.pow(delta, -2))/4*a;
            response.getWriter().append("pierwsze miejsce zerowe to ").append(Double.toString(x1));
            response.getWriter().append(" \n");
            response.getWriter().append("drugie miejsce zerowe to ").append(Double.toString(x1));
        }else{
            response.getWriter().append("nie ma miejsc zerowych");
        }
    }

}
