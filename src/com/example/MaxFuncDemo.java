package com.example;

import java.util.Arrays;

/**
 * To get maximum element from an array, we can use "max" function of JDK8 Stream API
 */
public class MaxFuncDemo {

	public static void main(String[] args) {
		int[] a = {3, 6, 2, 9, 1, 8};
		
		// without using JDK8 Stream API
		int max = a[0];
		for (int i = 1; i < a.length; i++) {
			if(a[i] > max) {
				max = a[i];
			}
		}
		System.out.println("Maximum = " + max);
		
		// using "max" function of JDK8 Stream API
		System.out.println("Maximum = " + Arrays.stream(a).max().getAsInt());
	}
}
