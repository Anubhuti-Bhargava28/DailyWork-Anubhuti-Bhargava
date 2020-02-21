package com.cts.Questions;

import java.util.Scanner;

public class SelectionSort {

    public static void main(String[] args) 
    {
        int n;
        String temp;
        Scanner s = new Scanner(System.in);
       
       
        Scanner s1 = new Scanner(System.in);
        System.out.println("Enter your string:");
      
          String y = s.nextLine();
          int l= y.length();
          String names[] = y.split("\\s");
 

        	  for (int i = 0; i < names.length; i++) 
              {
                  for (int j = i + 1; j < names.length; j++) 
                  {
                      if (names[i].compareTo(names[j])>0) 
                      {
                          temp = names[i];
                          names[i] = names[j];
                          names[j] = temp;
                      }
                  }
              }
        System.out.print(" Sorted Order Of String:");
        for (int k = 0; k < names.length - 1; k++) 
        {
            System.out.print(names[k]);
        }
        System.out.print(names[names.length - 1]);
    }
}



