package com.Cokkie;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class DisplayServlet
 */
@WebServlet("/DisplayServlet")
public class DisplayServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public DisplayServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		
		PrintWriter writer = response.getWriter();
		
		String mobile= request.getParameter("mobile");
		String email= request.getParameter("email");
		
		
		Cookie [] c = request.getCookies();
		
		writer.println("user  name :" +c[0].getValue());
		writer.println("<br>");
		writer.println("user  age :" +c[1].getValue());
		writer.println("<br>");
		writer.println("user qualifications :" +c[2].getValue());
		writer.println("<br>");
		writer.println("user  designaton :" +c[0].getValue());
		writer.println("<br>");
		writer.println("user  mobile :" +mobile);
		writer.println("<br>");
		writer.println("user  email :" +email);
		writer.println("<br>");
		
		
		
	}

}
