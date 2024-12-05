package com.example;

import java.util.ArrayList;

/**
 * To convert any Collection into array, we can use "toArray" function of JDK8 Stream API
 */
public class ToArrayFuncDemo {

	public static void main(String[] args) {
		var list = new ArrayList<Integer>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);

		/**
		 * here toArray function will convert "list" which is an ArrayList to Object array
		 */
		Object[] arrObj = list.stream().toArray();
	}

}
