package com.cts.task;

import java.util.*;

public class EmployeeController {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int continue_loop = 1;
		System.out.println("Employment Management System");
		System.out.println("Operations to get Performed");
		System.out.println("Press 1 to add employee");
		System.out.println("Press 2 to delete employee");
		System.out.println("Press 3 to update employee details");
		System.out.println("Press 4 to see  particular employee");
		System.out.println("Press 5 to see all employee details");
		System.out.println("Press 6 if yop want to exit");
		int i = sc.nextInt();
		EmployeeDAOImpl empObj = new EmployeeDAOImpl();
		List<Employee> list = empObj.getAllEmployees();
		 while (continue_loop !=0) {
		switch (i) {
		case 1:
			System.out.println("Enter Employee ID");
			int id =Integer.parseInt(sc.nextLine());
			System.out.println("Enter Employee Name");
			String nm = sc.nextLine();
			System.out.println("Enter Employee Address");
			String ad = sc.nextLine();
			System.out.println("Enter Employee Designation");
			String dsg = sc.nextLine();
			System.out.println("Enter Employee Age");
			int ag =Integer.parseInt(sc.nextLine());
			System.out.println("Enter Employee Salary");
			int sal =Integer.parseInt(sc.nextLine());
			System.out.println("Enter Employee Mobile");
			long mob = Long.parseLong(sc.nextLine());
			Employee emp = new Employee(id, nm, ad, dsg, ag, sal, mob);
			empObj.addEmployee(emp);
			break;
		case 2:
			System.out.println("Enter the id of employee to delete data");
			int f = sc.nextInt();
			Employee obj = empObj.getEmployeeById(f);
			empObj.deleteEmployee(obj);
			break;
		case 3:
			System.out.println("Enter the id of employee to update data");
			int g = sc.nextInt();
			Employee obj1 = empObj.getEmployeeById(g);
			System.out.println("Enter name");
			String y = sc.next();
			//Employee e=obj1.setName(y);
			//empObj.updateEmployee(e);
			break;
		case 4:
			System.out.println("To show the detail of particular employee enter the id");
			int h = sc.nextInt();
			Employee obj2 = empObj.getEmployeeById(h);
			System.out.println("Details:");
			list.forEach(System.out::println);
			break;
		case 5:
			System.out.println("To show the details of employees ");
			System.out.println("Details:");
			list.forEach(System.out::println);
			break;
		case 6:
			
		          continue_loop = 0;
		        break;
		default:
			System.out.println("Invalid Input");
			break;
		}

		 }

		Employee obj = empObj.getEmployeeById(4234);
		// System.out.println(obj);

		list.forEach(System.out::println);

	}

}
