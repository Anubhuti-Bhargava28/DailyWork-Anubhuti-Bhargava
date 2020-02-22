package com.cts.Questions;

import java.util.*;

public class DecimalToOctal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter decimal number: ");
		int dec = sc.nextInt();

		int oNum = 0, i = 1;

		while (dec != 0) {
			oNum = oNum + (dec % 8) * i;
			dec = dec / 8;
			i = i * 10;
		}

		System.out.printf("Octal number is: " + oNum);

	}
}
