package com.ritik.servlets;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.mysql.cj.Session;
import com.ritik.dao.RegisterDao;

//@WebServlet("/Register")
public class Register extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String name = request.getParameter("name");
		String username = request.getParameter("username");
		String password = request.getParameter("password");
//		ServletConfig config =  getServletConfig();
//		System.out.println(config.getInitParameter("namee"));
//		ServletContext app =  getServletContext();
//		System.out.println(app.getInitParameter("jj"));
//		app.setAttribute("kbk", "876");
//		System.out.println(app.getAttribute("kbk"));
//		System.out.println(name+" "+username+" "+password+"***");
		HttpSession session =  request.getSession();
		System.out.println(session.getId());
		RegisterDao rd  = new RegisterDao();
		
		boolean successful = rd.registerUser(username, name, password);
		if(successful) {
			request.setAttribute("name", name);
			RequestDispatcher rdd = request.getRequestDispatcher("RegisteredSuccessfully.jsp");
			rdd.forward(request, response);
		}
		else {
//			HttpSession session = request.getSession();
//			session.setAttribute("name","ritik");
			response.sendRedirect("ErrorPage.jsp");
		}
	}

}
