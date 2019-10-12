package com.example.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.example.pojo.Admin;
import com.example.service.AdminService;
import com.example.service.AdminServiceImpl;

/**
 * Servlet implementation class AdminServlet
 */
@WebServlet("/AdminServlet")
public class AdminServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Admin admin = null;
		AdminService as = new AdminServiceImpl();
		String email = request.getParameter("email");
		String password = request.getParameter("password");
		admin = as.login(email, password);
		if(admin != null) {
			HttpSession session=request.getSession();  
	        //session.setAttribute("name",admin.getAname());
	        session.setAttribute("a", admin);
			request.getRequestDispatcher("adminlogged.jsp").forward(request, response);
			
			} else {
				request.setAttribute("user", "Wrong Credentials");
				request.getRequestDispatcher("login.jsp").include(request, response);
			}
	}

}
