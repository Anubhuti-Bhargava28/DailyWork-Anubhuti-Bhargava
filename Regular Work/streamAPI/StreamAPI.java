package com.cts.regularWork.streamAPI;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamAPI {

	public static void main(String[] args) {

		ArrayList<String> names = new ArrayList<>();
		addNames(names);
		System.out.println(names);
		// 1. Print names with length more than 6
		List<String> namesList6 = names.stream().filter(s -> s.length() > 6).collect(Collectors.toList());
		System.out.println(namesList6);
		System.out.println("****Names with greater than 6 length****");
		namesList6.forEach(System.out::println);

		// 2. Names in UpperCase
		List<String> namesInUpper = names.stream().map(s -> s.toUpperCase()).collect(Collectors.toList());
		System.out.println("****Names with UpperCase****");
		namesInUpper.forEach(System.out::println);

		long count =names.stream().count();
		System.out.println("List count:"+ count);
		
		//3. Sort the list
		
		List<String> defaultSorted = names.stream().sorted().collect(Collectors.toList());
		System.out.println("Deafulkt SOrted");
		defaultSorted.forEach(System.out::println);
		
		//4. Custom Sorting
		
		List<String> customSorted = names.stream().sorted((s1,s2) -> -s1.compareTo(s2)).collect(Collectors.toList());
		System.out.println("Custom SOrted");
		customSorted.forEach(System.out::println);
		
		
		Stream<Integer> data = Stream.of(1,11,111,111,1111,1111111,11111,111111);
		System.out.println("Data Count: "+ data.count()); //data.fltter()
	
	Stream<String> languages = Stream.of("C","C++","Java","Python","Angular","JavaScript");
	

	//List<String> langLength = languages.filter(s -> s.length() > 4).collect(Collectors.toList());
	//langLength.forEach(System.out::println);
	
	List<String> langconcat = languages.map(s -> s.concat(" Programing")).collect(Collectors.toList());
	langconcat.forEach(System.out::println);
	
	}

	private static void addNames(ArrayList<String> names) {

		names.add("Anubhuti");
		names.add("Dheeraj");
		names.add("Pallavi");
		names.add("Purva");
		names.add("Ayushi");
		names.add("Jatin");

	}

}
