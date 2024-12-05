package com.example;

import java.util.Arrays;
import java.util.stream.Collectors;

/**
 * To sort an array, we can use "sorted" function of JDK8 Stream API
 */
public class SortedFuncDemo {

	public static void main(String[] args) {
		int[] a = {3, 6, 2, 9, 1, 8};
		
		/**
		 * using "sorted" function of JDK8 Stream API
		 * here "sorted" is followed by "forEach" where we are using method reference
		 * to print each item
		 */
		Arrays.stream(a).sorted().forEach(System.out::println);
		
		/**
		 * As the stream is actually not manipulating the original array, we can get the sorted array
		 * by using ".boxed().collect(Collectors.toList())"
		 * The boxed method converts the int primitive values of an IntStream (produced by "sorted")
		 * into a stream of Integer objects. The word "boxing" names the int ⬌ Integer conversion process.
		 */
		var sortedArray = Arrays.stream(a).sorted().boxed().collect(Collectors.toList());
		
		/**
		 * there are several options to do sorting of array without using JDK8 Stream API
		 * one of them would be using "Arrays.sort" method
		 * one important lesson to note here is that "Arrays.sort" is
		 * actually manipulates the original array
		 */
		Arrays.sort(a);
		// from now onwards a = {1, 2, 3, 6, 8, 9}
		
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
	}
}
