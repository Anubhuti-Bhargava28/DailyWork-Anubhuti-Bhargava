package com.cts;
import java.util.*;

public class FibbonniciSeries {

	
	    public static void main(String[] args) {
	    	System.out.println("Enter the last term for fibbonniccci series");
	    	Scanner  input= new Scanner(System.in);
	    	
	    	int n  = input.nextInt();
	    	 int sum=0;
	        int i = 1, t1 = 0, t2 = 1;
	        System.out.print("First " + n + " terms: ");
	        while (i <= n)
	        {
	            System.out.print(t1 + " + ");
	            sum = t1 + t2;
	            t1 = t2;
	            t2 = sum;
	            i++;
	        }
	        System.out.println("Sum of fibboniiccci series is: "  + sum);
	    }
	}

