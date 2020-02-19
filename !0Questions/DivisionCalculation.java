package com.cts.Questions;

import java.util.*;
import java.util.Scanner;

public class DivisionCalculation {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter numbers to dividend and divisor: ");
		int a = input.nextInt();
		int b = input.nextInt();

		int q = a / b;
		int rem = a % b;
		System.out.println("Quotient = " + q);
		System.out.println("Remainder = " + rem);
	}
}
