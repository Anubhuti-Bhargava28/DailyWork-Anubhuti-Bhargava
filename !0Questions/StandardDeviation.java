package com.cts.Questions;

import java.util.*;

public class StandardDeviation {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Length of array: ");

		int n = sc.nextInt();
		double num[] = new double[n];
		System.out.println("Enter Array: ");
		for (int i = 0; i < n; i++) {
			num[i] = sc.nextDouble();
		}
		double SD = calculateSD(num);

		System.out.format("Standard Deviation =" + SD);
	}

	public static double calculateSD(double numArray[]) {
		double sum = 0.0, standardDeviation = 0.0;
		int length = numArray.length;

		for (double num : numArray) {
			sum += num;
		}

		double mean = sum / length;

		for (double num : numArray) {
			standardDeviation += Math.pow(num - mean, 2);
		}

		return Math.sqrt(standardDeviation / length);
	}
}
