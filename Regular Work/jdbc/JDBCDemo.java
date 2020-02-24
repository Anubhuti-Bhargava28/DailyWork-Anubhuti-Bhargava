package com.cts.regularWork.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCDemo {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// 1.Load database driver
		// 1.1 By using forNAME() method which is inside the class Class

		Class.forName("com.mysql.jdbc.Driver");

		// 1.2

		// Driver driver= new com.mysql.jdbc.Driver();

		// 2. Establish the connection
		String url = "jdbc:mysql://localhost:3306/ctspune";
		Connection con = DriverManager.getConnection(url, "root", "root");
		System.out.println(con.getClass().getName());
		// Execute SQL Quesries
		Statement stmt = con.createStatement();
		// String query ="insert into employee value(1,'Asefs','indore',23,343445455)";
		// String query = "update emplyee set name= 'sdf' where id= 4";
//		String query = "delete from employee where id= 5";

//		int result = stmt.executeUpdate(query);
//		if (result > 0) {
//			System.out.println("inserted successfully");
//		} else {
//			System.out.println("Spomething went wrong");
//		}

		String query = "Select * from employee";
		ResultSet rs = stmt.executeQuery(query);
		while (rs.next()) {
			int id = rs.getInt(1);
			String name = rs.getString(2);
			String add = rs.getString(3);
			int age = rs.getInt(4);
			long phone = rs.getLong(5);
			System.out.println( rs.getInt("ID") + " " +  rs.getString("Name") + " " + rs.getString("Address") + " " +  rs.getInt("Age") + " " +  rs.getLong("Phone"));
			//System.out.println(id + " " + name + " " + add + " " + age + " " + phone);
		
		}
	}

}
