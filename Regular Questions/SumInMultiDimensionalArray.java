package com.cts.task;

import java.util.*;

public class SumInMultiDimensionalArray {
	public static void sumRow(int arr[][]) {
		int sumRow = 0;
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 4; j++) {
				sumRow = sumRow + arr[i][j];

			}

			System.out.println("Sum of Row: " + i + " " + sumRow);
			sumRow = 0;
		}
	}

	public static void sumColumn(int arr[][]) {
		int sumColumn = 0;

		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 4; j++) {

				sumColumn = sumColumn + arr[j][i];
			}
			System.out.println("Column " + i + ":" + sumColumn);
			sumColumn = 0;
		}
	}

	public static void sumDiagonal(int arr[][]) {
		int sumDiagonal = 0;
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 4; j++) {
				if (i == j) {
					sumDiagonal = sumDiagonal + arr[i][j];
				}
			}

		}

		System.out.println("Sum of Diagonal is: " + sumDiagonal);
	}

	public static void sumfactors(int arr[][]) {
		int sumFactor = 0;

		for (int k = 0; k < 4; k++) {
			for (int l = 0; l < 4; l++) {
				if (arr[k][l] % 2 == 0 || arr[k][l] % 3 == 0) {
					sumFactor = sumFactor + arr[k][l];
				}

			}
			System.out.println("Sum Of Factor: " + sumFactor);
		}

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[][] arr = new int[4][4];
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 4; j++) {
				arr[i][j] = sc.nextInt();
			}
		}
		sumRow(arr);
		sumColumn(arr);
		sumDiagonal(arr);
		sumfactors(arr);

	}

}
