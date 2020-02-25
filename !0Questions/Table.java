package com.cts.Questions;

import java.util.Scanner;

public class Table {
	
	    public static void main(String[] args) {
	    	Scanner input = new Scanner(System.in);
	    	System.out.println("Enter the number");
	        int n = input.nextInt();
	        for(int i = 1; i <= 10; ++i)
	        {
	            System.out.printf("%d * %d = %d \n", n, i, n * i);
	        }
	    }
	}

