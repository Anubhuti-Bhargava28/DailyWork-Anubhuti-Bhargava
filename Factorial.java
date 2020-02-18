package com.cts;

import java.util.*;

public class Factorial {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println(" Enter the number:");
		int n = input.nextInt();
		long fact = 1;
		for (int i = 1; i <= n; ++i) {

			fact = fact * i;
		}
		System.out.printf("Factorial of %d = %d", n, fact);
	}
}
