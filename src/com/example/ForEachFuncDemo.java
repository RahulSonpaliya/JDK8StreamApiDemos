package com.example;

import java.util.Arrays;

/**
 * To iterate over an array, we can use "forEach" function of JDK8 Stream API
 */
public class ForEachFuncDemo {

	public static void main(String[] args) {
		int[] a = {10, 20, 30};
		
		// without using JDK8 Stream API
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
		
		// using "forEach" function of JDK8 Stream API
		Arrays.stream(a).forEach((e) -> {
			System.out.println(e);
		});
		
		// in "forEach" function, for some straight forward operation
		// we can directly use method references, like below
		Arrays.stream(a).forEach(System.out::println);
	}
}
