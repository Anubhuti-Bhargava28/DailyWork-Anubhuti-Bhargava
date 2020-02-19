package com.cts;
import java.util.*;
public class Ascii {

	
	    public static void main(String[] args) {
	        Scanner input = new Scanner(System.in);
	        System.out.println("Eneter the Character:");
	        char c= input.next().charAt(0);
	    	
	      
	        int cast = (int) c;
	        System.out.println("The ASCII value of " + c + " is: " + cast);
	    }
	}
