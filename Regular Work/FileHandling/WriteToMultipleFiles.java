package com.cts.regularWork.FileHandling;

import java.io.ByteArrayOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class WriteToMultipleFiles {

	public static void main(String[] args) throws FileNotFoundException,IOException {
		String path1 = "C:\\Users\\seed\\Desktop\\Java\\cse.txt";
		String path2 = "C:\\Users\\seed\\Desktop\\Java\\it.txt";
		String path3 = "C:\\Users\\seed\\Desktop\\Java\\ec.txt";
		String path4 = "C:\\Users\\seed\\Desktop\\Java\\ex.txt";
		String path5 = "C:\\Users\\seed\\Desktop\\Java\\ce.txt";

		FileOutputStream out1 = new FileOutputStream(path1);
		FileOutputStream out2 = new FileOutputStream(path2);
		FileOutputStream out3 = new FileOutputStream(path3);
		FileOutputStream out4 = new FileOutputStream(path4);
		FileOutputStream out5 = new FileOutputStream(path5);

		ByteArrayOutputStream bout = new ByteArrayOutputStream();
		
		String data = "This is a common message to returm";
		
		byte[] b=data.getBytes();
		
		bout.write(b);
		
		bout.writeTo(out1);
		bout.writeTo(out2);
		bout.writeTo(out3);
		bout.writeTo(out4);
		bout.writeTo(out5);
	}

}
