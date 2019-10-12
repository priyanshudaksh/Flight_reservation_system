package com.example.service;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import com.example.controller.DBUtility;
import com.example.pojo.Admin;

public class AdminServiceImpl implements AdminService {
	Admin admin = null;
	@Override
	public Admin login(String email, String password) {
		try { 
			Connection con = DBUtility.establishConnection();
			String query = "select * from admin_details where aemail = ? and apassword = ?";
//			String oracleQuery = "insert into user_details values(user_seq.nextval,?,?,?)";
			PreparedStatement pstmt = con.prepareStatement(query);
			pstmt.setString(1, email);
			pstmt.setString(2, password);
			ResultSet rs = pstmt.executeQuery();
			while(rs.next()) {
				admin = new Admin(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5));
			}
			pstmt.close();
			con.close();
		} catch(Exception e) {
			e.printStackTrace();
						
		}
		return  admin;
	}

}
