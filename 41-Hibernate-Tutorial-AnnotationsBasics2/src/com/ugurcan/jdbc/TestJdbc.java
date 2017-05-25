package com.ugurcan.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;


public class TestJdbc {

	public static void main(String[] args) {

		String jdbcUrl = "jdbc:mysql://localhost:3306/hb_student_tracker?useSSL=false";
		String user = "root";
		String pass = "root";
		
		try {
			System.out.println("Connecting to database ... " + jdbcUrl);
			
			Connection myConn=
				 DriverManager.getConnection(jdbcUrl, user, pass);
			
			System.out.println("Connectiong Succesful!!!");
			
		} catch (Exception exc) {
			exc.printStackTrace();
		}
	}

}
