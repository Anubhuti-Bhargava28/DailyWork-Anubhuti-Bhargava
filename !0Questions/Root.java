package com.cts.Questions;

import java.util.*;

public class Root {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter three numbers to find root");
		double a = input.nextDouble();
		double b = input.nextDouble();
		double c = input.nextDouble();

		double r1, r2;
		double det = b * b - 4 * a * c;
		if (det > 0) {
			r1 = (-b + Math.sqrt(det)) / (2 * a);
			r2 = (-b - Math.sqrt(det)) / (2 * a);
			System.out.format("root1 = %.2f and root2 = %.2f", r1, r2);
		}

		else if (det == 0) {
			r1 = r2 = -b / (2 * a);
			System.out.format("root1 = root2 = %.2f;", r1);
		}

		else {
			double rPart = -b / (2 * a);
			double iPart = Math.sqrt(-det) / (2 * a);
			System.out.format("root1 = %.2f+%.2fi and root2 = %.2f-%.2fi", rPart, iPart, rPart, iPart);
		}
	}
}
