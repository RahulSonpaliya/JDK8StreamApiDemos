package com.example;

import java.util.ArrayList;

/**
 * In this example we will be using multiple JDK8 Stream API functions to
 * fulfill certain requirement
 * 
 * Say you've a ArrayList which contains some String values, that may be null
 * and duplicate Strings are also present in the list & our requirement is to
 * filter out all the duplicate and null values and after filtering we also need
 * to sort the items in ascending order & than print their capitalize values
 */
public class ComplexUseCase1 {

	public static void main(String[] args) {
		var list = new ArrayList<String>();
		list.add("a");
		list.add("b");
		list.add("c");
		list.add(null);
		list.add("a");
		list.add("b");
		list.add("d");
		list.add(null);
		list.add("e");

		list.stream().distinct().filter(x -> x != null).map(x -> x.toUpperCase()).sorted().forEach(System.out::println);
	}

}
