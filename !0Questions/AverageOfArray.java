package com.cts.Questions;

import java.util.*;

public class AverageOfArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Length of array: ");

		int n = sc.nextInt();
		double sum = 0.0;
		double num[] = new double[n];
		System.out.println("Enter Array: ");
		for (int i = 0; i < n; i++) {
			num[i] = sc.nextDouble();
		}

		for (double a : num) {
			sum = sum + a;
		}

		double avg = sum / num.length;
		System.out.println("The average is: " + avg);
	}
}
