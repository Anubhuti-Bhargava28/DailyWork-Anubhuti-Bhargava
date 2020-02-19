package com.cts;

class Person {
	int salary;
	Person(int salary){
		this.salary=salary;
		System.out.println(salary);
	}
	void display() {
	
		System.out.println("Person");
	}
}

class Employee extends Person {
	Employee(int salary){
		super(salary);
		
	}
	void show() {
		System.out.println("Employee");
	}
}

class HR extends Employee {
	HR(int salary){
		super(salary);
		
	}
	void show1()
	{
		System.out.println("Employee can be HR");
	}
}

class Manager extends Employee {
	Manager(int salary){
		super(salary);
		
	}
	void show2() {
		System.out.println("Employee can be Manager");
	}
}

class Developer extends Manager {
	Developer(int salary){
		super(salary);
		
	}
	void show3() {
		System.out.println("Manager can be Developer");
	}
}

class Tester extends Manager {
	Tester(int salary){
		super(salary);
		
	}
	void show4() {
		System.out.println("Manager can be Tester");
	}
}

public class HierarchicalInheritance {
	public static void main(String args[]) {
		HR c = new HR(1000);
		
		c.show1();
		c.display();
		Manager d = new Manager(200090);
		d.show2();
		d.show();
		d.display();
		Developer e = new Developer(6899090);
		e.show2();
		e.show3();
		e.display();
		Employee g= new Employee(2000);

	}
}
