package com.IncFor;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public LoginServlet() {
        super();
        
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter writer = response.getWriter();
		String uname=request.getParameter("uname");
		String upwd= request.getParameter("upwd");
		if(uname.equals("teja")&&upwd.equals("chinna"))
		{
			RequestDispatcher dispatcher = request.getRequestDispatcher("SucessServlet");
			dispatcher.forward(request, response);
		
		}
		else
		{
			writer.println("login failed try again");
			RequestDispatcher dispatcher = request.getRequestDispatcher("Login.html");
		    dispatcher.include(request, response);
		
		}
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
