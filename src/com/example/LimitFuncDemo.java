package com.example;

import java.util.ArrayList;

/**
 * To restrict/truncate no. of items of a stream, we can use "limit" function of JDK8 Stream API
 */
public class LimitFuncDemo {

	public static void main(String[] args) {
		var list = new ArrayList<String>();
		list.add("a");
		list.add("b");
		list.add("c");
		list.add("d");
		list.add("e");

		// here limit(2) function will return a stream which contains 2 elements
		list.stream().limit(2).forEach(System.out::println);
	}

}
