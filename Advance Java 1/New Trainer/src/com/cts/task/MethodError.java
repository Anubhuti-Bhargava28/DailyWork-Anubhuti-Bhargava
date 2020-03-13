package com.cts.task;

public class MethodError {

	public void add(int a, int b) {
		System.out.println("hi");
	}
	public void add(double c , double d) {
		System.out.println("hello ");
		}

	public void add(float c , float d) {
		System.out.println("bye ");
		}
	public static void main(String[] args) {
		MethodError m= new MethodError();
		m.add(30.34444444444F, 20.7444444444444444444444444F);
	}
}
