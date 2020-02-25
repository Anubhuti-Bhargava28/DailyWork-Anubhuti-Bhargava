package com.cts.Questions;

import java.util.*;

public class ArmstrongNumber {

	public static void main(String[] args) {
		int n, o, r, res = 0;
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the number:");
		n = input.nextInt();

		o = n;
		while (o != 0) {
			r = o % 10;
			res += Math.pow(r, 3);
			o /= 10;
		}
		if (res == n)
			System.out.println(n + " is an Armstrong number.");
		else
			System.out.println(n + " is not an Armstrong number.");
	}
}
