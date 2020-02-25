package com.cts.Questions;

import java.util.Scanner;

public class TransposeMatrix {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter The Number Of Matrix Rows");

		int row = sc.nextInt();

		System.out.println("Enter The Number Of Matrix Columns");

		int col = sc.nextInt();
		int[][] matrix = new int[row][col];

		System.out.println("Enter Matrix Data");

		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				matrix[i][j] = sc.nextInt();
			}
		}

		int[][] transpose = new int[col][row];
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				transpose[j][i] = matrix[i][j];
			}
		}

		System.out.println("The matrix is: ");
		for (int[] r : matrix) {
			for (int c : r) {
				System.out.print(c + "    ");
			}
			System.out.println();
		}
		System.out.println("The matrix is: ");
		for (int[] r : transpose) {
			for (int c : r) {
				System.out.print(c + "    ");
			}
			System.out.println();
		}
	}
}
