package com.example;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * MapOperationsDemo demonstrates various examples we can perform on "Map" using JDK8 Stream API
 */
public class MapOperationsDemo {

	public static void main(String[] args) {
		Map<Integer, String> testMap = new HashMap<Integer, String>();
		testMap.put(2, "B");
		testMap.put(3, "C");
		testMap.put(1, "A");
		testMap.put(4, "D");
		
		// Example to get all keys from a map
		testMap.keySet().stream().forEach(System.out::println);
		
		// Example to get all values from a map
		testMap.values().stream().forEach(System.out::println);
		
		// Example to get all entries (key & value) from a map
		testMap.entrySet().stream().forEach(System.out::println);
		
		// Example to sort map data based on key in ascending order
		testMap.entrySet().stream().sorted(Map.Entry.comparingByKey()).forEach(System.out::println);
		
		// Example to sort map data based on key in descending order
		testMap.entrySet().stream().sorted(Map.Entry.comparingByKey(Collections.reverseOrder())).forEach(System.out::println);
		
		// Example to sort map data based on value in ascending order
		testMap.entrySet().stream().sorted(Map.Entry.comparingByValue()).forEach(System.out::println);
		
		// Example to sort map data based on value in descending order
		testMap.entrySet().stream().sorted(Map.Entry.comparingByValue(Collections.reverseOrder())).forEach(System.out::println);
	}
	
}
