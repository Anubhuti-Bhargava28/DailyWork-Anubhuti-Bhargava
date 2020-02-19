package com.cts.Questions;

import java.util.*;

public class Reverse {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the number");
		int num = input.nextInt();
		int r = 0;
		while (num != 0) {
			int digit = num % 10;
			r = r * 10 + digit;
			num = num / 10;
		}
		System.out.println("Reversed Number: " + r);
	}

}
