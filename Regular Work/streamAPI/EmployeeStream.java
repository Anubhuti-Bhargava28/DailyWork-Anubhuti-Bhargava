package com.cts.regularWork.streamAPI;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import com.cts.regularWork.streamAPI.*;


public class EmployeeStream {

	public static void main(String[] args) {
		ArrayList<Employee> employees = new ArrayList<>();
		addEmployee(employees);

		// 1.Employees with agr greater than 30

		List<Employee> ageFilter = employees.stream().filter(e -> e.getAge() > 20).collect(Collectors.toList());
		System.out.println("Employees with age greater than 20");
		ageFilter.forEach(System.out::println);
//2. Employee sname staertr with n
		List<Employee> nameFilter = employees.stream().filter(e -> e.getName().startsWith("N"))
				.collect(Collectors.toList());
		System.out.println("Employees name starts wioth N ");
		nameFilter.forEach(System.out::println);
//3. salary increment
		List<Employee> salaryIncrement = employees.stream().map(e -> {
			double INCREMENT_SALARY;
			e.setSalary(e.getSalary() + (e.getSalary() * 1.15));
			return e;
		}).collect(Collectors.toList());

		System.out.println("Employees with incremented salary ");
		salaryIncrement.forEach(System.out::println);

		//4 even odd mr.mrs
		List<Employee> evenOdd = employees.stream().map(e -> {
			int i;
			if(e.getId()%2==0) {
			e.setName("Mr. "+e.getName());
			}
			else {
				e.setName("Mrs. "+e.getName());
			}
			return e;
		}).collect(Collectors.toList());

		System.out.println("Employees with NAME");
		evenOdd.forEach(System.out::println);
	
	
	}

	private static void addEmployee(ArrayList<Employee> employees) {
		Employee emp1 = new Employee(4234, "Vijay", "Bangalore", "Developer", 20, 41241.89, 79879798L);
		Employee emp2 = new Employee(2324, "Neeraj", "Mumbai", "Software Engineer", 21, 23434.89, 121313L);
		Employee emp3 = new Employee(9987, "Sakshi", "Indore", "Test Engineer", 49, 19889.80, 979879798L);
		Employee emp4 = new Employee(1234, "Neha", "Pune", "DevOps Engineer", 53, 68908.12, 43432222L);
		Employee emp5 = new Employee(1234, "Anubhuti", "Pune", "DevOps Engineer", 23, 68908.12, 43432222L);

		employees.add(emp1);
		employees.add(emp2);
		employees.add(emp3);
		employees.add(emp4);
		employees.add(emp5);
	}

}
