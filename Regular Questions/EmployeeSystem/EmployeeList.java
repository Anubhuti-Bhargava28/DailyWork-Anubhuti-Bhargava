package com.cts.task.EmployeeSystem;

import java.util.ArrayList;
import java.util.Collections;

public class EmployeeList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Employee> list = new ArrayList<>();
		addEmployees(list);

		Collections.sort(list, new SortByDesignation()); // SortByAge
		//SortById()
		//SortByName()
		//SortByNumber()
		//SoryByAddress()

		// System.out.println(list);
		for (Employee emp : list) {
			System.out.println(emp);
		}

	}

	private static void addEmployees(ArrayList<Employee> list) {
		// TODO Auto-generated method stub
		Employee emp1 = new Employee(1001, "Anubhuti", "Indore", "Engineer", 20, 73334.74, 9425765830L);
		Employee emp2 = new Employee(1002, "Purva", "California", "Data Scientist", 21, 33334.74, 975228514L);
		Employee emp3 = new Employee(1003, "Ashutosh", "Noida", "Relationship Manager", 24, 863334.74, 8109636330L);
		Employee emp4 = new Employee(1004, "Dheeraj", "Gurgaon", "technical Recruiter", 23, 63334.74, 8827188275L);
		Employee emp5 = new Employee(1005, "Ayushi", "Indore", "System Engineer", 22, 23334.74, 7415134837L);
		list.add(emp1);
		list.add(emp2);
		list.add(emp3);
		list.add(emp4);
		list.add(emp5);
	}

}
