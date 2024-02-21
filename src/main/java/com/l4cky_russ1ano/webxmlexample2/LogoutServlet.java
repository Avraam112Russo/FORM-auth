package com.l4cky_russ1ano.webxmlexample2;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet(value = "/logout")
public class LogoutServlet extends HttpServlet {
    public void doGet(HttpServletRequest request, HttpServletResponse response){
        request.getSession().invalidate();
    }
}
