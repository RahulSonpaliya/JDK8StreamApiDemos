package com.example;

import java.util.Arrays;

/**
 * To calculate average of all elements of an array, we can use "average" function of JDK8 Stream API
 */
public class AverageFuncDemo {

	public static void main(String[] args) {
		int[] a = {10, 20, 30};
		
		// without using JDK8 Stream API
		int sum = 0;
		for (int i = 0; i < a.length; i++) {
			sum += a[i];
		}
		var average = sum / a.length;
		System.out.println("Average = " + average);
		
		// using "average" function of JDK8 Stream API
		System.out.println("Average = " + Arrays.stream(a).average().getAsDouble());
	}
}
