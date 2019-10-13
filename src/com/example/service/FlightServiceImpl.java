package com.example.service;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Time;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import com.example.controller.DBUtility;
import com.example.pojo.Flight;

public class FlightServiceImpl implements FlightService {

	/**
	 *
	 */
	@Override
	public int store(Flight flight) {
		int status = 0;
		try {
			Connection con = DBUtility.establishConnection();
			String query = "insert into flight_details(flight_name,source,destination, doj, toj, fare, class, seats) values (?,?,?,?,?,?,?,?)";
//			String oracleQuery = "insert into user_details values(user_seq.nextval,?,?,?)";
			PreparedStatement pstmt = con.prepareStatement(query);
			pstmt.setString(1, flight.getFname());
			pstmt.setString(2, flight.getSource());
			pstmt.setString(3, flight.getDestination());
			pstmt.setDate(4, Date.valueOf(flight.getDoj()));
			pstmt.setTime(5, Time.valueOf(flight.getTime()));
			pstmt.setDouble(6, flight.getFare());
			pstmt.setString(7, flight.getCateogory());
			pstmt.setInt(8, flight.getSeats());
			status = pstmt.executeUpdate();
			pstmt.close();
			con.close();
		}catch(Exception e) {
			e.printStackTrace();
		}
		return status;
				
	}

	@Override
	public List<Flight> listall() {
		List<Flight> flight = new ArrayList<Flight>();
		try { 
			Connection con = DBUtility.establishConnection();
			String query = "select * from flight_details";
//			String oracleQuery = "insert into user_details values(user_seq.nextval,?,?,?)";
			PreparedStatement pstmt = con.prepareStatement(query);
			ResultSet rs = pstmt.executeQuery();
			while(rs.next()) {
				Flight u =  new Flight(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getDate(5).toLocalDate(), rs.getTime(6).toLocalTime(), rs.getInt(7), rs.getString(8), rs.getInt(9));
				flight.add(u);
			}
			//System.out.println(user);
			pstmt.close();
			con.close();
		} catch(Exception e) {
			e.printStackTrace();
						
		}
		return  flight;
	}

	@Override
	public List<Flight> findFlight(String source, String destination, LocalDate doj, String cateogory, int seats) {
		List<Flight> flight = new ArrayList<Flight>();
		try { 
			Connection con = DBUtility.establishConnection();
			String query = "select * from flight_details where source=? and destination=? and doj=? and class=? and seats > ?";
			PreparedStatement pstmt = con.prepareStatement(query);
			pstmt.setString(1, source);
			pstmt.setString(2, destination);
			pstmt.setDate(3, Date.valueOf(doj));
			pstmt.setString(4, cateogory);
			pstmt.setInt(5, seats);
			ResultSet rs = pstmt.executeQuery();
			while(rs.next()) {
				Flight u =  new Flight(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getDate(5).toLocalDate(), rs.getTime(6).toLocalTime(), rs.getInt(7), rs.getString(8), rs.getInt(9));
				flight.add(u);
			}
			
			//System.out.println(user);
			pstmt.close();
			con.close();
		} catch(Exception e) {
			e.printStackTrace();
						
		}
		return  flight;
	}

	@Override
	public Flight findName(int fid) {
		Flight flight = null;
		System.out.println(fid);
		try { 
			Connection con = DBUtility.establishConnection();
			String query = "select * from flight_details where flight_id = ?";
			PreparedStatement pstmt = con.prepareStatement(query);
			pstmt.setInt(1, fid);
			ResultSet rs = pstmt.executeQuery();
			while(rs.next()) {
				flight =  new Flight(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getDate(5).toLocalDate(), rs.getTime(6).toLocalTime(), rs.getInt(7), rs.getString(8), rs.getInt(9));
			}		
			pstmt.close();
			con.close();
		} catch(Exception e) {
			e.printStackTrace();
						
		}
		return  flight;
	}

}
