package com.cts.training.testcases;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.cts.training.junitLearn.Calculator;

public class CalculatorTest {

	private static Calculator calculator;

	@BeforeClass
	public static void init() {
		calculator = new Calculator();
		System.out.println(("Object Created !!"));
	}

	@AfterClass
	public static void destroy() {
		calculator = null;
		System.out.println("Object Destroyed !!");
	}

	@Test
	public void test_add_success() {
		assertEquals(17, calculator.add(12, 5));
		System.out.println("Inside Add Test");
	}

	@Test
	public void test_sub_success() {
		assertEquals(7, calculator.sub(12, 5));
		System.out.println("Inside Test Sub");
	}

	@Test
	public void test_mul_success() {
		assertEquals(25, calculator.mul(5, 5));
		System.out.println("Inside Test mul");
	}

	@Test
	public void test_div_success() {
		assertEquals(2, calculator.div(12, 6));
		System.out.println("Inside Test div");
	}
	@Test
	public void test_prime_success() {
		assertEquals(true, calculator.prime(5));
		System.out.println("Inside Test prime");
	}
	@Test
	public void test_prime_fail() {
		assertEquals(false, calculator.prime(6));
		System.out.println("Inside Test prime fail");
	}

}
