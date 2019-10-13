package com.example.service;

import java.time.LocalDate;
import java.util.List;

import com.example.pojo.Flight;

public interface FlightService {
	public int store(Flight flight);
	public List<Flight> listall();
	public List<Flight> findFlight(String source, String destination, LocalDate doj, String cateogory, int seats);
	public Flight findName(int fid);
	
}
