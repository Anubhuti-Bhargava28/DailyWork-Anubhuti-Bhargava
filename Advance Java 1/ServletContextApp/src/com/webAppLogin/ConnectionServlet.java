package com.webAppLogin;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/ConnectionServlet")

public class ConnectionServlet extends HttpServlet {

	String user, password, driver, url;
	Connection con;
	ServletContext context;

	@Override
	public void init(ServletConfig config) throws ServletException {

		context = config.getServletContext();

		user = context.getInitParameter("userName");
		password = context.getInitParameter("password");
		url = context.getInitParameter("url");
		driver = context.getInitParameter("driver");
		try {
			/**
			 * this is for establishing a connection to  jdbc
			 */
			
			Class.forName(driver);
			con = DriverManager.getConnection(url, user, password);
			System.out.println(con);
			System.out.println(config + "from cs1");
			System.out.println(context + "from cs1");

		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("From  serivce");
	}

}
