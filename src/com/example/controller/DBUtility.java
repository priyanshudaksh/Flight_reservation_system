package com.example.controller;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBUtility {
	public static Connection establishConnection() 
			throws SQLException, ClassNotFoundException {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/sonoo", 
					"root", "Aa@12345");
			return con;
		}


		public static void main(String[] args) throws ClassNotFoundException, SQLException {
			Connection con = establishConnection();
			System.out.println(con);
		}

}
