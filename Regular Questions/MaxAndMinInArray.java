package com.cts.task;

import java.util.Scanner;

public class MaxAndMinInArray {

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
		int max=arr[0],min=arr[0];
		for (int i = 0; i < input; i++) {
		   for(int j=i+1;j<=input;j++) {
			   if(arr[i]>max) {
				   max=arr[i];
			   }
			   if(arr[i]<min) {
				   min=arr[i];
			   }
		   }
		}
		System.out.println(" ");
		System.out.println("Maximum : "+max+"Minimum: "+min);

	}

}
