package com.cts.Questions;

import java.util.*;

public class Palindrome {

	public static void main(String[] args) {

		int r = 0, rem, o;
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the  number:");
		int n = input.nextInt();

		o = n;

		while (n != 0) {
			rem = n % 10;
			r = r * 10 + rem;
			n = n / 10;
		}

		if (o == r)
			System.out.println(o + " is a palindrome.");
		else
			System.out.println(o + " is not a palindrome.");
	}
}
