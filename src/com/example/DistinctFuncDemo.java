package com.example;

import java.util.ArrayList;

/**
 * To remove duplicate items from array, we can use "distinct" function of JDK8 Stream API
 * 
 * "removeDuplicatesManually" method in this program illustrates how we can remove duplicate
 *  items from array without using JDK Stream API
 *  
 * "removeDuplicatesViaStreamApi" method uses "distinct" function of JDK8 Stream API, to remove 
 * duplicate items from array
 */
public class DistinctFuncDemo {

	public static void main(String[] args) {
		var list1 = new ArrayList<String>();
		list1.add("A");
		list1.add("B");
		list1.add("C");
		list1.add("A");
		list1.add("B");
		list1.add("D");
		list1.add("E");
		
		removeDuplicatesViaStreamApi(list1);
	}
	
	private static void removeDuplicatesViaStreamApi(ArrayList<String> list1) {
		var uniqueItems = list1.stream().distinct().toList();
		System.out.println(uniqueItems);
	}
	
	private static void removeDuplicatesManually(ArrayList<String> list1) {
		var uniqueItems = new ArrayList<String>();
		for (int i = 0; i < list1.size(); i++) {
			var item = list1.get(i);
			if(!uniqueItems.contains(item)) {
				uniqueItems.add(item);
			}
		}
		System.out.println(uniqueItems);
	}
	
}
