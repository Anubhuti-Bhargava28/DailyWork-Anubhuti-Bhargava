package com.cts;

class A {
	private int age;
	private double salary;
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
	void display() {
System.out.println("Salary:"+salary+"Age:"+age);
}
}


 class Encapsulation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
A a = new A();
 a.setAge(10);
 a.setSalary(12344.99);
 a.display();

}

}
