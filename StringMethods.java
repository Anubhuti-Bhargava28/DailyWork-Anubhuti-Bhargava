package com.cts;

public class StringMethods {

	public static void main(String[] args) {

		String str = "Welcome to Pune";
		char ch1 = str.charAt(0);
		char ch2 = str.charAt(5);
		System.out.println("Character at 0 index is: " + ch1);
		System.out.println("Character at 5th index is: " + ch2);

		String str1 = new String("Hello");
		String str2 = new String("Hi");

		System.out.println("str1 equals to str2:" + str1.equals(str2));

		System.out.println("str1 equals to str2:" + str1.equalsIgnoreCase(str2));
	

		int var1 = str1.compareTo(str2);
		System.out.println("str1 & str2 comparison: " + var1);

		str1 = str1.concat(" to ");
		str1 = str1.concat(" Pune ");
		System.out.println(str1);

		// Other way of doing concatenation in one line
		String str4= "This";
		str2 = str2.concat(" is").concat(" just a").concat(" String");
		System.out.println(str2);

		String str3 = new String("quick brown fox jumps over the lazy dog");
		System.out.println("Substring starting from index 1 and ending at 20:");
		System.out.println(str3.substring(1, 20));
	}
}
