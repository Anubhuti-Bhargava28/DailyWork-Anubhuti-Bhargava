package com.cts.task;

public class Series {
public static void main(String[] args) {
	int num= 40,temp;
	for(int i=0 ;i<10;i++) {
		if(i%2==0 || i==0 ) {
			 temp= num;
		temp= temp-4;
		num=temp;
		System.out.print(temp+" ");
	}
	else
	{
		temp=num;
		temp= temp - 2;
		num=temp;
		System.out.print(temp+ " ");
	}
}
	}
}
