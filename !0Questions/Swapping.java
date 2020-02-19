package com.cts;

import java.util.*;

public class Swapping {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter two numbers:");
		int f = input.nextInt();
		int s = input.nextInt();

		int temp = f;

		f = s;

		s = temp;

		System.out.println("First number = " + f);
		System.out.println("Second number = " + s);
	}
}
