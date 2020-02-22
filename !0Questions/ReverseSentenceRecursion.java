package com.cts.Questions;
import java.util.*;
public class ReverseSentenceRecursion {
	 public static String reverse(String sen)
	    {
	        if (sen.isEmpty())
	            return sen;

	        return reverse(sen.substring(1)) + sen.charAt(0);
	    }

	    public static void main(String[] args) {
	    	Scanner sc = new Scanner(System.in);
	    	System.out.println("Enetr String to reverse: ");
	        String sen = sc.nextLine();
	        String rev = reverse(sen);
	        System.out.println("The reversed sentence is: " + rev);
	    }

	   
	}
