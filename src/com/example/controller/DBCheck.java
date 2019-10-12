package com.example.controller;

import java.sql.Connection;
import java.sql.SQLException;

public class DBCheck {
	public static void main(String[] args) {
		DBUtility db = new DBUtility();
		try {
			Connection con = db.establishConnection();
			System.out.println(con);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
