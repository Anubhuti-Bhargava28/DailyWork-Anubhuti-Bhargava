package com.cts.task;

import java.util.Scanner;

public class DuplicateElements {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size");
		int input = sc.nextInt();
		int arr[] = new int[input];
	
		int count=0;
		System.out.println("Enter elements in array");
		for (int i = 0; i < input; i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println("Array Entered");
		for (int i = 0; i < input; i++) {
			System.out.println(arr[i]);
		}
		for(int j=0;j<input;j++) {
			for (int k=j+1;k<input;k++) {
				if(arr[j]==arr[k]){
				count++;
				break;}
			}
		}
		System.out.println("Duplicate Elements in array: "+count);
	}

}
