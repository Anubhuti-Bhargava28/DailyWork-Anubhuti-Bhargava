package com.cts.task;

import java.util.*;

public class StringSubString {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String s = input.nextLine();

		int l = s.length();
		String str[] = s.split("\\s");
		for (int i = 0; i < l; i++) {

			System.out.println(str[i]);

		}

	}

}
