package com.cts.task;

public class StringPrefixTen {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 String[] s= {"100","111","10100","10","1111"};
		 int l = s.length;
		 int count=0;
		 
		 for(int i = 0; i<l; i++) {
			 String y=s[i];
			 boolean z = y.startsWith("10");
			 
			 if( z && y !="10") {
				 count++;
				 
			 }
			 
		 }
		 System.out.println(count);
	}

}
