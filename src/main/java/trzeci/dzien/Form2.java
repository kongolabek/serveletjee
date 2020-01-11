package trzeci.dzien;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet("/post2")
public class Form2 extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        List<String> wulgaryzmy = new ArrayList<>();
        wulgaryzmy.add("cholera");
        wulgaryzmy.add("kurde");

        String text = request.getParameter("field1");
        String approved = request.getParameter("approved");
        boolean checkbox = (approved != null && approved.equals("on")) ? true : false;
        if(checkbox){
            response.getWriter().append(text);
        }else {

            //java 11
            for (String wulgaryzm : wulgaryzmy) {
                if (text.contains(wulgaryzm)) {
                    text = text.replaceAll(wulgaryzm, "*".repeat(wulgaryzm.length()));
                }
            }
            response.getWriter().append(text);
        }

    }


}
