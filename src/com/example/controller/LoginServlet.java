package com.example.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.example.pojo.User;
import com.example.service.UserService;
import com.example.service.UserServiceImpl;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("Logged");
		User user = null;
		UserService us = new UserServiceImpl();
		String email = request.getParameter("email");
		String password = request.getParameter("password");
		user = us.login(email, password);
		if(user != null) {
		request.setAttribute("user", user);
		HttpSession session=request.getSession();  
        session.setAttribute("name",user.getName());
		request.getRequestDispatcher("logged.jsp").forward(request, response);
		} else {
			request.setAttribute("user", "Wrong Credentials");
			request.getRequestDispatcher("login.jsp").include(request, response);
		}
	}

}
