package com.cts;

import java.util.Scanner;

public class EvenOdd {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int n = reader.nextInt();
		if (n % 2 == 0)
			System.out.println(n + " is even");
		else
			System.out.println(n + " is odd");
	}
}
