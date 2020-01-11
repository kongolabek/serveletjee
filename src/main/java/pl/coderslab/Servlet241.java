package pl.coderslab;


import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/servlet241")
public class Servlet241 extends HttpServlet {


//    protected void doGet(HttpServletRequest request, HttpServletResponse response)
//            throws ServletException, IOException {
//        response.sendRedirect(request.getContextPath() + "/servlet242");

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {


        for(int i = 0; i < 8; i++){
            response.getWriter().append("<a href=\"servlet242?productId="+i+"\">Servlet242- "+i+"</a>");
            response.getWriter().append("\n");
        }


//        String products[] = {
//                "Asus Transformr;2999.99",
//                "iPhone 6';3499.18",
//                "Converse Sneakers;125.00",
//                "LG OLED55B6P OLED TV;6493.91",
//                "Samsung HT-J4100;800.99",
//                "Alpine Swiss Dress Belt;99.08",
//                "60 Watt LED;1.50",
//                "Arduino Nano;3.26",
//        };
//
//    String productId = request.getParameter("productId");
//
//        if(productId == null){
//            response.getWriter().append("product not found");
//        }
//        else if(Integer.parseInt(productId) <= 7 && Integer.parseInt(productId) >= 0){
//            response.getWriter().append(products[Integer.parseInt(productId)]);
//        }
//        else{
//            response.getWriter().append("product not found");
//        }

    }

}
