package com.cts.task;

import java.io.FileReader;
import java.io.IOException;

public class HandleOnlyTryCatch {
	public void readData() throws IOException{
		FileReader fr = new FileReader("emp.Data.txt");
		
 		int i = fr.read();
 		System.out.println("Hi"+i);
	} 
	public void task2() throws IOException{
		readData();
	}
	public static void main(String[] args) throws IOException {
		
		HandleOnlyTryCatch hd= new HandleOnlyTryCatch();
		//hd.task2();
		try {
			hd.task2();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("End of main");
	
	String pass=null;
	if(pass.isEmpty())
	{
		System.out.println("empty");
	}
	else {
		System.out.println("not");
	}
	}
	
	
	

}
