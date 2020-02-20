package com.cts.regularWork;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.LinkedHashMap;
import java.util.Map.Entry;
import java.util.TreeMap;

public class MapDemo {

	public static void main(String[] args) {

		/*
		 * HashMap<String, Integer> map = new HashMap<>(); map.put("Banana", 40);
		 * map.put("Watermelon", 70); map.put("Orange", 30); map.put("Mango", 57);
		 * map.put("Chiku", 45); map.put("Banana", 970); // override new value
		 * map.put("Apple", 90); // System.out.println(map); //
		 * System.out.println(map.get("Banana")); //reteieve the value at particular key
		 * map.remove("Apple"); System.out.println(map.containsKey("Chiku"));
		 * System.out.println(map.isEmpty()); System.out.println(map.size());
		 * map.replace("Banana", 970, 40); //System.out.println(map);
		 * 
		 * for(Entry<String, Integer> entry: map.entrySet()) {
		 * System.out.println(entry.getKey()+" and value ");
		 * System.out.println(entry.getValue());
		 */

		/*
		 * LinkedHashMap<String, Integer> map = new LinkedHashMap<>(); map.put("Banana",
		 * 40); map.put("Watermelon", 70); map.put("Orange", 30); map.put("Mango", 57);
		 * map.put("Chiku", 45); map.put("Banana", 970); // override new value
		 * map.put("Apple", 90); System.out.println(map); //
		 * System.out.println(map.get("Banana")); //reteieve the value at particular key
		 * map.remove("Apple"); System.out.println(map.containsKey("Chiku"));
		 * System.out.println(map.isEmpty()); System.out.println(map.size());
		 * map.replace("Banana", 970, 40); //System.out.println(map);
		 * 
		 * for(Entry<String, Integer> entry: map.entrySet()) {
		 * System.out.println(entry.getKey()+" and value ");
		 * System.out.println(entry.getValue());
		 */

		/*Hashtable<String, Integer> map = new Hashtable<>();
		map.put("Banana", 40);
		map.put("Watermelon", 70);
		map.put("Orange", 30);
		map.put("Mango", 57);
		map.put("Chiku", 45);
		map.put("Banana", 970); // override new value
		map.put("Apple", 90);
		//map.put(Null,0);
		//map.put("Watetr",null);
		System.out.println(map);
		// System.out.println(map.get("Banana")); //reteieve the value at particular key
		/*map.remove("Apple");
		System.out.println(map.containsKey("Chiku"));
		System.out.println(map.isEmpty());
		System.out.println(map.size());
		map.replace("Banana", 970, 40);
		// System.out.println(map);

		for (Entry<String, Integer> entry : map.entrySet()) {
			System.out.println(entry.getKey() + " and value ");
			System.out.println(entry.getValue());*/
		
	
		TreeMap<String, Integer> map = new TreeMap<>();
		map.put("Banana", 40);
		map.put("Watermelon", 70);
		map.put("Orange", 30);
		map.put("Mango", 57);
		map.put("Chiku", 45);
		map.put("Banana", 970); // override new value
		map.put("Apple", 90);
		//map.put(Null,0);
		//map.put("Watetr",null);
		System.out.println(map);
	
	
	}

	}

