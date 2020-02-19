package com.cts.Questions;

import java.util.*;

public class PowerOfNumber {
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.println("Enter base and exponenetial");
		int b = input.nextInt();
		int e = input.nextInt();
		long res = 1;
		while (e != 0) {
			res = res * b;
			e--;
		}
		System.out.println(res);
	}

}
