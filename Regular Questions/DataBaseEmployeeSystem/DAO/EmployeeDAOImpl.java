package com.cts.task.DataBaseEmployeeSystem.DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.cts.task.DataBaseEmployeeSystem.bean.Employee;
import com.cts.task.DataBaseEmployeeSystem.DAO.EmployeeDAO;

public class EmployeeDAOImpl implements EmployeeDAO {

	Connection con = getConnection();
	PreparedStatement ps = null;

	private Connection getConnection() {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			String url = "jdbc:mysql://localhost:3306/ctspune";
			Connection con = DriverManager.getConnection(url, "root", "root");
			return con;
		} catch (Exception e) {
			return null;
		}
	}

	@Override
	public boolean saveEmployee(Employee employee) {
		String query = "insert into employee values(?,?,?,?,?,?,?)";
		try {
			ps= con.prepareStatement(query);
			ps.setInt(1, employee.getId());
			ps.setString(2, employee.getName());
			ps.setString(3, employee.getAddress());
			ps.setInt(4, employee.getAge());
			ps.setLong(5, employee.getPhone());
			ps.setString(6, employee.getDesignation());
			ps.setDouble(7, employee.getSalary());
			
			ps.executeUpdate();
			return true;
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		return false;
	}

	@Override
	public boolean updateEmployee(Employee employee) {
		String sql = "update employee set Name = ? where id =?";
		try {
			ps = con.prepareStatement(sql);
			ps.setInt(2, employee.getId());
			ps.setString(1, employee.getName());
			ps.executeUpdate();
			return true;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return false;
		}
		
	}

	@Override
	public boolean deleteEmployee(Employee employee) {
		String sql = "delete from employee where id =?";
		try {
			ps = con.prepareStatement(sql);
			ps.setInt(1, employee.getId());
			ps.executeUpdate();
			return true;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return false;
		}
		
		

	}

	@Override
	public Employee getEmployeeById(int id) {

		String sql ="select * from employee where id= ?";
		try {
			ps = con.prepareStatement(sql);
			ps.setInt(1, id);
			ResultSet rs= ps.executeQuery();
			Employee emp=null;
			while(rs.next()) {
		
		 emp = new Employee();
		emp.setId(rs.getInt("id"));
		emp.setName(rs.getString("name"));
		emp.setAddress(rs.getString("address"));
		emp.setPhone(rs.getLong("phone"));emp.setId(rs.getInt("ID"));
		emp.setName(rs.getString("Name"));
		emp.setDesignation(rs.getString("designation"));
		emp.setAddress(rs.getString("Address"));
		emp.setAge(rs.getInt("Age"));

		emp.setSalary(rs.getDouble("salary"));
		emp.setPhone(rs.getLong("Phone"));
			}
			return emp;
		}
		catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();}
		return null;
	}

	@Override
	public List<Employee> getAllEmployees() {
		List<Employee> employees = new ArrayList<Employee>();
		String query = "select * from employee";

		try {
			ps = con.prepareStatement(query);
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				Employee emp = new Employee();
				emp.setId(rs.getInt("ID"));
				emp.setName(rs.getString("Name"));
				emp.setDesignation(rs.getString("designation"));
				emp.setAddress(rs.getString("Address"));
				emp.setAge(rs.getInt("Age"));

				emp.setSalary(rs.getDouble("salary"));
				emp.setPhone(rs.getLong("Phone"));
				employees.add(emp);
			}
			return employees;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}
}
