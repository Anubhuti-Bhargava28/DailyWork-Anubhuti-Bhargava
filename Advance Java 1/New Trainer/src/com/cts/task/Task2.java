package com.cts.task;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

class C{
	private C(){
		
	}
	C(int a,int b){
		
	}
	public void task2() 
	{
		System.out.println("from task2 of class A");
	}
	
}
public class Task2 {
	

	static public  void main(String[] args) {
//	    Constructor<C> constructor = C.class.getDeclaredConstructor();
//        constructor.setAccessible(true);
//        C foo = constructor.newInstance();
    
//	foo.task2();	
	
//	C c= new C(4,5);
//	c.task2();	C c= new C(4,5);
//	
		String str1 ="java";
		String str2= new String("java");
		String str3 ="java";
		String str4= new String("java");
StringBuffer sb1= new StringBuffer("java");
StringBuffer sb2= new StringBuffer("java");

		
		if(sb1.equals(sb2)) {
			System.out.println("A");
						}
		else
			System.out.println("B");
		
//		Thread.sleep(89);
	}
}
