package com.ritik.servlets;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ritik.dao.RegisterDao;

@WebServlet("/Register")
public class Register extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String name = request.getParameter("name");
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		RegisterDao rd  = new RegisterDao();
		boolean successful = rd.registerUser(username, name, password);
		if(successful) {
			request.setAttribute("name", name);
			RequestDispatcher rdd = request.getRequestDispatcher("RegisteredSuccessfully.jsp");
			rdd.forward(request, response);
		}
		else {
			response.sendRedirect("ErrorPage.jsp");
		}
	}

}
