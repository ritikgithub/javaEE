package com.ritik.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.json.simple.JSONObject;

import com.mysql.cj.Session;
import com.ritik.dao.LoginDao;
import com.ritik.general.GeneralClass;


@WebServlet("/Login")
public class Login extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
    
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String username  = request.getParameter("username");
		String password = request.getParameter("password");
		response.setContentType("application/json");
		response.setCharacterEncoding("UTF-8");
		JSONObject obj = new JSONObject();
		GeneralClass obje  = new LoginDao().check(username, password);
		PrintWriter out = response.getWriter();
//		HttpSession session=   request.getSession();
//		session.setAttribute("name", "agareal");
		if(obje.getStatus()) {
			obj.put("status",200);
			obj.put("message","User Successfully Logged In");
//			Cookie ck = new Cookie("username", username);
//			response.addCookie(ck); 
			HttpSession session =  request.getSession();
			session.setAttribute("username", username);
			String jsonString = obj.toJSONString();		
			out.print(jsonString);
			out.flush();
		}
		else {
			obj.put("status",500);
			obj.put("message",obje.getMessage());
			String jsonString = obj.toJSONString();		
			out.print(jsonString);
			out.flush();
		}
	}
}
