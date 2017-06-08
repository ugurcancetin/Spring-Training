package com.ugurcan.TestDB;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.sql.*;

@WebServlet("/TestDbServlet")
public class TestDB extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		//setup connection variables
		String user = "springcrud";
		String pass = "springcrud";

		String JdbcUrl = "jdbc:mysql://localhost:3306/web_customer_tracker?useSSl=false";
		String driver = "com.mysql.jdbc.Driver";

		//get connection to db
		try
		{
			PrintWriter out =response.getWriter();

			out.println( "Connecting to database...  ->   " + JdbcUrl );

			Class.forName(driver);
			Connection conn = DriverManager.getConnection( JdbcUrl, user, pass );

			out.println("Connection Successful!!!");

			conn.close();
		}
		catch( Exception e )
		{
			e.printStackTrace();
			throw new ServletException(e);
		}

	}

}
