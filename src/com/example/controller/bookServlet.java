package com.example.controller;

import java.io.IOException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.example.pojo.Flight;
import com.example.service.FlightService;
import com.example.service.FlightServiceImpl;

@WebServlet("/bookServlet")
public class bookServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("post");
		String source = request.getParameter("source");
		String destination = request.getParameter("destination");
		String cateogory = request.getParameter("cateogory");
		LocalDate doj = LocalDate.parse(request.getParameter("doj"));
		System.out.println(source);
		System.out.println(cateogory);
		List<Flight> flight = new ArrayList<Flight>();
		FlightService fs = new FlightServiceImpl();
		flight = fs.findFlight(source, destination, doj, cateogory);
		System.out.println(flight);
		if (flight != null) {
			request.setAttribute("flight", flight);
			HttpSession session=request.getSession();  
	        session.setAttribute("flight",flight);
			request.getRequestDispatcher("allflight.jsp").forward(request, response);
		}
	}
}