package com.cts.task;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class SetDemo {
public static void main(String[] args) {
	
	Map<Integer, String> map=new HashMap<>();
	map.put(343434, "Rahul$$");
	map.put(33, "kartik2$");
	map.put(332321, "dff%kyt$");
	map.put(33343, "^&eeesk&$");
	//System.out.println(map);
	
	  for(Entry<Integer, String> entry: map.entrySet()) {
		 System.out.print(entry.getKey()+" and value ");
		  System.out.println(""+entry.getValue()); 
}
}
}
