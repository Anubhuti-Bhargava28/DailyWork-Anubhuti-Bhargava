package com.cts.Questions;

import java.util.*;

public class AddMatrix {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter The Number Of Matrix Rows");

		int row = sc.nextInt();

		System.out.println("Enter The Number Of Matrix Columns");

		int col = sc.nextInt();
		int[][] matrix1 = new int[row][col];

		int[][] matrix2 = new int[row][col];

		System.out.println("Enter Matrix-1 Data");

		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				matrix1[i][j] = sc.nextInt();
			}
		}
		System.out.println("Enter Matrix-2 Data");

		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				matrix2[i][j] = sc.nextInt();
			}
		}

		int[][] sum = new int[row][col];
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				sum[i][j] = matrix1[i][j] + matrix2[i][j];
			}
		}

		System.out.println("Sum of two matrices is: ");
		for (int[] r : sum) {
			for (int c : r) {
				System.out.print(c + "    ");
			}
			System.out.println();
		}
	}
}
