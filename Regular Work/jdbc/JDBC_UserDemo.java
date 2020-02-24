package com.cts.regularWork.jdbc;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBC_UserDemo {

	public static void main(String[] args)
			throws ClassNotFoundException, SQLException, NumberFormatException, IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		/*
		 * System.out.print("Enter id:"); int id = Integer.parseInt(br.readLine());
		 */
		/*
		 * System.out.print("Enter name:"); String nm = br.readLine();
		 *//*
			 * System.out.print("Enter Address:"); String ad = br.readLine();
			 * System.out.print("Enter Age:"); int age = Integer.parseInt(br.readLine());
			 * System.out.print("Enter Phone:"); long mob = Long.parseLong(br.readLine());
			 */
		Class.forName("com.mysql.jdbc.Driver");
		String url = "jdbc:mysql://localhost:3306/ctspune";
		Connection con = DriverManager.getConnection(url, "root", "root");
		/*
		 * // System.out.println(con.getClass().getName()); Statement stmt =
		 * con.createStatement(); // String query = "create table UserTable(ID int
		 * primary key, Name varchar(50), // Address varchar(100),Age int, Phone long)";
		 * // String query ="insert into User value(7,'Harshal','indore',24,343445455)";
		 * // String query = "update User set name= 'Aman' where id= 4"; // String query
		 * = "delete from User where id= 7"; // int result = stmt.executeUpdate(query);
		 * // if (result > 0) { // System.out.println("Deleted successfully"); // } else
		 * { // System.out.println("Spomething went wrong"); // }
		 * 
		 * String query = "ALTER TABLE User ADD Purpose varchar(40) NOT NULL";
		 * stmt.executeUpdate(query);
		 * 
		 * // ResultSet rs = stmt.executeQuery(query); // while (rs.next()) { //
		 * System.out.println(rs.getInt("ID") + " " + rs.getString("Name") + " " +
		 * rs.getString("Address") + " " // + rs.getInt("Age") + " " +
		 * rs.getLong("Phone")); // // }
		 */
		// String query = "insert into employee values(?,?,?,?,?)";
		// String query = "update employee set name = ? where id = ?";
		// String query = "delete from employee where id = ?";
		String query = "select * from employee";
		PreparedStatement ps = con.prepareStatement(query);
		ResultSet rs = ps.executeQuery(query);
	int i=1;
		while (rs.next()) {
			int id1 = rs.getInt(1); 
			String name = rs.getString(2);
			String add =
			  rs.getString(3); 
			int age = rs.getInt(4);
			long phone = rs.getLong(5);
			System.out.println("--------------------Employee "+i+" Data-----------------------"+"\n");
			System.out.println("ID: "+id1+"\n" + "Name: " + name + "\n "+"Address: " + add + "\n " +"Age: "+ age + "\n " +"Phone: "+ phone+"\n");
			i++;
			// ps.setInt(1, id);

			/*
			 * ps.setString(3, ad); ps.setInt(4, age); ps.setLong(5, mob);
			 */
			// ps.executeUpdate();

		}
	}
}