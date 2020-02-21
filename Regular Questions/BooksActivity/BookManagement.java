package com.cts.task.BooksActivity;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.SequenceInputStream;
import java.util.List;
import java.util.Scanner;

public class BookManagement {
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int continue_loop = 1;

		do {
			System.out.println("Enter your Choice");
			System.out.println("Enter 1 : Insert book Details");
			System.out.println("Enter 2 : Display book Details");
			int num = sc.nextInt();

			switch (num) {
			case 1:
				System.out.println("Enter Book Name");
				String bname = br.readLine();
				String q= "Book Name: "+bname+" "; 
				System.out.println("Enter Author Name");
				String aname = br.readLine();
				String j= "Author Name: "+aname+" ";
				System.out.println("Enter Book Price");
				int price = sc.nextInt();
				
				String pr = Integer.toString(price);
				String u= "Price: "+pr+".";
				String path = "C:\\Users\\seed\\Desktop\\bookData.txt";
				FileOutputStream out = new FileOutputStream(path, true); // The true will writ after the existing
																			// content of
																			// the file
		
				byte b1[] = q.getBytes(); // string message is converted into byte array because we are using byte
												// stream
				byte b2[] = j.getBytes();
				byte b3[] = u.getBytes();
				out.write(b1);
				out.write(b2);
				out.write(b3);
				out.close();
				System.out.println("Do yo want to continue if yes press 1 else press 0");
				int r = Integer.parseInt(br.readLine());
				if (r == 1)
					continue_loop = 1;
				else {
					continue_loop = 0;
				System.out.println("Closed");
				}
				break;
			case 2:
				String path1 = "C:\\Users\\seed\\Desktop\\bookData.txt";

				FileInputStream in1 = new FileInputStream(path1);

				int i;
				while ((i = in1.read()) != -1) {
					if( i == 46)
					{
						System.out.print("\n");
					}
					else
						
					System.out.print((char)i);
					
				}
				System.out.println("\n" +"Do yo want to continue if yes press 1 else press 0");
				int o = Integer.parseInt(br.readLine());
				if (o == 1)
					continue_loop = 1;
				else
				{	continue_loop = 0;
				System.out.println("Closed");
				}break;
			default:
				System.out.println("Invalid input");
				break;
			}
		} while (continue_loop != 0);

	}
}
