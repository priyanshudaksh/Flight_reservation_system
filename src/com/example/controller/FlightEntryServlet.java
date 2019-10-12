package com.example.controller;

import java.io.IOException;
import java.sql.Time;
import java.time.LocalDate;
import java.time.LocalTime;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.example.pojo.Flight;
import com.example.service.FlightService;
import com.example.service.FlightServiceImpl;

@WebServlet("/FlightEntryServlet")
public class FlightEntryServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String name = request.getParameter("fname");
		String source = request.getParameter("fsrc");
		String destination = request.getParameter("fdes");
		LocalDate doj = LocalDate.parse(request.getParameter("fdate"));
		LocalTime time = LocalTime.parse(request.getParameter("ftime"));
		Double fare = Double.parseDouble(request.getParameter("ffare"));
		String fclass = request.getParameter("fclass");
		Flight flight = new Flight(-1, name, source, destination, doj, time, fare, fclass);
		FlightService fs = new FlightServiceImpl();
		int status = fs.store(flight);
		if (status>0) {
				request.setAttribute("status", "Saved Successfully");
				request.getRequestDispatcher("adminlogged.jsp").include(request, response);
		}
	}

}
