package pl.coderslab;

import javax.servlet.Servlet;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;

//    W projekcie stwórz servlet Servlet23, dostępny pod adresem /servlet23,
//    Servlet wczyta zawartość pliku oop.txt, a następnie wyświetli jego zawartość
//    na stronie. Jest to lista języków programowania, które wzorują się na
//    paradygmacie obiektowym pobrana z Wikipedii.


@WebServlet(name = "Servlet23", urlPatterns = {"/servlet23"})
public class Servlet23 extends HttpServlet{

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        System.out.println("Hello First Servlet");

        Scanner scan = new Scanner(new File("/home/konrad/workspace/serveletjee/src/main/java/pl/coderslab/oop.txt"));

        while(scan.hasNextLine()){
            response.getWriter().append(scan.nextLine());
            response.getWriter().append("\n");
        }



    }
}