package com.cts.regularWork.FileHandling;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.FileNotFoundException;

public class FileOutputStreamDemo {

	public static void main(String[] args)  throws FileNotFoundException, IOException{
	String path="C:\\Users\\seed\\Desktop\\Java\\data.text";
	FileOutputStream out= new FileOutputStream(path, true); // to append data
String message = " javaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa";
byte b[]= message.getBytes();
out.write(b);
out.close();

	}

}
