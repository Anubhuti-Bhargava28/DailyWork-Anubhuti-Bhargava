package com.cts.Questions;
import java.util.*;
public class LargestNumber {
	
	    public static void main(String[] args) {
	    	Scanner input = new Scanner(System.in);
	    	System.out.println("ENTER THREE NUMBERS TO FIND LARGEST");
	    	double n1 = input.nextDouble();
	        		
	        double n2 = input.nextDouble();
	        double n3 = input.nextDouble();
	        if( n1 >= n2 && n1 >= n3)
	            System.out.println(n1 + " is the largest number.");
	        else if (n2 >= n1 && n2 >= n3)
	            System.out.println(n2 + " is the largest number.");
	        else
	            System.out.println(n3 + " is the largest number.");
	    }
	}

