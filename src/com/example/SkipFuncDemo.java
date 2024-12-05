package com.example;

import java.util.ArrayList;

/**
 * To discard no. of items of a stream, we can use "skip" function of JDK8 Stream API
 */
public class SkipFuncDemo {

	public static void main(String[] args) {
		var list = new ArrayList<String>();
		list.add("a");
		list.add("b");
		list.add("c");
		list.add("d");
		list.add("e");

		// here skip(2) function will return a stream that will not contain first 2 elements
		list.stream().skip(2).forEach(System.out::println);
	}

}
