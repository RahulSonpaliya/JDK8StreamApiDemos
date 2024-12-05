package com.example;

import java.util.Arrays;

/**
 * To find no. of items of an array, we can use "count" function of JDK8 Stream API
 */
public class CountFuncDemo {

	public static void main(String[] args) {
		int[] a = {10, 20, 30};
		
		// without using JDK8 Stream API
		System.out.println(a.length);
		
		// using "count" function of JDK8 Stream API
		long count = Arrays.stream(a).count();
		System.out.println(count);
	}
	
}
