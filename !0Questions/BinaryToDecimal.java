package com.cts.Questions;
import java.util.*;
public class BinaryToDecimal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your binary number: ");
		long num = sc.nextLong();
		int dec = 0, i = 0;
		long rem;
		while (num != 0) {
			rem = num % 10;
			num /= 10;
			dec += rem * Math.pow(2, i);
			i++;
		}
			System.out.printf("Decimal form of number is : "+dec);
	}

	

	
}
