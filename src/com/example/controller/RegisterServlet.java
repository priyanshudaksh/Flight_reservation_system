package com.example.controller;

import java.io.IOException;
import java.time.LocalDate;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.example.pojo.User;
import com.example.service.UserService;
import com.example.service.UserServiceImpl;

/**
 * Servlet implementation class RegisterServlet
 */

@WebServlet("/RegisterServlet")
public class RegisterServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		User user = null;
		UserService us = new UserServiceImpl();
		String name = request.getParameter("name");
		String password = request.getParameter("password");
		Double mobile = Double.parseDouble(request.getParameter("mobile"));
		String email = request.getParameter("email");
		LocalDate dob = LocalDate.parse(request.getParameter("dob"));
		user = new User(-1, name, password, mobile, email, dob);
		int status = us.store(user);
		System.out.println(status);
		if (status > 0) {
			request.setAttribute("msg", "stored successfully");
			request.getRequestDispatcher("login.jsp").forward(request, response);
		} else {
		request.setAttribute("msg", "sorry");
		request.getRequestDispatcher("Register.jsp").include(request, response);
	}
	}

}
