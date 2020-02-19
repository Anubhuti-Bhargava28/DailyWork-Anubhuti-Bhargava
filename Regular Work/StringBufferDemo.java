package com.cts;

public class StringBufferDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuffer sb = new StringBuffer();
		System.out.println(sb.capacity()); // 16
		sb.append("Hello to java version 8");
		System.out.println(sb.capacity());
		sb.append("This is my version for developmenantr");
		System.out.println(sb.capacity());
		sb.insert(7, "Anu");
		System.out.println(sb);
		sb.replace(7, 20, "Helllo World");
		System.out.println(sb);
		sb.delete(5, 27);
		System.out.println(sb);
		sb.reverse();
		System.out.println(sb);
	}

}
