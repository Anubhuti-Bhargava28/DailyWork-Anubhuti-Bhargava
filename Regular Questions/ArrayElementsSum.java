package com.cts.task;

import java.util.Scanner;

public class ArrayElementsSum {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size");
		int input = sc.nextInt();
		int arr[] = new int[input];
		int sum=0;
		System.out.println("Enter elements in array");
		for (int i = 0; i < input; i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println("Array Entered");
		for (int i = 0; i < input; i++) {
			System.out.print(arr[i]);
		}
		for (int i = 0; i < input; i++) {
           	sum = sum+arr[i];
		}
		System.out.println(" ");
		System.out.println("Sum of elements of array: "+sum);
	}

}
