package com.cts.training.junitLearn;

public class Calculator {
	public int add(int a, int b) {
		return a + b;
	}

	public int sub(int a, int b) {
		if (a > b) {
			return a - b;
		} else
			return b - a;
	}

	public int mul(int a, int b) {

		return a * b;

	}
	public int div(int a, int b) {
		if (a > b) {
			return a / b;
		} else
			return b / a;
	}
	public boolean prime(int num) {
		boolean demo = true; 
		for (int i = 2; i <= num / 2; ++i) {
			// condition for nonprime number
			if (num % i == 0) {
				demo = false;
				
				break;
			}
		}
		return demo;
	}
}
