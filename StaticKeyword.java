package com.cts;
 class Demo{
	 int x= 10;
	 static int y =30;
 static public void show() {
	 System.out.println(y);
 }
 }
public class StaticKeyword {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Demo d = new Demo();
		Demo d1 = new Demo();
		Demo d2 = new Demo();
		System.out.println("0");
		System.out.println(d.x);
		System.out.println(d.y);
		d2.x=50;
		d1.y=780;
		System.out.println("1");
		System.out.println(d1.x);
		System.out.println(d1.y);
	
		System.out.println("2");
		System.out.println(d2.x);
		System.out.println(d2.y);
	
	}

}
