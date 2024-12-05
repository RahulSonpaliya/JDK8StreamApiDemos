package com.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

/**
 * To convert stream into List/Set/Map collections object, we can use "collect" function of JDK8 Stream API
 */
public class CollectFuncDemo {

	public static void main(String[] args) {
		var list1 = new ArrayList<String>();
		list1.add("A");
		list1.add("B");
		list1.add("C");
		list1.add("A");
		list1.add("B");
		list1.add("D");
		list1.add("E");
		
		List<String> uniqueItemsFromList1 = list1.stream().distinct().collect(Collectors.toList());
		System.out.println(uniqueItemsFromList1);
	}
	
}
