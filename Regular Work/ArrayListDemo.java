package com.cts.regularWork;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.ListIterator;

public class ArrayListDemo {
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList();
		// List l =new ArrayList();
		list.add("hello");
		list.add("to");
		list.add("java");
		list.add("batch");
		list.add("7");
		list.add("true");

		System.out.println("Unsorted"+list);
		Collections.sort(list);
		System.out.println("Sorted"+list);
		/*
		 * list.add("3, aplle"); list.remove(4); System.out.println(list.contains("7"));
		 */
		ListIterator<String> it = list.listIterator();

		System.out.println("Forward");
		while (it.hasNext()) {
			String element = it.next();
			System.out.println(element);
			if (element.contentEquals("java")) {
				break;
			}
		}

		System.out.println("Backward");
		while (it.hasPrevious()) {
			String element = it.previous();
			System.out.println(element);
		}

		/*
		 * for (String o : list) {
		 * 
		 * System.out.println(o); if (o.equals("batch")) { break; } }
		 */
		
	}

}
