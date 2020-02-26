package com.cts.regularWork.serialization;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class SerializationDemo {

	public static void serialize(Employee employee, String path) {
		try {
			FileOutputStream fout = new FileOutputStream(path);
			BufferedOutputStream bout = new BufferedOutputStream(fout);

			ObjectOutputStream oos = new ObjectOutputStream(bout);
			oos.writeObject(employee);
			oos.close();
			bout.close();
			fout.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static Object deserialize(String filePath) {
		try {
			FileInputStream fin = new FileInputStream(filePath);
			BufferedInputStream bin = new BufferedInputStream(fin);
			ObjectInputStream oin = new ObjectInputStream(bin);
			Object obj = oin.readObject();
			oin.close();
			
			return obj;
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		
		}
		return null;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Employee employee = new Employee(1, "Anub", "fsfsfsf", 23, 3435446, "doctor",
		 * 43534554); serialize(employee, "employee.txt");
		 * System.out.println("Obejxct saved successfully");
		 */	
	Employee employee = (Employee)deserialize("employee.txt");
	System.out.println(employee);
	
	}

}
