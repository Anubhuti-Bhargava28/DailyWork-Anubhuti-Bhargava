package com.cts;

import java.util.*;

public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the number");
		int num = input.nextInt();
		int demo = 0;
		for (int i = 2; i <= num / 2; ++i) {
			// condition for nonprime number
			if (num % i == 0) {
				demo = 1;
				break;
			}
		}
		if (demo == 0)
			System.out.println(num + " is a prime number.");
		else
			System.out.println(num + " is not a prime number.");

	}
}
