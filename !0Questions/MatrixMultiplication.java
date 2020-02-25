package com.cts.Questions;

import java.util.Scanner;

public class MatrixMultiplication {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter The Number Of Matrix-1  Rows");

		int row1 = sc.nextInt();

		System.out.println("Enter The Number Of Matrix-1 Columns");

		int col1 = sc.nextInt();
		System.out.println("Enter The Number Of Matrix-2 Rows");

		int row2 = sc.nextInt();

		System.out.println("Enter The Number Of Matrix-2 Columns");

		int col2 = sc.nextInt();
		int[][] matrix1 = new int[row1][col1];

		int[][] matrix2 = new int[row2][col2];

		System.out.println("Enter Matrix-1 Data");

		for (int i = 0; i < row1; i++) {
			for (int j = 0; j < col1; j++) {
				matrix1[i][j] = sc.nextInt();
			}
		}
		System.out.println("Enter Matrix-2 Data");

		for (int i = 0; i < row2; i++) {
			for (int j = 0; j < col2; j++) {
				matrix2[i][j] = sc.nextInt();
			}
		}

		int[][] product = new int[row1][col2];

		for (int i = 0; i < row1; i++) {
			for (int j = 0; j < col2; j++) {
				for (int k = 0; k < col1; k++) {
					product[i][j] = product[i][j] + matrix1[i][k] * matrix2[k][j];
				}
			}

			System.out.println("Product of two matrices is: ");
			for (int[] row : product) {
				for (int column : row) {
					System.out.print(column + "    ");
				}
				System.out.println();
			}
		}
	}

}
