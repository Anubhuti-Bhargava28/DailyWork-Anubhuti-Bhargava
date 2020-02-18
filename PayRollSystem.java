package com.cts;

import java.util.*;

import java.util.Scanner;

class Employee1 {
	private int mobileNumber;
	private int employeeId;
	private String name;
	private String designation;
	private String address;

	public int getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}



	public int getMobileNumber() {
		return mobileNumber;
	}

	public void setMobileNumber(int mobileNumber) {
		this.mobileNumber = mobileNumber;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

}

class Salary extends Employee1 {
	private int pay;
	int PF, DA, HRA, GrossPay, IncomeTax;
	double NetPay;

	public int getPay() {
		return pay;
	}

	public void setPay(int pay) {
		this.pay = pay;
	}

	double calculate() {
		double pf = (12 * pay)/100;
		double tax= (10*pay)/100;
		double hr= (2*pay);
		
		
		NetPay = pf + tax+ hr;

		return NetPay;
	}

}

public class PayRollSystem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		Salary e = new Salary();
		System.out.println("Enter ID:");
		e.setEmployeeId(input.nextInt());
		System.out.println("Enter Name:");
		e.setName(input.next());
		
		System.out.println("Enter Add:");
		e.setAddress(input.next());

		System.out.println("Enter Des:");
		e.setDesignation(input.next());
		System.out.println("Enter mob no,.:");
		e.setMobileNumber(input.nextInt());
		
		System.out.println("Enter Pay:");
		e.setPay(input.nextInt());
		
		int a = e.getEmployeeId();
	int b = e.getMobileNumber();
		String c = e.getAddress();
		String d = e.getDesignation();
		String f = e.getName();
		int p= e.getPay();
		
		double ctc= e.calculate();  

		System.out.println("employeeId: " + a );
		System.out.println( "Name " +f);
		System.out.println("Mob: " + b );
		System.out.println("Add: " + c);
		System.out.println("Desg: " + d);

		System.out.println("Pay: "+p);

		System.out.println("Net Pay: "+ctc);

	}

}
