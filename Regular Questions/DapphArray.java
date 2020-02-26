package com.cts.task;

import java.util.Scanner;

public class DapphArray {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter Length Of array");
		int length = input.nextInt();
		int a[] = new int[length];
		System.out.println("Enter Array");
		for (int i = 0; i < length; i++) {
			a[i] = input.nextInt();

		}

		boolean y = dapehnArray(a, length);
		if (y) {

			System.out.println("1");

		} else
			System.out.println("0");

	}

	static boolean dapehnArray(int a[], int length) {
		int flag = 0, count1 = 0, count2 = 0;
		for (int j = 0; j < length; j++) {
			if (a[j] % 2 != 0) {
				flag = 1;
			}
		}
		for (int k = 0; k < length; k++) {
			if (a[k] % 2 == 0 || a[k]==0) {
				count1++;
			} else
				break;
		}
		for (int h = length-1; h >= 0; h--) {
			if (a[h] % 2 == 0 || a[h]==0) {
				count2++;
			} else
				break;
		}
		if (flag == 1) {
			if (count1 == count2) {
				return true;
			} else {
				return false;
			}

		} else {
			return false;
		}
	}
}
