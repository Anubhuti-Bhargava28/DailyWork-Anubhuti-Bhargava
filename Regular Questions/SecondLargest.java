package com.cts.task;

import java.util.Scanner;

public class SecondLargest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size");
		int input = sc.nextInt();
		int arr[] = new int[input];
		int temp;
		int max = arr[0], second = arr[0];

		System.out.println("Enter elements in array");
		for (int i = 0; i < input; i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println("Array Entered");
		for (int i = 0; i < input; i++) {
			System.out.print(arr[i]);
		}
		for (int i = 0; i < input; i++) {
			for (int j = i + 1; j <= input; j++) {
				if (arr[i] > max) {

					second = max;
					max = arr[i];
				}

				else if (arr[i] > second && arr[i] != max) {
					second = arr[i];
				}
			}
		}
		System.out.println(" ");
		System.out.println("Second Largest Number Of Array is: "+second);

	}

}
