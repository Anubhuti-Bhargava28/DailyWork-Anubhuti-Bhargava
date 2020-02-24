package com.cts.task.DataBaseEmployeeSystem.DAO;
import java.util.*;
import com.cts.task.DataBaseEmployeeSystem.bean.Employee;

public interface EmployeeDAO {
	public boolean saveEmployee(Employee employee);
	public boolean updateEmployee(Employee employee);
	public boolean deleteEmployee(Employee employee);
	public Employee getEmployeeById(int id);
	public List<Employee> getAllEmployees();
}
