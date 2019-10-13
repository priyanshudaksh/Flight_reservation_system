package com.example.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.example.pojo.Flight;
import com.example.service.FlightService;
import com.example.service.FlightServiceImpl;

/**
 * Servlet implementation class ListallFlightsServlet
 */
@WebServlet("/ListallFlightsServlet")
public class ListallFlightsServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
		FlightService fs = new FlightServiceImpl();
		List<Flight> flight = fs.listall();
		if(flight != null) {
			request.setAttribute("flight", flight);
			request.getRequestDispatcher("allflight.jsp").forward(request, response);
		}
	}

}
