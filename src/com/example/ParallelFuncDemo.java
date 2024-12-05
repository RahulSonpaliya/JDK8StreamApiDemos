package com.example;

import java.util.Arrays;

/**
 * There are 2 types of stream named as "sequential" & "parallel" stream, to know if stream is 
 * "parallel" we use "isParallel" function of JDK8 Stream API.
 * 
 * In "sequential" stream every element is processed sequentially means 1 by 1
 * In "parallel" stream, the stream is divided into sub-streams and than each stream is 
 * processed independently 
 */
public class ParallelFuncDemo {

	public static void main(String[] args) {
		int[] a = {3, 6, 2, 9, 1, 8};
		System.out.println("Is Parallel Stream = " + Arrays.stream(a).isParallel());
		
		//To make parallel stream, use "parallel" function
		System.out.println("Is Parallel Stream = " + Arrays.stream(a).parallel().isParallel());
	}
}
