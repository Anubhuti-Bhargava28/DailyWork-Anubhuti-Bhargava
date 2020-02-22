package com.cts.Questions;

import java.util.*;

public class MultiplyFloating {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter two floating numbers");
		float first = input.nextFloat();
		float second = input.nextFloat();
		float product = first * second;
		System.out.println("The product is: " + product);
	}
}
