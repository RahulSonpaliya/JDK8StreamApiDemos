package com.example;

import java.util.Arrays;

/**
 * To calculate sum of all elements of an array, we can use "sum" function of JDK8 Stream API
 */
public class SumFuncDemo {

	public static void main(String[] args) {
		int[] a = {10, 20, 30};
		
		// without using JDK8 Stream API
		int sum = 0;
		for (int i = 0; i < a.length; i++) {
			sum += a[i];
		}
		System.out.println("Sum = " + sum);
		
		// using "sum" function of JDK8 Stream API
		System.out.println("Sum = " + Arrays.stream(a).sum());
	}
}
