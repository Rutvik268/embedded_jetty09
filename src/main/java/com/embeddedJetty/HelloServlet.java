package com.embeddedJetty;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/home")
public class HelloServlet extends HttpServlet {
	 @Override
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
		 response.setContentType("text/html;");
		 response.getWriter().println("<h1> hello jetty 9 worki <h1>");
	
	}
}
