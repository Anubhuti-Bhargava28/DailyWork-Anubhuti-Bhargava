package com.cts.Questions;
import java.util.*;
public class SingleDigitSumCount {

	public static void main(String[] args) {
		  Scanner sc = new Scanner(System.in);
		  System.out.println("Enter number");
		  int  n = sc.nextInt();
		  int sum=0,count =1;
				  while(n > 0 || sum > 9) 
		    { 
		        if(n == 0) 
		        {       count++;
		            n = sum; 
		            sum = 0; 
				  
		         
		        } 
		   
		        sum  =sum + n % 10; 
		        n = n  / 10; 

		    } 
		    System.out.println(count);
	}

}
