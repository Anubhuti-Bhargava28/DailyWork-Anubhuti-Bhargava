package com.cts.Questions;

import java.util.Scanner;

public class CharacterFrequency {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
    	System.out.println("Enetr String : ");
        String sen = sc.nextLine();
    	System.out.println("Enetr character to find frequency: ");
        String s = sc.next();
        char ch=s.charAt(0);
		int freq = 0;

		for (int i = 0; i < sen.length(); i++) {
			if (ch == sen.charAt(i)) {
				++freq;
			}
		}

		System.out.println("Frequency is : " + freq);
	}
}
