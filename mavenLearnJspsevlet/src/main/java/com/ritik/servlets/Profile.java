package com.ritik.servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.ritik.dao.GetUserDao;
import com.ritik.model.User;

/**
 * Servlet implementation class Profile
 */
//@WebServlet("/Profile")
public class Profile extends HttpServlet {
	private static final long serialVersionUID = 1L;
  
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		HttpSession session  =  request.getSession();
		String username = (String) session.getAttribute("username");
		if(username==null) {
			response.sendRedirect("Login_Page.jsp");
			return;
		}
		else {
			User user =  new GetUserDao().getUser(username);
			if(user==null) {
				response.sendRedirect("Login_Page.jsp");
				return;
			}
			request.setAttribute("user",user);
			request.getRequestDispatcher("/Profile.jsp").forward(request, response);
		}

}
}
