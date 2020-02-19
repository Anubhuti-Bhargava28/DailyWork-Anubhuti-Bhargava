package com.cts.task;

import java.util.*;

public class Toggle {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String s = input.nextLine();
		char temp[] = s.toCharArray();

		int l = s.length();
		for (int i = 0; i < l; i++) {
			if (temp[i] >= 'A' && temp[i] <= 'Z')
				temp[i] = (char) (temp[i] + 'a' - 'A');
			else if (temp[i] >= 'a' && temp[i] <= 'z')
				temp[i] = (char) (temp[i] + 'A' - 'a');
		}
		System.out.println(String.valueOf(temp));
	}

}
