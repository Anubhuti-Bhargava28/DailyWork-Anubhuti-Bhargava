package com.cts.task;

import java.util.*;

public class ReverseArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size");
		int input = sc.nextInt();
		int arr[] = new int[input];
		System.out.println("Enter elements in array");
		for (int i = 0; i < input; i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println("Array Entered");
		for (int i = 0; i < input; i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println(" ");
		System.out.println("Array after reversing");
		for (int j = input - 1; j >= 0; j--)

		{
			System.out.println(arr[j]);
		}
	}

}
