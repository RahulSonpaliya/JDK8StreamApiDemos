package com.example;

import java.util.ArrayList;

/**
 * "anyMatch" function of JDK8 Stream API returns true if the stream contains any element
 * that matches the given predicate
 * 
 * "allMatch" function of JDK8 Stream API returns true if all elements of stream matches
 * the given predicate
 * 
 * "noneMatch" function of JDK8 Stream API returns true if the stream doesn't contains any element
 * that matches the given predicate
 */
public class MatchFuncDemo {

	public static void main(String[] args) {
		var list1 = new ArrayList<String>();
		list1.add("A");
		list1.add("B");
		list1.add("C");
		list1.add("A");
		list1.add("B");
		list1.add("D");
		list1.add("E");
		
		System.out.println(list1.stream().anyMatch(x -> x.equals("A")));
		
		System.out.println(list1.stream().allMatch(x -> x.equals("A")));
		
		System.out.println(list1.stream().noneMatch(x -> x.equals("M")));
	}
	
}
