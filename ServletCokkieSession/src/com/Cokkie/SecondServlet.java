package com.Cokkie;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class SecondServlet
 */
public class SecondServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SecondServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	String uqual =request.getParameter("uqual");
	String udesig =request.getParameter("udesig");
	
	Cookie cookie3 = new Cookie("uqual",uqual);
	Cookie cookie4 = new Cookie("udesig", udesig);
	
	response.addCookie(cookie3);
	response.addCookie(cookie4);
	
	RequestDispatcher dispatcher = request.getRequestDispatcher("Form3.html");
	dispatcher.forward(request, response);
	
	}

}
