package com.cts;

import java.util.Scanner;

public class Sum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a, b = 0, c, d, sum1 = 0;
		Scanner input = new Scanner(System.in);
		System.out.println("Enter Number");
		a = input.nextInt();
		while (a > 0) {
			d = a % 10;
			sum1 = sum1 + d;
			a = a / 10;
		}
		System.out.println(sum1);
	}

}
