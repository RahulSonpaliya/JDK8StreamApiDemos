package com.example;

import java.util.Arrays;

/**
 * In some cases we need to filter out some elements of an array based on certain conditions,
 * using "filter" function of JDK8 Stream API, we can easily filter out a stream of elements
 * via any condition that we call as "predicate"
 */
public class FilterFuncDemo {

	public static void main(String[] args) {
		int[] a = {1, 2, 3, 4, 5, 6, 7, 8};
		
		// filter out all the even integers for array, without using JDK8 Stream API
		for (int i = 0; i < a.length; i++) {
			if(a[i] % 2 == 0) {
				System.out.println(a[i]);
			}
		}
		
		// filter out all the even integers for array, using "filter" function of JDK8 Stream API
		Arrays.stream(a).filter(x -> x % 2 == 0).forEach(System.out::println);
	}
}
