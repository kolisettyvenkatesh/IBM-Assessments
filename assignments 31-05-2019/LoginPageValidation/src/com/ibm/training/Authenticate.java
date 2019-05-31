package com.ibm.training;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/authenticate")
public class Authenticate extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html");

		if(request.getParameter("userName").equals("raj") && request.getParameter("userPass").equals("raj"))
		
		{
			response.getWriter().println("You just logged in..");
			
			request.getRequestDispatcher("/index.html").include(request,response);
		}
		
		else
		{
			response.getWriter().println("No User Found...");
			
			request.getRequestDispatcher("/index.html").include(request,response);
			
		}
	}

}
