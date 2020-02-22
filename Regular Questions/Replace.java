package com.cts.task;

import java.util.*;

public class Replace {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your string");
		String input = sc.nextLine();
		String new1 = null;
		String new2 = null;
		String new3 = null;
		String new4 = null;
		int l = input.length();
		for (int u = 0; u < l; u++) {
			if (input.contains("yes") || input.contains("why") || input.contains("today") || input.contains("you")) {

				input = input.replace("yes", "s");
				input = input.replace("why", "y");
				input = input.replace("today", "2day");
				input = input.replace("you", "u");
				System.out.println(input);

			}
		}
	}
}