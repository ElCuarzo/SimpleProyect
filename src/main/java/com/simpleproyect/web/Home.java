package com.simpleproyect.web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Home")
public class Home extends HttpServlet {
	private static final long serialVersionUID = 1L;
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws
    ServletException, IOException {
    	String firstName = request.getParameter("firstName") != null ? request.getParameter("firstName") : "Unknown";
    	String lastName = request.getParameter("lastName") != null ? request.getParameter("lastName") : "Unknown";
    	String idioma = request.getParameter("idioma") != null ? request.getParameter("idioma") : "Unknown";
    	String ciudadNatal = request.getParameter("ciudad") != null ? request.getParameter("ciudad") : "Unknown";
    	
    	response.setContentType("text/html");
    	PrintWriter out = response.getWriter();
    	out.write("<h1> Bienvenido, " + firstName + " " + lastName + "</h1>");
    	out.write("<h3> Tu lenguaje favorito es: " + idioma + "</h3>");
    	out.write("<h3> Tu ciudad natal es: " + ciudadNatal + "</h3>");
    }
}
