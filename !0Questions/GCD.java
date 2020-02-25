package com.cts.Questions;
import java.util.*;
public class GCD {

	
	    public static void main(String[] args) {
	    	Scanner input = new Scanner(System.in);
	    	System.out.println("Enter two no.");
	    	int n1 = input.nextInt();
	    	int n2 = input.nextInt();
	        int  gcd = 1;
	        for(int i = 1; i <= n1 && i <= n2; ++i)
	        {
	            
	            if(n1 % i==0 && n2 % i==0)
	                gcd = i;
	        }
	        System.out.printf("G.C.D of %d and %d is %d", n1, n2, gcd);
	    }
	}
