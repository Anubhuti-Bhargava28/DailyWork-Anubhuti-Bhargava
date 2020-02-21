package com.cts.task;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;

public class SearchWord {

	public static void main(String[] args) throws FileNotFoundException, IOException {

		String path = ("C:\\Users\\seed\\Desktop\\Java\\data.txt");
		File f1 = new File(path);
		String[] word = null;
		FileReader f = new FileReader(f1);
		BufferedReader b = new BufferedReader(f);
		String s;
		String input = "cts";
		int count = 0;
		while ((s = b.readLine()) != null) {
			word = s.split(" ");
			for (String words : word) {
				if (words.equals(input)) {
					count++;
				}
			}
		}
		if (count != 0) {
			System.out.println("Number of times " + count);
		} else {
			System.out.println("The given word is not present in the file");
		}

		f.close();
	}
}
