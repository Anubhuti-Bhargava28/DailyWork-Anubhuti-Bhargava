package com.cts.task;

import java.util.Scanner;

public class SortArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size");
		int input = sc.nextInt();
		int arr[] = new int[input];
		int temp;

		System.out.println("Enter elements in array");
		for (int i = 0; i < input; i++) {
			arr[i] = sc.nextInt();
		}
		System.out.print("Array Entered");
		for (int i = 0; i < input; i++) {
			System.out.print(arr[i]);
		}
		for (int j = 0; j < input; j++) {
			for (int k = j + 1; k < input; k++) {
				if (arr[j] > arr[k]) {
					temp = arr[j];
					arr[j] = arr[k];
					arr[k] = temp;

				}
			}
		}System.out.println(" ");
		System.out.println("Sorted Array IS: ");
		for (int i = 0; i < input; i++) {
			System.out.print(arr[i] + " ");
		}
	}

}
