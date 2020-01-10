package pl.coderslab;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.swing.text.html.HTML;
import java.io.IOException;
import java.util.Map;

@WebServlet("/get4")
public class Get4 extends HttpServlet {


//    W projekcie stwórz servlet Get4, dostępny pod adresem /get4, oraz stronę HTML get4.html, w której umieścisz link do servletu z dodatkowymi parametrami:
//            ?company=coderslab&learn=php&learn=java&learn=ruby&learn=python
//
//    Po kliknięciu w link - ma nastąpić przekierowanie do servletu, który wyświetli informacje pobrane z parametrów w następujący sposób:
//
//    company:
//            - coderslab
//    learn:
//            - php
//  - java
//  - ruby
//  - python

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {


        Map<String, String[]> parameterMap = request.getParameterMap();

        for(Map.Entry<String, String[]> entry : parameterMap.entrySet()){
            response.getWriter().append(entry.getKey()).append("\n");
            for(String param : entry.getValue()){
                response.getWriter().append(" -  \n").append(param);
            }
            response.getWriter().append("\n");
        }
    }


    }

