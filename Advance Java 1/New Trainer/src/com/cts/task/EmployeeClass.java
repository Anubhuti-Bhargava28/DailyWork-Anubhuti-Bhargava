package com.cts.task;

import java.sql.*;

public class EmployeeClass {

	public static void main(String[] args) {

		EmployeeClass jdbcMysqlSelectExample = new EmployeeClass();
		Connection connection = jdbcMysqlSelectExample.getConnection();
		Statement statement = null;
		ResultSet rs = null;
		try {
			statement = connection.createStatement();
			statement.executeUpdate("INSERT INTO work (emp_name, emp_phone) VALUES('Manish','19000343434')");
			String query = "select * from work";
			PreparedStatement ps = connection.prepareStatement(query);
			rs = ps.executeQuery(query);
			int i = 1;
			while (rs.next()) {
				int id1 = rs.getInt(1);
				String name = rs.getString(2);
				long phone = rs.getLong(3
						);
				System.out.println("--------------------Employee " + i + " Data-----------------------" + "\n");
				System.out.println("ID: " + id1 + "\n" + "Name: " + name + "\n " + "Phone: " + phone + "\n");
				i++;
			}
		} catch (SQLException e) {
			System.out.println("SQLException Occured 1..");
		} finally {
			try {
				if (rs != null) {
					rs.close(); // close result set
				}
				if (statement != null) {
					statement.close(); // close statement
				}
				if (connection != null) {
					connection.close(); // close connection
				}
			} catch (SQLException e) {
				System.out.println("SQLException Occured 2..");
			}
		}
	}

	private Connection getConnection() {
		Connection con = null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			String url = "jdbc:mysql://localhost:3306/ctspune";
			con = DriverManager.getConnection(url, "root", "root");
		} catch (ClassNotFoundException e) {
			System.out.println("ClassNotFoundException Occured.1..");
		} catch (SQLException e) {
			System.out.println("SQLException Occured 3...");
		}
		return con;
	}
}