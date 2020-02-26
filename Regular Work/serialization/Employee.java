package com.cts.regularWork.serialization;

import java.io.Serializable;
import java.lang.Comparable;

public class Employee implements Serializable{
/**
	 * 
	 */
	private static final long serialVersionUID = -994767776611260229L;
//	/implements Comparable<Employee>
 

	int id;
	String name;
	/*trasient*/String address;
	String designation;
	int age;
	double salary;
	long phone;

	public Employee() {

	}

	public Employee(int id, String name, String address,  int age, long phone,String designation, double salary) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
		this.age = age;
		this.phone = phone;
		this.designation = designation;
		
		this.salary = salary;
	
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public long getPhone() {
		return phone;
	}

	public void setPhone(long phone) {
		this.phone = phone;
	}
	
	  @Override public String toString() {
	  
		/*
		 * return "Employee [id=" + id + ", name=" + name + ", address=" + address +
		 * ", designation=" + designation + ", age=" + age + ", salary=" + salary +
		 * ", phone=" + phone + "]";
		 */
	return id + " : " + name + " : " + designation + " : " + address+ " : "+salary+" : "+phone+" : " +age;
	}
	

	/*
	 * @Override public int compareTo(Employee emp) { // TODO Auto-generated method
	 * stub if(this.age < emp.age) { return 1; } else if(this.age == emp.age) {
	 * return 0; } else { return -1; }
	 */

}
