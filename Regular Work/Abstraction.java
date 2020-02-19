package com.cts;

abstract class W{
	public void display() {
		System.out.println("x");
		
	}
	abstract public int sleepingHours();
}
class Child extends W{
	
	public String sings() {
		return "Hindi";
	}
	public int sleepingHours() {
		return 1;
	}
}
public class Abstraction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
W x= new Child();
System.out.println(x.sleepingHours());

	
	}

}
