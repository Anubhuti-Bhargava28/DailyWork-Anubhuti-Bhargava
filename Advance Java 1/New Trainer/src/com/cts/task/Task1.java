package com.cts.task;


class A{
	public A(int j) {
		int a=j;
System.out.println("A "+a);		
	}
}
	class B extends A{

		public B(int j) {
			super(j);
			
			
		}
 		
	}

public class Task1 {
public static void main(String[] args) {
	B b = new B(1);
	A a = new A(2);
}
}
