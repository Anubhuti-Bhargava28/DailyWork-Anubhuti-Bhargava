package com.cts.task;

public class ABC {
public int i;
public ABC(int i) {
	this.i=i;
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ABC a= new ABC(334);
ABC b = a;
b.i=988;
System.out.println(b.i+"\t"+a.i);
	}

}
