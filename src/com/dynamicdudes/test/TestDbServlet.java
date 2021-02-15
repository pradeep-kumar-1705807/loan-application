package com.dynamicdudes.test;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import java.sql.*;

/**
 * Servlet implementation class TestDbServlet
 */
@WebServlet("/TestDbServlet")
public class TestDbServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		//setup connection varibles
		
		String user="loanapplicant";
		
		String pass="loan";
		
		String jdbcUrl= "jdbc:mysql://localhost:3306/loan?useSSL=false&serverTimeZone=UTC";
		
		
		
		String driver="com.mysql.jdbc.Driver";
		
		
		try
		{
			PrintWriter out=response.getWriter();
			
			out.println("Connecting to database"+jdbcUrl);
			
			Class.forName(driver);
			
			Connection myconn = DriverManager.getConnection(jdbcUrl,user,pass);
			
			out.println("succes!!");
			
			myconn.close();
			
		}
		catch(Exception exc)
		{
			exc.printStackTrace();
		}
		
		
		
			}

}
