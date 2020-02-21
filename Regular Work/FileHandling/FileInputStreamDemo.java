package com.cts.regularWork.FileHandling;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileInputStreamDemo {
	public static void main(String[] args) throws FileNotFoundException, IOException {
		String path = "C:\\Users\\seed\\Desktop\\Java\\data.txt";
		String newPath ="C:\\Users\\seed\\Desktop\\Java\\copy.txt";
		File file = new File(path);
		/*
		 * System.out.println(file.canExecute()); System.out.println(file.canRead());
		 * System.out.println(file.canWrite()); System.out.println("File Name: " +
		 * file.getName());
		 */
		
		FileInputStream in = new FileInputStream(file);
		BufferedInputStream bin = new BufferedInputStream(in);
		FileOutputStream out = new FileOutputStream(newPath);
		BufferedOutputStream bout = new BufferedOutputStream(out);
	
		int i;
		while((i = bin.read()) != -1) {
			//System.out.print((char)i); //explicity type casting;
		bout.write(i);
		
		}
		bout.close();
		
	}
}
