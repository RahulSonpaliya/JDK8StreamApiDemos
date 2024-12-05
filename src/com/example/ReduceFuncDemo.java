package com.example;

import java.util.ArrayList;

/**
 * To reduce all the elements to single element, we can use "reduce" function of JDK8 Stream API
 */
public class ReduceFuncDemo {

	public static void main(String[] args) {
		var list = new ArrayList<Integer>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);

		/**
		 * here reduce function will reduce all the elements of "list" into single element by
		 * adding them together
		 */
		System.out.println(list.stream().reduce((a, b) -> a + b).get());
	}

}
