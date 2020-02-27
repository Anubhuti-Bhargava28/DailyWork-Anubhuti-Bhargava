package com.cts.task;

import java.util.Scanner;

public class SeparateEvenOdd {

	public static void main(String[] args) {
		System.out.println("Enter size of array");
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		int arr[];
		int count = 0;
		arr = new int[size];
		int evenarr[] = new int[size];
		int oddarr[] = new int[size];
		int count1 = 0, count2 = 0;
		System.out.println("Enter Elements of Array");
		for (int i = 0; i < size; i++) {
			arr[i] = sc.nextInt();
		}
		for (int i = 0; i < size; i++) {
			if (arr[i] % 2 == 0) {
				evenarr[count1] = arr[i];
				count1++;
			} else {
				oddarr[count2] = arr[i];
				count2++;
			}
		}
		System.out.println("Even: ");
		for (int i = 0; i < count1; i++) {
			System.out.println(evenarr[i]);
		}
		System.out.println("Odd: ");
		for (int i = 0; i < count2; i++) {
			System.out.println(oddarr[i]);
		}
	}
}
