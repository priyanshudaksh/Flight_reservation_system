package com.example.service;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.Time;

import com.example.controller.DBUtility;
import com.example.pojo.Orders;

public class OrderServiceImpl implements OrderService {

	public int storeOrder(Orders order) {
		int status = 0;
		try {
			Connection con = DBUtility.establishConnection();
			String query = "insert into order_details(user_id, Username, flight_id, flight_name, source, destination, seats, DOJ, TOJ, Amount, class, passangers) values (?,?,?,?,?,?,?,?,?,?,?,?)";
//			String oracleQuery = "insert into user_details values(user_seq.nextval,?,?,?)";
			PreparedStatement pstmt = con.prepareStatement(query);
			pstmt.setInt(1, order.getUserid());
			pstmt.setString(2, order.getUsername());
			pstmt.setInt(3, order.getFlightid());
			pstmt.setString(4, order.getFlightname());
			pstmt.setString(5, order.getSource());
			pstmt.setString(6, order.getDestination());
			pstmt.setInt(7, order.getSeats());
			pstmt.setDate(8, Date.valueOf(order.getDoj()));
			pstmt.setTime(9, Time.valueOf(order.getToj()));
			pstmt.setDouble(10, order.getAmount());
			pstmt.setString(11, order.getCateogory());
			pstmt.setInt(12, order.getPassangers());
			status = pstmt.executeUpdate();
			pstmt.close();
			con.close();
		}catch(Exception e) {
			e.printStackTrace();
		}
		return status;
				
	}
	}
