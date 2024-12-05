package com.example;

import java.util.ArrayList;

/**
 * To get first element from a stream, we can use "findFirst" function of JDK8 Stream API
 * 
 * To get any element from a stream, we can use "findAny" function of JDK8 Stream API
 */
public class FindFuncDemo {

	public static void main(String[] args) {
		var list1 = new ArrayList<String>();
		list1.add("A");
		list1.add("B");
		list1.add("C");
		list1.add("A");
		list1.add("B");
		list1.add("D");
		list1.add("E");
		
		System.out.println(list1.stream().findFirst().get());
		
		// In most of the cases findAny will always return the first element, but we can't guarantee it
		System.out.println(list1.stream().findAny().get());
	}
	
}
