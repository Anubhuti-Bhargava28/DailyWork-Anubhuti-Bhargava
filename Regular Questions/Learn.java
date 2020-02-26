package com.cts.task;

class D{
	D()
	{
		super();
		System.out.println("1");
		
	}{
	
	System.out.println("2");
	}
	}
class B extends D{
	B(){
		super();
		System.out.println("3");
	}
	B(int a){
		this();
		System.out.println("4");
	}
	{
	System.out.println("5");
}
	}
public class Learn {

	public static void main(String[] args) {

		D a= new D();
		B b= new B();
		B c= new B(4);

	}

}
