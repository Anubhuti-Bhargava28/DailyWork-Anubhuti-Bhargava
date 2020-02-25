package com.cts.Questions;

import java.util.Scanner;

public class VowelsAndConsonant {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String : ");
		String sen = sc.nextLine();
		int v = 0, c = 0, d = 0, s = 0;

		sen = sen.toLowerCase();
		for (int i = 0; i < sen.length(); ++i) {
			char ch = sen.charAt(i);
			if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
				v++;
			} else if ((ch >= 'a' && ch <= 'z')) {
				c++;
			} else if (ch >= '0' && ch <= '9') {
				d++;
			} else if (ch == ' ') {
				s++;
			}
		}

		System.out.println("Vowels: " + v);
		System.out.println("Consonants: " + c);
		System.out.println("Digits: " + d);
		System.out.println("White spaces: " + s);
	}
}
