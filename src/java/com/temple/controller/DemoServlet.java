
package com.temple.controller;

import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet({"/index","/contact-us"})
public class DemoServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String contextPath=request.getContextPath();
        //gives the name of the project
        String reqUrl =request.getRequestURI();
        //gives us the requested url
        String ipAddress=request.getRemoteAddr();
        //gives us the ip address of the client connected to the server
        if(request.getRequestURI().equals(contextPath+"/index")){
        RequestDispatcher rd=request.getRequestDispatcher("index.html");
        rd.forward(request,response);
        }
        else if(request.getRequestURI().equals(contextPath+"/contact-us"));{
                RequestDispatcher rd=request.getRequestDispatcher("contact.jsp");
        rd.forward(request,response);
   
            }
       
    }

    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
      
    }

   
}
