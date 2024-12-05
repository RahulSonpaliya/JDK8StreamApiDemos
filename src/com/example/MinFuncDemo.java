package com.example;

import java.util.Arrays;

/**
 * To get minimum element from an array, we can use "min" function of JDK8 Stream API
 */
public class MinFuncDemo {

	public static void main(String[] args) {
		int[] a = {3, 6, 2, 9, 1, 8};
		
		// without using JDK8 Stream API
		int min = a[0];
		for (int i = 1; i < a.length; i++) {
			if(a[i] < min) {
				min = a[i];
			}
		}
		System.out.println("Minimum = " + min);
		
		// using "min" function of JDK8 Stream API
		System.out.println("Minimum = " + Arrays.stream(a).min().getAsInt());
	}
}
