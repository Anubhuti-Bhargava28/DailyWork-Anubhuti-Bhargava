package com.cts.task;
import java.util.*;
public class StringSorting {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String str = input.next();
		char temp[]= str.toCharArray();
	   Arrays.sort(temp);
	   
	   String s = new String(temp);
	   System.out.println(s);
	}

}
