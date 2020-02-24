package com.cts.task.DataBaseEmployeeSystem.Controller;

import java.io.BufferedReader;

import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

import com.cts.task.DataBaseEmployeeSystem.DAO.EmployeeDAO;
import com.cts.task.DataBaseEmployeeSystem.DAO.EmployeeDAOImpl;
import com.cts.task.DataBaseEmployeeSystem.bean.Employee;

public class EmployeeController {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new
		        InputStreamReader(System.in));
		        
		int continue_loop = 1;
		
		
		EmployeeDAO empObj = new EmployeeDAOImpl();
		List<Employee> list = empObj.getAllEmployees();
		System.out.println("Employment Management System");
		System.out.println("Operations to get Performed");

		
	
		do {
				System.out.println("Press 1 to add employee");
			System.out.println("Press 2 to delete employee");
			System.out.println("Press 3 to update employee details");
			System.out.println("Press 4 to see  particular employee");
			System.out.println("Press 5 to see all employee details");
				int i = Integer.parseInt(br.readLine());
		switch (i) {
		case 1:
			System.out.println("Enter Employee ID");
			int id =Integer.parseInt(br.readLine());
			System.out.println("Enter Employee Name");
			String nm = br.readLine();
			System.out.println("Enter Employee Address");
			String ad = br.readLine();
			System.out.println("Enter Employee Designation");
			String dsg =br.readLine();
			System.out.println("Enter Employee Age");
			int ag =Integer.parseInt(br.readLine());
			System.out.println("Enter Employee Salary");
			int sal =Integer.parseInt(br.readLine());
			System.out.println("Enter Employee Mobile");
			long mob = Long.parseLong(br.readLine());
			Employee emp = new Employee(id, nm, ad, ag, mob,dsg, sal);
			empObj.saveEmployee(emp);
			System.out.println("Do yo want to continue if yes press 1 else press 0");
			int r= Integer.parseInt(br.readLine());
			if(r==1)
			continue_loop = 1;
			else 
				continue_loop = 0;
			break;
		case 2:
			System.out.println("Enter the id of employee to delete data");
			int f =Integer.parseInt(br.readLine());
			Employee obj = empObj.getEmployeeById(f);
			empObj.deleteEmployee(obj);
			System.out.println("Do yo want to continue if yes press 1 else press 0");
			int j= Integer.parseInt(br.readLine());
			if(j==1)
			continue_loop = 1;
			else 
				continue_loop = 0;
				break;
		case 3:
			System.out.println("Enter the id of employee to update data");
			int g = Integer.parseInt(br.readLine());
			Employee obj1 = empObj.getEmployeeById(g);
			System.out.println("Enter name");
			String y = br.readLine();
			obj1.setName(y);
			empObj.updateEmployee(obj1);
			System.out.println("Do yo want to continue if yes press 1 else press 0");
			int p= Integer.parseInt(br.readLine());
			if(p==1)
			continue_loop = 1;
			else 
				continue_loop = 0;
			break;
		case 4:
			System.out.println("To show the detail of particular employee enter the id");
			int h = Integer.parseInt(br.readLine());
			Employee obj2 = empObj.getEmployeeById(h);
			System.out.println("Details:");
			System.out.println(obj2);
			System.out.println("Do yo want to continue if yes press 1 else press 0");
			int l= Integer.parseInt(br.readLine());
			if(l==1)
			continue_loop = 1;
			else 
				continue_loop = 0;
			break;
		case 5:
			System.out.println("To show the details of employees ");
			System.out.println("Details:");
			list.forEach(System.out::println);
			System.out.println("Do yo want to continue if yes press 1 else press 0");
			int k= Integer.parseInt(br.readLine());
			if(k==1)
			continue_loop = 1;
			else 
				continue_loop = 0;
			break;
		default:
			System.out.println("Invalid Input");
			break;
		}

		
		 }
		 while (continue_loop !=0);

	}

}
