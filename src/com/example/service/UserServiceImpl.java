package com.example.service;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.example.controller.DBUtility;
import com.example.pojo.User;

public class UserServiceImpl implements UserService {

		public int store(User user) {
			int status = 0;
			try {
				Connection con = DBUtility.establishConnection();
				String query = "insert into user_details(Name,Password,mobile, Email, dob) values(?,?,?,?,?)";
//				String oracleQuery = "insert into user_details values(user_seq.nextval,?,?,?)";
				PreparedStatement pstmt = con.prepareStatement(query);
				pstmt.setString(1, user.getName());
				pstmt.setString(2, user.getPassword());
				pstmt.setDouble(3, user.getMobile());
				pstmt.setString(4, user.getEmail());
				pstmt.setDate(5, Date.valueOf(user.getDob()));
				status = pstmt.executeUpdate();
				pstmt.close();
				con.close();
			}catch(Exception e) {
				e.printStackTrace();
			}
			return status;
		}

		@Override
		public User login(String email, String password) {
			User user = null;
			try { 
				Connection con = DBUtility.establishConnection();
				String query = "select * from user_details where email = ? and password = ?";
//				String oracleQuery = "insert into user_details values(user_seq.nextval,?,?,?)";
				PreparedStatement pstmt = con.prepareStatement(query);
				pstmt.setString(1, email);
				pstmt.setString(2, password);
				ResultSet rs = pstmt.executeQuery();
				while(rs.next()) {
					user = new User(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getDouble(4), rs.getString(5), rs.getDate(6).toLocalDate());
				}
				pstmt.close();
				con.close();
			} catch(Exception e) {
				e.printStackTrace();
							
			}
			return  user;
		}
	}

