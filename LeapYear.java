package com.cts;

import java.util.*;

public class LeapYear {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the  year:");
		int y = input.nextInt();

		int leap = 0;
		if (y % 4 == 0) {
			if (y % 100 == 0) {
				if (y % 400 == 0)
					leap = 0;
				else
					leap = 0;
			} else
				leap = 1;
		} else
			leap = 0;
		if (leap == 1)
			System.out.println(y + " is a leap year.");
		else
			System.out.println(y + " is not a leap year.");
	}
}
