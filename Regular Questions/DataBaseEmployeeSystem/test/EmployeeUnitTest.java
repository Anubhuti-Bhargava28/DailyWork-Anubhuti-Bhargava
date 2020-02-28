package com.cts.task.DataBaseEmployeeSystem.test;

import static org.junit.Assert.assertEquals;

import java.util.List;

import javax.xml.bind.annotation.XmlRegistry;

import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

import com.cts.task.DataBaseEmployeeSystem.DAO.EmployeeDAO;
import com.cts.task.DataBaseEmployeeSystem.DAO.EmployeeDAOImpl;
import com.cts.task.DataBaseEmployeeSystem.bean.Employee;

public class EmployeeUnitTest {

	private static EmployeeDAO employeeDAO;
	private static Employee employee;

	@BeforeClass
	public static void init() {
		employee = new Employee();
		employeeDAO = new EmployeeDAOImpl();
	}

	@Ignore
	@Test
	public void test_add_employee_success() {
		Employee emp = new Employee(123, "Rohit", "Indore", 24, 98996502, "Mechanical Engineer", 23000);
		assertEquals(true, employeeDAO.saveEmployee(emp));
		System.out.println("Added Successfully");
	}

	@Ignore
	@Test
	public void test_getElementByID_employee_success() {
		Employee emp = employeeDAO.getEmployeeById(4);
		assertEquals("Ayushi", emp.getName());
		System.out.println("Name is true from get employee by id");
	}

	@Test(expected = NullPointerException.class)
	public void test_getElementByID_employee_fail() {
		Employee emp = employeeDAO.getEmployeeById(10);
		assertEquals("ugh", emp.getName());
		System.out.println("Wrong name get by get emplyee by id");
	}

	@Ignore
	@Test
	public void test_delete_employee_success() {
		Employee emp = employeeDAO.getEmployeeById(5);

		assertEquals(true, employeeDAO.deleteEmployee(emp));
		System.out.println("deleted Succesfully");
	}

	@Ignore
	@Test
	public void test_update_employee_success() {

		EmployeeDAO empObj = new EmployeeDAOImpl();
		Employee employee1 = empObj.getEmployeeById(1);
		employee1.setName("Purnima");
		empObj.updateEmployee(employee1);
		assertEquals(true, employeeDAO.updateEmployee(employee1));
	}

	@Ignore
	@Test
	public void test_getAllEmployee_success() {
		List<Employee> list = employeeDAO.getAllEmployees();
		assertEquals(8, list.size());
		// assertEquals("VijayNagr",list.get(3).getAddress());
	}

}
