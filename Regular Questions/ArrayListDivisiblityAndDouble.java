package com.cts.task;

import java.util.ArrayList;
import java.util.Collections;
import java.util.ListIterator;

public class ArrayListDivisiblityAndDouble {

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList();
		// List l =new ArrayList();
		list.add(20);
		list.add(40);
		list.add(50);
		list.add(60);
		list.add(74);
		list.add(33);

		ListIterator<Integer> it = list.listIterator();
		ListIterator<Integer> it2 = list.listIterator();

		System.out.println("Elements Divisible by 3 & 5: ");
		while (it.hasNext()) {
			int element = it.next();

			if (element % 3 == 0 || element % 5 == 0) {
				System.out.print(element + " ");
			}

		}System.out.println(" ");
		System.out.println("List After Doubling the elements");
		while (it2.hasNext()) {
			int element = it2.next();
			System.out.print(element * 2+" ");
		}

	}

}
