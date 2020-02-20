package com.cts.regularWork;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.TreeSet;
import java.util.Iterator;
import java.util.LinkedHashSet;

public class SetDemo {
	public static void main(String[] args) {
		/*
		 * HashSet<String> set = new HashSet<>(); // List l =new ArrayList();
		 * set.add("hello"); set.add("to"); set.add("java"); set.add("batch");
		 * set.add("7"); set.add("true");
		 * 
		 * 
		 * /* list.add("3, aplle"); list.remove(4);
		 * System.out.println(list.contains("7"));
		 */
		/*
		 * Iterator<String> it = set.iterator();
		 * 
		 * System.out.println("Forward"); while (it.hasNext()) { String element =
		 * it.next(); System.out.println(element);
		 * 
		 * }
		 */

		/*
		 * LinkedHashSet<String> set = new LinkedHashSet<>(); // List l =new
		 * ArrayList(); set.add("hello"); set.add("to"); set.add("java");
		 * set.add("batch"); set.add("7"); set.add("true");
		 * 
		 * Iterator<String> it = set.iterator();
		 * 
		 * System.out.println("Forward"); while (it.hasNext()) { String element =
		 * it.next(); System.out.println(element);
		 * 
		 * }
		 */

		TreeSet<String> set = new TreeSet<>(); // List l =new ArrayList();
		set.add("hello");
		set.add("to");
		set.add("java");
		set.add("batch");
		set.add("7");
		set.add("true");

		/*
		 * list.add("3, aplle"); list.remove(4); System.out.println(list.contains("7"));
		 */

		Iterator<String> it = set.iterator();

		System.out.println("Forward");
		while (it.hasNext()) {
			String element = it.next();
			System.out.println(element);

		}

	}
}
