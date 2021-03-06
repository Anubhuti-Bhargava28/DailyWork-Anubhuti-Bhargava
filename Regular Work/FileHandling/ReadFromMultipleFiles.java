package com.cts.regularWork.FileHandling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.SequenceInputStream;
import java.util.Enumeration;
import java.util.Vector;

public class ReadFromMultipleFiles {

	public static void main(String[] args) throws FileNotFoundException, IOException {
		// TODO Auto-generated method stub
		String path1 = "C:\\Users\\seed\\Desktop\\Java\\cse.txt";
		String path2 = "C:\\Users\\seed\\Desktop\\Java\\data.txt";
		String path3 = "C:\\Users\\seed\\Desktop\\Java\\ec.txt";
		String path4 = "C:\\Users\\seed\\Desktop\\Java\\ex.txt";
		String path5 = "C:\\Users\\seed\\Desktop\\Java\\ce.txt";

		FileInputStream fin1 = new FileInputStream(path1);
		FileInputStream fin2 = new FileInputStream(path2);
		FileInputStream fin3 = new FileInputStream(path3);
		FileInputStream fin4 = new FileInputStream(path4);
		FileInputStream fin5 = new FileInputStream(path5);
		
		Vector vector = new Vector();
		vector.add(fin1);
		vector.add(fin2);
		vector.add(fin3);
		vector.add(fin4);
		vector.add(fin5);
		
		Enumeration en =vector.elements();
		 
		SequenceInputStream sis = new SequenceInputStream(en);
		int i;
		while ((i = sis.read()) != -1) {
			System.out.print((char) i);
		}

	}
}
